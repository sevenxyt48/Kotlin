package com.example.week14.viewmodel

data class ItemEntity(
    var itemName:String,
    var itemQuantity:Int,
    val itemID:Int = 0
){
    constructor():this("noinfo",0,0)
}
