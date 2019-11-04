package com.yuiwai.dats.stations.lines

import com.yuiwai.dats.stations.Lines.{CM_1, CM_2}
import com.yuiwai.dats.stations.Station

trait LineCM {
  val CM01 = Station(Set(CM_1, CM_2), 1, "千葉みなと")
  val CM02 = Station(Set(CM_1, CM_2), 2, "市役所前")
  val CM03 = Station(Set(CM_1, CM_2), 3, "千葉")
  val CM16 = Station(CM_1, 16, "栄町")
  val CM17 = Station(CM_1, 17, "葭川公園")
  val CM18 = Station(CM_1, 18, "県庁前")

  val allCM_1 = Set(
    CM01,
    CM02,
    CM03,
    CM16,
    CM17,
    CM18
  )

  val CM04 = Station(CM_2, 4, "千葉公園")
  val CM05 = Station(CM_2, 5, "作草部")
  val CM06 = Station(CM_2, 6, "天台")
  val CM07 = Station(CM_2, 7, "穴川")
  val CM08 = Station(CM_2, 8, "スポーツセンター")
  val CM09 = Station(CM_2, 9, "動物公園")
  val CM10 = Station(CM_2, 10, "みつわ台")
  val CM11 = Station(CM_2, 11, "都賀")
  val CM12 = Station(CM_2, 12, "桜木")
  val CM13 = Station(CM_2, 13, "小倉台")
  val CM14 = Station(CM_2, 14, "千城台北")
  val CM15 = Station(CM_2, 15, "千城台")

  val allCM_2 = Set(
    CM01,
    CM02,
    CM03,
    CM04,
    CM05,
    CM06,
    CM07,
    CM08,
    CM09,
    CM10,
    CM11,
    CM12,
    CM13,
    CM14,
    CM15
  )

}
