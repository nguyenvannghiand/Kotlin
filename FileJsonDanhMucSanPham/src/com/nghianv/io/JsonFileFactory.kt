package com.nghianv.io

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nghianv.model.DanhMuc
import com.nghianv.model.SanPham
import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

class JsonFileFactory {
    public fun luuDuLieu(dsSp: MutableList<DanhMuc>, path: String): Boolean {
        try {
            var gs = Gson()
            var fileWriter = FileWriter(path)
            gs.toJson(dsSp, fileWriter)
            fileWriter.close()

            return true
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return false
    }

    public fun docDulieu(path: String): MutableList<DanhMuc> {
        var dsDanhMuc: MutableList<DanhMuc> = mutableListOf()
        try {
            var gson = Gson()
            var fileReader = FileReader(path)
            dsDanhMuc = gson.fromJson(fileReader, object : TypeToken<MutableList<DanhMuc>>() {}.type)
            fileReader.close()

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return dsDanhMuc
    }
}