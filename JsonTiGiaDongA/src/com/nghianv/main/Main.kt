package com.nghianv.main

import com.google.gson.Gson
import com.nghianv.model.TiGia
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {
    var stringURL = "https://www.dongabank.com.vn/exchange/export"
    var url: URL = URL(stringURL)
    var collection: HttpURLConnection = url.openConnection() as HttpURLConnection
    var inputStreamReader: InputStreamReader = InputStreamReader(collection.inputStream, "UTF-8")
    var br: BufferedReader = BufferedReader(inputStreamReader)
    var data= br.readText()
    br.close()
    inputStreamReader.close()
    // do file json co () dau tien len can replce xoa di de tro ve file json binh thuong
    data = data.replace("(","")
    data = data.replace(")","")
    var gson = Gson()
    var tg: TiGia = gson.fromJson(data, TiGia::class.java)
    for (item in tg.items) {
        println(item)
        println("----------------")
    }


}