package com.yuiwai.dats.stations.lines

import com.yuiwai.dats.stations.Lines.TR
import com.yuiwai.dats.stations.Station

trait LineTR {
  val TR01 = Station(TR, 1, "西船橋")
  val TR02 = Station(TR, 2, "東海神")
  val TR03 = Station(TR, 3, "飯山満")
  val TR04 = Station(TR, 4, "北習志野")
  val TR05 = Station(TR, 5, "船橋日大前")
  val TR06 = Station(TR, 6, "八千代緑が丘")
  val TR07 = Station(TR, 7, "八千代中央")
  val TR08 = Station(TR, 8, "村上")
  val TR09 = Station(TR, 9, "東葉勝田台")

  val allTR = Set(
    TR01,
    TR02,
    TR03,
    TR04,
    TR05,
    TR06,
    TR07,
    TR08,
    TR09
  )

}
