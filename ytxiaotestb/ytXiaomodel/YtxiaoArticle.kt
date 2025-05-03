package com.example.ytxiaotestb.ytXiaomodel

import com.example.ytxiaomidtest.ytXiaomodel.YtXiaoCommentType

data class YtxiaoArticle(
    val title: String,
    val content: String,
    val commentType: YtXiaoCommentType = YtXiaoCommentType.COMMENT,
    var commentCount: Int = 0
)
