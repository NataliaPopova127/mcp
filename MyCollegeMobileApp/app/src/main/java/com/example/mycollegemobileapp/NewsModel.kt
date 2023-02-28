package com.example.mycollegemobileapp

class NewsModel {
    private var title: String? = null
    private var content : String? = null
    private var imageNews : Int? = null

    constructor(title: String?, content: String? ,image: Int?) {
        this.title = title
        this.content = content
        imageNews = image
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String?) {
        this.title = title
    }

    fun getContent():String?{
        return content
    }

    fun setContent(content: String?){
        this.content = content
    }

    fun getImage(): Int? {
        return imageNews
    }

    fun setImage(image: Int?) {
        this.imageNews = image
    }
}