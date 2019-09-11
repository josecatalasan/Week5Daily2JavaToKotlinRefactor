package com.example.week3weekendapi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

import com.example.week3weekendapi.model.repos.Repository
import kotlinx.android.synthetic.main.repo_list_item.view.*

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.concurrent.TimeUnit

class RepoListAdapter(var repoList: List<Repository>) : Adapter<RepoListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.repo_list_item, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bindValues(repoList[position])

    override fun getItemCount(): Int = repoList.size

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindValues(repository: Repository){
            itemView.tvName.text = repository.name
            itemView.tvLanguage.text = repository.language
            itemView.tvLastUpdate.text = String.format("Updated %s ago", getTimeSince(repository.updatedAt))
        }

        private fun getTimeSince(date: String?): String {
            val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX")

            var diff: Long = 0
            var period = " days"

            try {
                val updated = sdf.parse(date!!)
                val today = Calendar.getInstance().time

                val diffInMillies = Math.abs(today.time - updated!!.time)
                diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)

                if (diff == 1L)
                    period = " day"

                if (diff < 1) {
                    diff = TimeUnit.HOURS.convert(diffInMillies, TimeUnit.MILLISECONDS)
                    if (diff == 1L)
                        period = " hour"
                    else
                        period = " hours"
                }
                if (diff < 1) {
                    diff = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS)
                    if (diff == 1L)
                        period = " minute"
                    else
                        period = " minutes"
                }
                if (diff < 1) {
                    diff = TimeUnit.SECONDS.convert(diffInMillies, TimeUnit.MILLISECONDS)
                    if (diff == 1L)
                        period = " second"
                    else
                        period = " seconds"
                }
            } catch (e: ParseException) {
                e.printStackTrace()
            } finally {
                return diff.toString() + period
            }
        }
    }
}
