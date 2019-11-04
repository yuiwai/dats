package com.yuiwai.dats.stations

import com.yuiwai.dats.stations.lines._

final case class Station(lines: Set[Line], number: Int, name: String)
object Station {
  def apply(line: Line, number: Int, name: String): Station = apply(Set(line), number, name)
}

object Stations extends AnyRef
  with LineJB
  with LineJY
  with LineG
  with LineH
  with LineT
  with LineC
  with LineZ
  with LineKS
  with LineSL
  with LineTR
  with LineCM {
  import Lines._

  // TODO Y 有楽町線

  val all: Set[Station] =
    allJB ++ allJY ++ allG ++ allH ++ allT ++ allC ++ allZ ++ allKS_1 ++ allKS_6 ++ allTR ++ allCM_1 ++ allCM_2

  val junctions: Seq[Set[Station]] = Seq(
    // 中野
    Set(JB07, T01),

    // 新宿
    Set(JB10, JY17),

    // 代々木
    Set(JB11, JY18),

    // 飯田橋
    Set(JB16, T06),

    // 御茶ノ水
    Set(JB18, C12),

    // 秋葉原
    Set(JB19, JY03, H15),

    // 錦糸町
    Set(JB22, Z13),

    // 西船橋
    Set(JB30, T23, TR01),

    // 津田沼
    Set(JB33, SL23),

    // 幕張本郷
    Set(JB34, KS52),

    // 幕張
    Set(JB35, KS53),

    // 千葉
    Set(JB39, KS59, CM03),

    // 東京
    Set(JY01, JY30, T09, C10),

    // 神田
    Set(JY02, G13),

    // 御徒町
    Set(JY04, G15, H16),

    // 上野
    Set(JY05, G16, H17, KS01),

    // 日暮里
    Set(JY07, KS02),

    // 西日暮里
    Set(JY08, C16),

    // 高田馬場
    Set(JY15, T03),

    // 原宿
    Set(JY19, C03),

    // 渋谷
    Set(JY20, G01, Z01),

    // 恵比寿
    Set(JY21, H02),

    // 新橋
    Set(JY29, G08),

    // 有楽町
    Set(JY30, H07, C09),

    // 表参道
    Set(C04, G02, Z02),

    // 国会議事堂前
    Set(C07, G06),

    // 霞ヶ関
    Set(C08, H06),

    // 大手町
    Set(C11, Z08, T09),

    // 北千住
    Set(C18, H21),

    // 銀座
    Set(H08, G09),

    // 茅場町
    Set(H12, T11),

    // 水天宮前
    Set(Z10, H13),

    // 青山一丁目
    Set(Z03, G04),

    // 永田町
    Set(Z04, G05),

    // 三越前
    Set(Z09, G12),

    // 九段下
    Set(Z06, T07),

    // 日本橋
    Set(T10, G11),

    // 北習志野
    Set(TR04, SL19)
  )
}

