package com.example.task4

import androidx.recyclerview.widget.DiffUtil


class ChatsDiffUtil(private val oldList: ArrayList<Chat>, private val newList: ArrayList<Chat>) :
    DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldProduct: Chat = oldList[oldItemPosition]
        val newProduct: Chat = newList[newItemPosition]
        return oldProduct.id == newProduct.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldProduct: Chat = oldList[oldItemPosition]
        val newProduct: Chat = newList[newItemPosition]
        return (oldProduct.name == newProduct.name
                && oldProduct.unreadMesCount == newProduct.unreadMesCount
                && oldProduct.lastMes == newProduct.lastMes
                && oldProduct.time == newProduct.time
                && oldProduct.image == newProduct.image)
    }

}