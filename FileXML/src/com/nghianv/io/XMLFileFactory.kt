package com.nghianv.io

import com.nghianv.model.SanPham
import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import java.lang.Exception
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

class XMLFileFactory {
    public fun luuDuLieu(dsSP: MutableList<SanPham>, path: String): Boolean {
        try {
            var docFactory: DocumentBuilderFactory = DocumentBuilderFactory.newInstance()
            var docBuilder = docFactory.newDocumentBuilder()
            var doc: Document = docBuilder.newDocument()
            var rootElement: Element = doc.createElement("SanPhamsRoot")
            doc.appendChild(rootElement)
            for (sp in dsSP) {
                var sanPhamElement: Element = doc.createElement("Sanpham")
                var maElement = doc.createElement("Ma")
                maElement.textContent = sp.ma.toString()
                var tenElement = doc.createElement("Ten")
                tenElement.textContent = sp.ten.toString()
                var giaElement = doc.createElement("Gia")
                giaElement.textContent = sp.gia.toString()
                //day cac tag vao tag parent
                sanPhamElement.appendChild(maElement)
                sanPhamElement.appendChild(tenElement)
                sanPhamElement.appendChild(giaElement)
                rootElement.appendChild(sanPhamElement)
            }
            var transformerFactory: TransformerFactory = TransformerFactory.newInstance()
            var tranform: Transformer = transformerFactory.newTransformer()
            var source: DOMSource = DOMSource(doc)
            var result = StreamResult(File(path).absolutePath)
            tranform.transform(source, result)
            return true
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return false
    }

    //Doc du lieu
    public fun docDuLieu(path: String): MutableList<SanPham> {
        var dsSP: MutableList<SanPham> = mutableListOf()
        try {
            var docBuiderFactory = DocumentBuilderFactory.newInstance()
            var docbuilder = docBuiderFactory.newDocumentBuilder()
            var xlmFile = File(path)
            var document = docbuilder.parse(xlmFile)
            var nodeList = document.documentElement.childNodes
            for (i in 0 until nodeList.length) {
                var node = nodeList.item(i)
                if (node is Element) {
                    var sp = SanPham()
                    var childNodes = node.childNodes
                    for (j in 0 until childNodes.length) {
                        var childNode = childNodes.item(j)
                        if (childNode is Element) {
                            var content = childNode.lastChild.textContent.trim()
                            when (childNode.nodeName) {
                                "Ma" -> sp.ma = content.toInt()
                                "Ten" -> sp.ten = content.toString()
                                "Gia" -> sp.gia = content.toDouble()
                            }
                        }
                    }
                    dsSP.add(sp)
                }
            }

        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        return dsSP
    }
}