package com.yuiwai.dats.comics

sealed trait Comic {
  def isbn: String
  def title: Title,
  def author: Author
  def content: Content
  def publisher: Publisher
  def publishedAt: Date
}
final case class Title(value: String) extends AnyVal
final case class SingleComic(
  isbn: String,
  title: Title,
  author: Author,
  content: Content,
  publisher: Publisher,
  publishedAt: Date) extends Comic
final case class SeriesComic(
  isbn: String,
  series: Series,
  number: Int,
  content: Content,
  publishedAt: Date) extends Comic {
  lazy val title: Title = series.title
  lazy val author: Author = series.author
  lazy val publisher: Publisher = series.publisher
}
final case class Series(title: Title, author: Author, publisher: Publisher)
final case class Author(name: String, content: Content)
final case class Publisher(name: String)
final case class Date(year: Int, month: Int, day: Int)

// 作中の構成要素
sealed trait Element
final case class Character(name: String, content: Content) extends Element
final case class Item(name: String, content: Content) extends Element
final case class Vehicle() extends Element
final case class Organization(name: String) extends Element
final case class Role(name: String) extends Element

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


object Comics {
  // Authors
  val TsutomNihei = Author("弐瓶 勉", NoContent)

  // Publishers
  val Kodansha = Publisher("講談社")
  val Shueisha = Publisher("集英社")

  val Blame = Series(
    Title("BLAME!"),
    TsutomNihei,
    Kodansha
  )
  val Blame_1 = SeriesComic("978-4-06-314182-5", Blame, 1, NoContent, Date(1998, 6, 23))
  val Blame_2 = SeriesComic("978-4-06-314194-8", Blame, 2, NoContent, Date(1998, 12, 18))
  val Blame_3 = SeriesComic("978-4-06-314218-1", Blame, 3, NoContent, Date(1999, 8, 23))
  val Blame_4 = SeriesComic("978-4-06-314235-8", Blame, 4, NoContent, Date(2000, 3, 23))
  val Blame_5 = SeriesComic("978-4-06-314251-8", Blame, 5, NoContent, Date(2000, 9, 22))
  val Blame_6 = SeriesComic("978-4-06-314263-1", Blame, 6, NoContent, Date(2001, 3, 23))
  val Blame_7 = SeriesComic("978-4-06-314277-8", Blame, 7, NoContent, Date(2001, 10, 23))
  val Blame_8 = SeriesComic("978-4-06-314289-1", Blame, 8, NoContent, Date(2002, 4, 23))
  val Blame_9 = SeriesComic("978-4-06-314310-2", Blame, 9, NoContent, Date(2002, 12, 20))
  val Blame_10 = SeriesComic("978-4-06-314328-7", Blame, 10, NoContent, Date(2003, 9, 22))

  val Noise = SingleComic(
    "4-06-314278-74-06-314278-7",
    Title("NOiSE"),
    TsutomNihei,
    NoContent,
    Kodansha,
    Date(2001, 10, 23)
  )

  val Abara = Series(
    Title("ABARA"),
    TsutomNihei,
    Shueisha
  )
  val Abara_1 = SeriesComic("4-08-877088-9", Abara, 1, NoContent, Date(2006, 5, 24))
  val Abara_2 = SeriesComic("4-08-877089-7", Abara, 2, NoContent, Date(2006, 5, 24))
}

object Elements {
  val Killy = Character("霧亥", NoContent)
  val ToaJyuko = Organization("東亜重工")

  val releations = Set(
    TitleAndElement(Comics.Blame, Killy, NoContent),
    TitleAndElement(Comics.Blame, ToaJyuko, NoContent)
  )
}
