package com.yuiwai.dats.comics

final case class Comic(title: String, number: Int, content: Content)
final case class Author(name: String, content: Content)

// 作中の構成要素
sealed trait Element
final case class Character(name: String, content: Content) extends Element
final case class Item(name: String, content: Content) extends Element

// 関連
sealed trait Relation
final case class ComicAndAuthor(comic: Comic, author: Author, content: Content) extends Relation
final case class ComicAndElement(comic: Comic, element: Element, content: Content) extends Relation
final case class ElementAndElement(element1: Element, element2: Element, content: Content) extends Relation

// 何らかのコンテンツ
sealed trait Content
final case class Text(value: String) extends Content
case object NoContent extends Content

object Comics {

}
