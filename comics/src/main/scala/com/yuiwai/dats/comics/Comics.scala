package com.yuiwai.dats.comics

sealed trait Comic {
  def isbn: String
  def title: String
  def author: Author
  def content: Content
  def publisher: Publisher
  def publishedAt: Date
}
final case class SingleComic(
  isbn: String,
  title: String,
  author: Author,
  content: Content,
  publisher: Publisher,
  publishedAt: Date) extends Comic
final case class SeriesComic(
  isbn: String,
  series: Series,
  number: Option[Int],
  content: Content,
  publishedAt: Date) extends Comic {
  lazy val title: String = series.title
  lazy val author: Author = series.author
  lazy val publisher: Publisher = series.publisher
}
final case class Series(title: String, author: Author, publisher: Publisher)
final case class Author(name: String, content: Content)
final case class Publisher(name: String)
final case class Date(year: Int, month: Int, day: Int)

// 作中の構成要素
sealed trait Element
final case class Character(name: String, content: Content) extends Element
final case class Item(name: String, content: Content) extends Element
final case class Vehicle() extends Element
final case class Organization(name: String) extends Element

// 関連
sealed trait Relation
final case class ComicAndAuthor(comic: Comic, author: Author, content: Content) extends Relation
final case class ComicAndElement(comic: Comic, element: Element, content: Content) extends Relation
final case class ElementAndElement(element1: Element, element2: Element, content: Content) extends Relation

sealed trait RelationType
case object HasRelation extends RelationType
case class CompositeRelationType(relationTypes: Set[RelationType])
// TODO 所属 belong, 登場 appear


// 何らかのコンテンツ
sealed trait Content
final case class Text(value: String) extends Content
case object NoContent extends Content

object Comics {

}
