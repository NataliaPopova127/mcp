package com.example.mycollegemobileapp


import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_news.*
import kotlinx.android.synthetic.main.news_component.*


class NewsActivity : AppCompatActivity() {
    var news: ArrayList<NewsModel> = ArrayList<NewsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        setTitle("Новости")



        // начальная инициализация списка
        setInitialData()
        var list : ListView = findViewById(R.id.list)
        // создаем адаптер
        val newsAdapter = NewsAdapter(this, R.layout.news_component, news)
        // устанавливаем адаптер
        list.adapter = newsAdapter
        // слушатель выбора в списке
        val itemListener =
            AdapterView.OnItemClickListener { parent, v, position, id -> // получаем выбранный пункт
                val selectedState: NewsModel = parent.getItemAtPosition(position) as NewsModel
                Toast.makeText(
                    applicationContext, "Был выбран пункт " + selectedState.getTitle(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        list.setOnItemClickListener(itemListener)
    }

    private fun setInitialData() {
        news.add(NewsModel("News1", getString(R.string.news_proba),null))
        news.add(NewsModel(null, getString(R.string.news_proba), R.drawable.news))
        news.add(NewsModel("News3", getString(R.string.news_proba), R.drawable.news))
        news.add(NewsModel("News4", getString(R.string.news_proba), R.drawable.news))
        news.add(NewsModel("News5", getString(R.string.news_proba), R.drawable.news))
    }

}