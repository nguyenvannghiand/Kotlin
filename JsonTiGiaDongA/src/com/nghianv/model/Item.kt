package com.nghianv.model

class Item {
    var type: String = ""
    var imageurl: String = ""
    var muatienmat: String = ""
    var muack: String = ""
    var bantienmat: String = ""
    var banck: String = ""
    override fun toString(): String {
        return "Type: " +type+"\n"+
                "imageurl: " +imageurl+"\n"+
                "muatienmat: " +muatienmat+"\n"+
                "muack: " +muack+"\n"+
                "bantienmat: " +bantienmat+"\n"+
                "banck: " +banck


    }
}