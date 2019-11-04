package com.yuiwai.dats.stations.lines

import com.yuiwai.dats.stations.Lines.Z
import com.yuiwai.dats.stations.Station

trait LineZ {
  val Z01 = Station(Z, 1, "渋谷")
  val Z02 = Station(Z, 2, "表参道")
  val Z03 = Station(Z, 3, "青山一丁目")
  val Z04 = Station(Z, 4, "永田町")
  val Z05 = Station(Z, 5, "半蔵門")
  val Z06 = Station(Z, 6, "九段下")
  val Z07 = Station(Z, 7, "神保町")
  val Z08 = Station(Z, 8, "大手町")
  val Z09 = Station(Z, 9, "三越前")
  val Z10 = Station(Z, 10, "水天宮前")
  val Z11 = Station(Z, 11, "清澄白河")
  val Z12 = Station(Z, 12, "住吉")
  val Z13 = Station(Z, 13, "錦糸町")
  val Z14 = Station(Z, 14, "押上")

  val allZ = Set(
    Z01,
    Z02,
    Z03,
    Z04,
    Z05,
    Z06,
    Z07,
    Z08,
    Z09,
    Z10,
    Z11,
    Z12,
    Z13,
    Z14
  )
}
