package com.example.task4

import java.util.*
import kotlin.collections.ArrayList

class Repository {
    fun getChats(): ArrayList<Chat>{
        val data = ArrayList<Chat>()
        for (i in 0..(2..6).random()){
            data.add(Chat(i,randomName(), "ddfdg", "4545","23445", R.drawable.avatar))
        }
        return data
    }

    private fun randomName(): String{
        val names = arrayOf("Дмитрий", "Максим", "Андрей")
        return names[(0..2).random()]
    }
    private fun randomMesCount(): String{
        val names = arrayOf("1", "2", "3")
        return names[(0..2).random()]
    }
    private fun randomLastMes(): String{
        val names = arrayOf("Hi", "By", "Pirivet")
        return names[(0..2).random()]
    }
    private fun randomImage(): Int{
        val names = arrayOf(R.drawable.avatar, R.drawable.avatar, R.drawable.avatar)
        return names[(0..2).random()]
    }
}