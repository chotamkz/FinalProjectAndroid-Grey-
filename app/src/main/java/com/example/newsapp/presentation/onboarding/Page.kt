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
        description = "Kazakhstan is home to large oil, gas and metal deposits and is the largest economy in former Soviet Central Asia. It is the largest of the five ex-Soviet Central Asian republics by territory, or about five times the size of France, and has a population of nearly 19 million",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Do u Know?",
        description = "Most readers only skim. They read headlines until they find an article that interests them" ,
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Do You Know?",
        description = "adfcadfcasdsadcdsavsdv",
        image = R.drawable.onboarding3
    )

)
