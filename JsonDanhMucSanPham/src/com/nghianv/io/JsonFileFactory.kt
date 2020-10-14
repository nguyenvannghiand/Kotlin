package com.nghianv.io

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nghianv.model.DanhMuc
import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

class JsonFileFactory {
    public fun luuDuLieu(dsSP: MutableList<DanhMuc>,path: String): Boolean{
        try {
            var gson = Gson()
            var fileWriter = FileWriter(path)
            gson.toJson(dsSP, fileWriter)
            fileWriter.close()
            return true
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return false
    }
    //
    public fun docDuLieu(path: String): MutableList<DanhMuc>{
        var dsDanhMuc: MutableList<DanhMuc> = mutableListOf()
        try {
            var gson = Gson()
            var fileReader = FileReader(path)
            dsDanhMuc = gson.fromJson(fileReader,object :TypeToken<MutableList<DanhMuc>>(){}.type)
            fileReader.close()
        }catch (ex: Exception){
            ex.printStackTrace()
        }
        return dsDanhMuc
    }
}