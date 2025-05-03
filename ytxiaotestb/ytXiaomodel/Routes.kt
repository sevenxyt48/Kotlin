package com.example.ytxiaotestb.ytXiaomodel

sealed class Routes(val route: String){
    object NavHost : Routes("NavHost")
    object Detail : Routes("Detail")
}
