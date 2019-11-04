package com.yuiwai.dats.stations.lines

import com.yuiwai.dats.stations.Lines.H
import com.yuiwai.dats.stations.Station

trait LineH {
  val H01 = Station(H, 1, "中目黒")
  val H02 = Station(H, 2, "恵比須")
  val H03 = Station(H, 3, "広尾")
  val H04 = Station(H, 4, "六本木")
  val H05 = Station(H, 5, "神谷町")
  val H06 = Station(H, 6, "霞ヶ関")
  val H07 = Station(H, 7, "日比谷")
  val H08 = Station(H, 8, "銀座")
  val H09 = Station(H, 9, "東銀座")
  val H10 = Station(H, 10, "築地")
  val H11 = Station(H, 11, "八丁堀")
  val H12 = Station(H, 12, "茅場町")
  val H13 = Station(H, 13, "人形町")
  val H14 = Station(H, 14, "小伝馬町")
  val H15 = Station(H, 15, "秋葉原")
  val H16 = Station(H, 16, "仲御徒町")
  val H17 = Station(H, 17, "上野")
  val H18 = Station(H, 18, "入谷")
  val H19 = Station(H, 19, "三ノ輪")
  val H20 = Station(H, 10, "南千住")
  val H21 = Station(H, 21, "北千住")

  val allH = Set(
    H01,
    H02,
    H03,
    H04,
    H05,
    H06,
    H07,
    H08,
    H09,
    H10,
    H11,
    H12,
    H13,
    H14,
    H15,
    H16,
    H17,
    H18,
    H19,
    H20,
    H21
  )
}
