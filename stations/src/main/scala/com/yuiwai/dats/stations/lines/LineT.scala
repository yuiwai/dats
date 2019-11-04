package com.yuiwai.dats.stations.lines

import com.yuiwai.dats.stations.Lines.T
import com.yuiwai.dats.stations.Station

trait LineT {
  val T01 = Station(T, 1, "中野")
  val T02 = Station(T, 2, "落合")
  val T03 = Station(T, 3, "高田馬場")
  val T04 = Station(T, 4, "早稲田")
  val T05 = Station(T, 5, "神楽坂")
  val T06 = Station(T, 6, "飯田橋")
  val T07 = Station(T, 7, "九段下")
  val T08 = Station(T, 8, "竹橋")
  val T09 = Station(T, 9, "大手町")
  val T10 = Station(T, 10, "日本橋")
  val T11 = Station(T, 11, "茅場町")
  val T12 = Station(T, 12, "門前仲町")
  val T13 = Station(T, 13, "木場")
  val T14 = Station(T, 14, "東陽町")
  val T15 = Station(T, 15, "南砂町")
  val T16 = Station(T, 16, "西葛西")
  val T17 = Station(T, 17, "葛西")
  val T18 = Station(T, 18, "浦安")
  val T19 = Station(T, 19, "南行徳")
  val T20 = Station(T, 10, "行徳")
  val T21 = Station(T, 21, "妙典")
  val T22 = Station(T, 22, "原木中山")
  val T23 = Station(T, 23, "西船橋")

  val allT = Set(
    T01,
    T02,
    T03,
    T04,
    T05,
    T06,
    T07,
    T08,
    T09,
    T10,
    T11,
    T12,
    T13,
    T14,
    T15,
    T16,
    T17,
    T18,
    T19,
    T20,
    T21,
    T22,
    T23
  )
}
