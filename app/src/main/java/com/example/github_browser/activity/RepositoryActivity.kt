package com.example.github_browser.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.github_browser.R
import com.example.github_browser.adapter.RepositoryRecyclerViewAdapter
import com.example.github_browser.model.Repository

class RepositoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repository)

        val listOfRepos = intent?.getParcelableArrayListExtra<Repository>(KEY_REPOSITORY_DATA)

        listOfRepos?.let {

            val numberOfRepositories = getString(R.string.number_of_repos, it.size)
            findViewById<TextView>(R.id.textViewNumberOfRepos)?.text = numberOfRepositories

            showRepos(it)



        }

    }

    private fun showRepos(listOfRepositories: ArrayList<Repository>){
        val recyclerViewAdapter = RepositoryRecyclerViewAdapter(listOfRepositories)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.apply {
            adapter = recyclerViewAdapter
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
        }
    }


    companion object {
        const val KEY_REPOSITORY_DATA = "keyRepositoryData"
    }
}