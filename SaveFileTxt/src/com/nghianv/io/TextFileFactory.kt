package com.nghianv.io

import com.nghianv.model.NhanVien
import java.io.*
import java.lang.Exception
import java.text.SimpleDateFormat

class TextFileFactory {
    var sdf = SimpleDateFormat("dd/MM/yyyy")
    public fun luuDuLieu(dsNV:MutableList<NhanVien>, path:String): Boolean{
        try {
            var fos = FileOutputStream(path)
            var osw = OutputStreamWriter(fos, "UTF-8")
            var bfw = BufferedWriter(osw)
            for (nv in dsNV) {
                /*
                * Luu danh sach nhan vien theo tung dong, moi dong lai la mot nhan vien
                * 1 nhan vien se co thong tin (Ma, ten, NamSinh)
                * 1line = thong tin 1 nhan vien
                 */
                var line = "${nv.Ma};${nv.Ten};${sdf.format(nv.NamSinh)}"
                bfw.write(line)
                bfw.newLine()
            }
            bfw.close()
            osw.close()
            fos.close()
            return true
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return false
    }
    //
    public fun docDuLieu(path: String):MutableList<NhanVien>{
        var dsNV:MutableList<NhanVien> = mutableListOf()
        try {
            var fis = FileInputStream(path)
            var isr = InputStreamReader(fis,"UTF-8")
            var br = BufferedReader(isr)
            var line = br.readLine()
            while (line != null) {
                var arr = line.split(";")
                if (arr.size == 3) {
                    var nv:NhanVien = NhanVien()
                    nv.Ma = arr[0].toInt()
                    nv.Ten = arr[1].toString()
                    nv.NamSinh = sdf.parse(arr[2])
                    dsNV.add(nv)
                }
                line= br.readLine()
            }
            br.close()
            isr.close()
            fis.close()

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return dsNV
    }
}