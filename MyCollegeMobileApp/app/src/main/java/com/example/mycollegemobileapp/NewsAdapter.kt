package com.example.mycollegemobileapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class NewsAdapter(context: Context?, resource: Int, private var states: List<NewsModel>?) :
    ArrayAdapter<NewsModel>(context!!, resource, states!!) {
    private var inflater: LayoutInflater? = null
    private var layout = resource

    init {
        inflater = LayoutInflater.from(context)
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View = inflater!!.inflate(layout, parent, false)
        val imageView: ImageView = view.findViewById(R.id.ivImageNews)
        val titleView: TextView = view.findViewById(R.id.tvTitleNews)
        val contentView: TextView = view.findViewById(R.id.tvContentNews)
        val news: NewsModel = states!![position]
        if(news.getImage() == null)
            imageView.isVisible = false
        else
            imageView.setImageResource(news.getImage()!!)
        if (news.getTitle() == null)
            titleView.isVisible = false
        else
            titleView.text = news.getTitle()
        contentView.text = news.getContent()
        return view
    }
}