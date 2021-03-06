package com.bravo.gank.data

/**
 * Created by Administrator on 2017/6/27.
 */
const val BASE_URL="http://gank.io/"

enum class Type {
    all,Android,iOS,福利,拓展资源,前端,休息视频
}

data class Result(val error: Boolean, val results:List<Article>)

data class Article(val _id:String, val createdAt:String, val desc:String,
                   val images:Array<String>,
                   val publishedAt:String, val source:String, val type:String,
                   val url:String, val used:Boolean, val who:String)

data class History(val date:String, val content:String)

data class PublishedDate(val error: Boolean, val results:List<String>)