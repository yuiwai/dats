package com.yuiwai.dats.stations.lines

import com.yuiwai.dats.stations.Lines.G
import com.yuiwai.dats.stations.Station

trait LineG {
  val G01 = Station(G, 1, "渋谷")
  val G02 = Station(G, 2, "表参道")
  val G03 = Station(G, 3, "外苑前")
  val G04 = Station(G, 4, "青山一丁目")
  val G05 = Station(G, 5, "赤坂見附")
  val G06 = Station(G, 6, "溜池山王")
  val G07 = Station(G, 7, "虎ノ門")
  val G08 = Station(G, 8, "新橋")
  val G09 = Station(G, 9, "銀座")
  val G10 = Station(G, 10, "京橋")
  val G11 = Station(G, 11, "日本橋")
  val G12 = Station(G, 12, "三越前")
  val G13 = Station(G, 13, "神田")
  val G14 = Station(G, 14, "末広町")
  val G15 = Station(G, 15, "上野広小路")
  val G16 = Station(G, 16, "上野")
  val G17 = Station(G, 17, "稲荷町")
  val G18 = Station(G, 18, "田原町")
  val G19 = Station(G, 19, "浅草")

  val allG = Set(
    G01,
    G02,
    G03,
    G04,
    G05,
    G06,
    G07,
    G08,
    G09,
    G10,
    G11,
    G12,
    G13,
    G14,
    G15,
    G16,
    G17,
    G18,
    G19
  )
}
