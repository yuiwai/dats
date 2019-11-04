package com.yuiwai.dats.stations.lines

import com.yuiwai.dats.stations.Lines.C
import com.yuiwai.dats.stations.Station

trait LineC {
  val C01 = Station(C, 1, "代々木上原")
  val C02 = Station(C, 2, "代々木公園")
  val C03 = Station(C, 3, "明治神宮前")
  val C04 = Station(C, 4, "表参道")
  val C05 = Station(C, 5, "乃木坂")
  val C06 = Station(C, 6, "赤坂")
  val C07 = Station(C, 7, "国会議事堂前")
  val C08 = Station(C, 8, "霞ヶ関")
  val C09 = Station(C, 9, "日比谷")
  val C10 = Station(C, 10, "二重橋前")
  val C11 = Station(C, 11, "大手町")
  val C12 = Station(C, 12, "新御茶ノ水")
  val C13 = Station(C, 13, "湯島")
  val C14 = Station(C, 14, "根津")
  val C15 = Station(C, 15, "千駄木")
  val C16 = Station(C, 16, "西日暮里")
  val C17 = Station(C, 17, "町屋")
  val C18 = Station(C, 18, "北千住")
  val C19 = Station(C, 19, "綾瀬")
  val C20 = Station(C, 20, "北綾瀬")

  val allC = Set(
    C01,
    C02,
    C03,
    C04,
    C05,
    C06,
    C07,
    C08,
    C09,
    C10,
    C11,
    C12,
    C13,
    C14,
    C15,
    C16,
    C17,
    C18,
    C19,
    C20
  )
}
