package com.example.github_browser.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.github_browser.R
import com.example.github_browser.model.Repository


class RepositoryRecyclerViewAdapter(private val listOfRepos: ArrayList<Repository>): RecyclerView.Adapter<RepositoryRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.create(parent)
    }

    override fun getItemCount(): Int {
        return listOfRepos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bind(listOfRepos[position])
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private var textViewRepoName = view.findViewById<TextView>(R.id.textViewRepoName)
        private var textViewPrivacy = view.findViewById<TextView>(R.id.textViewPrivacy)
        private var textViewLicense = view.findViewById<TextView>(R.id.textViewLicense)

        fun bind (repository: Repository) {
            textViewRepoName?.text = repository.name
            textViewLicense?.text = repository.license?.name
            val privacyType = when(repository.private){
                true -> R.string.private_repo
                else -> R.string.public_repo
            }
            textViewPrivacy?.setText(privacyType)
        }

        companion object {
            fun create(parent: ViewGroup): ViewHolder {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.layout_recycler_view_repository, parent, false)
                return ViewHolder(view)

            }
        }



    }


}

