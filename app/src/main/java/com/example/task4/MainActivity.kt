package com.example.task4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = Adapter(Repository().getChats())
        recyclerView.adapter = adapter

        val swipeRefresh = findViewById<SwipeRefreshLayout>(R.id.swipe_refresh)
        swipeRefresh.setOnRefreshListener {
            val data = Repository().getChats()
            val diffUtil = ChatsDiffUtil(adapter.data, data)
            val productDiffResult = DiffUtil.calculateDiff(diffUtil)
            adapter.data = data
            productDiffResult.dispatchUpdatesTo(adapter)
            swipeRefresh.isRefreshing = false
        }

    }

}