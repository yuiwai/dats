package com.yuiwai.dats.stations.lines

import com.yuiwai.dats.stations.Lines.{KS_1, KS_6}
import com.yuiwai.dats.stations.Station

trait LineKS {
  val KS01 = Station(KS_1, 1, "京成上野")
  val KS02 = Station(KS_1, 2, "日暮里")
  val KS03 = Station(KS_1, 3, "新三河島")
  val KS04 = Station(KS_1, 4, "町屋")
  val KS05 = Station(KS_1, 5, "千住大橋")
  val KS06 = Station(KS_1, 6, "京成関屋")
  val KS07 = Station(KS_1, 7, "堀切菖蒲園")
  val KS08 = Station(KS_1, 8, "お花茶屋")
  val KS09 = Station(KS_1, 9, "青砥")
  val KS10 = Station(KS_1, 10, "京成高砂")
  val KS11 = Station(KS_1, 11, "京成小岩")
  val KS12 = Station(KS_1, 12, "江戸川")
  val KS13 = Station(KS_1, 13, "国府台")
  val KS14 = Station(KS_1, 14, "市川真間")
  val KS15 = Station(KS_1, 15, "菅野")
  val KS16 = Station(KS_1, 16, "京成八幡")
  val KS17 = Station(KS_1, 17, "鬼越")
  val KS18 = Station(KS_1, 18, "京成中山")
  val KS19 = Station(KS_1, 19, "中山")
  val KS20 = Station(KS_1, 20, "京成西船")
  val KS21 = Station(KS_1, 21, "海神")
  val KS22 = Station(KS_1, 22, "京成船橋")
  val KS23 = Station(KS_1, 23, "大神宮下")
  val KS24 = Station(KS_1, 24, "船橋競馬場")
  val KS25 = Station(KS_1, 25, "谷津")
  val KS26 = Station(Set(KS_1, KS_6), 26, "京成津田沼")
  val KS27 = Station(KS_1, 27, "京成大久保")
  val KS28 = Station(KS_1, 28, "実籾")
  val KS29 = Station(KS_1, 29, "八千代台")
  val KS30 = Station(KS_1, 30, "京成大和田")
  val KS31 = Station(KS_1, 31, "勝田台")
  val KS32 = Station(KS_1, 32, "志津")
  val KS33 = Station(KS_1, 33, "ユーカリが丘")
  val KS34 = Station(KS_1, 34, "京成臼井")
  val KS35 = Station(KS_1, 35, "京成佐倉")
  val KS36 = Station(KS_1, 36, "大佐倉")
  val KS37 = Station(KS_1, 37, "京成酒々井")
  val KS38 = Station(KS_1, 38, "宗吾参道")
  val KS39 = Station(KS_1, 39, "公津の杜")
  val KS40 = Station(KS_1, 30, "京成成田")
  val KS41 = Station(KS_1, 41, "空港第2ビル")
  val KS42 = Station(KS_1, 42, "成田空港")

  val allKS_1 = Set(
    KS01,
    KS02,
    KS03,
    KS04,
    KS05,
    KS06,
    KS07,
    KS08,
    KS09,
    KS10,
    KS11,
    KS12,
    KS13,
    KS14,
    KS15,
    KS16,
    KS17,
    KS18,
    KS19,
    KS20,
    KS21,
    KS22,
    KS23,
    KS24,
    KS25,
    KS26,
    KS27,
    KS28,
    KS29,
    KS30,
    KS31,
    KS32,
    KS33,
    KS34,
    KS35,
    KS36,
    KS37,
    KS38,
    KS39,
    KS40,
    KS41,
    KS42
  )

  val KS52 = Station(KS_6, 52, "京成幕張本郷")
  val KS53 = Station(KS_6, 53, "京成幕張")
  val KS54 = Station(KS_6, 54, "検見川")
  val KS55 = Station(KS_6, 55, "京成稲毛")
  val KS56 = Station(KS_6, 56, "みどり台")
  val KS57 = Station(KS_6, 57, "西登戸")
  val KS58 = Station(KS_6, 58, "新千葉")
  val KS59 = Station(KS_6, 59, "京成千葉")
  val KS60 = Station(KS_6, 60, "千葉中央")

  val allKS_6 = Set(
    KS52,
    KS53,
    KS54,
    KS55,
    KS56,
    KS57,
    KS58,
    KS59,
    KS60
  )
}
