package com.example.newsapp.presentation.details

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.usecases.news.NewsUseCases
import com.example.newsapp.domain.usecases.news.UpsertArticle
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val newsUseCases: NewsUseCases
): ViewModel() {
    var sideEffect by mutableStateOf<String?>(null)
        private set

    fun onEvent(event: DetailsEvent){
        when(event)
        {
            is DetailsEvent.UpsertDeleteArticle-> {
                viewModelScope.launch {
                    val article = newsUseCases.selectArticle2(event.article.url)
                    if(article == null){
                        upsertArticle(event.article)
                    }else
                    {
                        deleteArticle(event.article)

                    }

                }
            }
            is DetailsEvent.RemoveSideEffect -> {
                sideEffect = null
            }
        }
    }

    private suspend fun deleteArticle(article: Article) {
        newsUseCases.deleteArticle(article = article)
        sideEffect = "News Deleted"

    }

    private suspend fun upsertArticle(article: Article) {
        newsUseCases.upsertArticle(article = article)
        sideEffect = "News Saved"


    }

}