package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title : String,
    val description: String,
    @DrawableRes val image : Int
)


val pages = listOf(
    Page(
        title = "Do u Know?",
        description = "Across the globe, more than 24 billion newspapers are published every year." ,
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Do u Know?",
        description = "Most readers only skim. They read headlines until they find an article that interests them. " +
                "asdfafasdfasdfasdfasdfasdf",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Do u Know?",
        description = "Most readers only skim.They read headlines until they find an article that interests them. " +
                "asdfasdfasdfasdfasdfasdfsfsffsdfadf\n",
        image = R.drawable.onboarding3
    )

)
