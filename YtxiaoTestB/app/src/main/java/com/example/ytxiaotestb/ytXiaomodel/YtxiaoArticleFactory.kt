package com.example.ytxiaotestb.ytXiaomodel

import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateListOf
import com.example.ytxiaomidtest.ytXiaomodel.YtXiaoCommentType

object YtxiaoArticleFactory {
    fun makeArticleList()= mutableStateListOf(
        YtxiaoArticle(
            title = "사진 있는 기사 1",
            content = "202213522 소일전 " +
                    "이 기사는 사진이 포함된 첫번째 기사 예시입니다.",
            commentType = YtXiaoCommentType.COMMENT,
            commentCount = 0
        ),
        YtxiaoArticle(
            title = "사진 있는 기사 1",
            content = "이 기사는 사진이 포함된 첫번째 기사 예시입니다.",
            commentType = YtXiaoCommentType.COMMENT,
            commentCount = 0
        ),
        YtxiaoArticle(
            title = "사진 있는 기사 1",
            content = "이 기사는 사진이 포함된 첫번째 기사 예시입니다.",
            commentType = YtXiaoCommentType.COMMENT,
            commentCount = 0
        ),
        YtxiaoArticle(
            title = "사진 있는 기사 1",
            content = "이 기사는 사진이 포함된 첫번째 기사 예시입니다.",
            commentType = YtXiaoCommentType.COMMENT,
            commentCount = 0
        ),
        YtxiaoArticle(
            title = "사진 있는 기사 1",
            content = "이 기사는 사진이 포함된 첫번째 기사 예시입니다.",
            commentType = YtXiaoCommentType.COMMENT,
            commentCount = 0
        ),
    )
}