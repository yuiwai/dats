package com.yuiwai.dats.comics

import scala.collection.SortedMap

sealed trait Comic {
  def isbn: String
  def title: Title
  def author: Author
  def content: Content
  def publisher: Publisher
  def publishedAt: Date
  def fullTitle: String
}
final case class Title(value: String) extends AnyVal
final case class SingleComic(
  isbn: String,
  title: Title,
  author: Author,
  content: Content,
  publisher: Publisher,
  publishedAt: Date) extends Comic {
  override def fullTitle: String = title.value
}
final case class SeriesComic(
  isbn: String,
  series: Series,
  number: Int,
  content: Content,
  publishedAt: Date) extends Comic {
  lazy val title: Title = series.title
  lazy val author: Author = series.author
  lazy val publisher: Publisher = series.publisher
  override def fullTitle: String = s"${title.value} ($number)"
}
final case class Series(title: Title, author: Author, publisher: Publisher)
final case class Author(name: String, content: Content)
final case class Publisher(name: String)
final case class Date(year: Int, month: Int, day: Int)
object Date {
  implicit def dateOrdering(implicit tplIntOrd: Ordering[(Int, Int, Int)]): Ordering[Date] =
    (x: Date, y: Date) => tplIntOrd.compare((x.year, x.month, x.day), (y.year, y.month, y.day))
}

trait Chronicle[T, D] {
  val items: SortedMap[T, D]
}

// 作中の構成要素
sealed trait Element
final case class Character(name: String, content: Content) extends Element
final case class Item(name: String, content: Content) extends Element
final case class Vehicle() extends Element
final case class Organization(name: String) extends Element
final case class Role(name: String) extends Element
final case class Event(name: String) extends Element

// 関連
sealed trait Relation
final case class ComicAndElement(comic: Comic, element: Element, content: Content) extends Relation
final case class TitleAndElement(title: Title, element: Element, content: Content) extends Relation
object TitleAndElement {
  def apply(series: Series, element: Element, content: Content): TitleAndElement =
    apply(series.title, element, content)
}
final case class ElementAndElement(element1: Element, element2: Element, content: Content) extends Relation

sealed trait RelationType
case object HasRelation extends RelationType
case class CompositeRelationType(relationTypes: Set[RelationType])
// TODO 所属 belong, 登場 appear


// 何らかのコンテンツ
sealed trait Content
final case class Text(value: String) extends Content
case object NoContent extends Content
