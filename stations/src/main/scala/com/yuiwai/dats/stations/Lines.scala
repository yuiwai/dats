package com.yuiwai.dats.stations

final case class Line(mark: String, organization: String, name: String)
object Lines {
  val JB = Line("JB", "JR", "中央・総武線")
  val JY = Line("JY", "JR", "山手線")
  val G = Line("G", "東京メトロ", "銀座線")
  val H = Line("H", "東京メトロ", "日比谷線")
  val T = Line("T", "東京メトロ", "東西線")
  val C = Line("C", "東京メトロ", "千代田線")
  val Y = Line("Y", "東京メトロ", "有楽町線")
  val Z = Line("Z", "東京メトロ", "半蔵門線")
  val N = Line("N", "東京メトロ", "南北線")
  val F = Line("F", "東京メトロ", "副都心線")
  val KS_1 = Line("KS", "京成電鉄", "本線")
  val KS_2 = Line("KS", "京成電鉄", "成田空港線")
  val KS_3 = Line("KS", "京成電鉄", "東成田線")
  val KS_4 = Line("KS", "京成電鉄", "押上線")
  val KS_5 = Line("KS", "京成電鉄", "金町線")
  val KS_6 = Line("KS", "京成電鉄", "千葉線")
  val KS_7 = Line("KS", "京成電鉄", "千原線")
  val SL = Line("SL", "新京成電鉄", "新京成線")
  val TR = Line("TR", "東葉高速鉄道", "東葉高速線")
  val CM_1 = Line("CM", "千葉都市モノレール", "千葉都市モノレール1号線")
  val CM_2 = Line("CM", "千葉都市モノレール", "千葉都市モノレール2号線")

  val all = Set(
    JB, JY, G, H, T, C, Y, Z, N, F, KS_1, KS_2, KS_3, KS_4, KS_5, KS_6, KS_7, SL, TR, CM_1, CM_2
  )
}
