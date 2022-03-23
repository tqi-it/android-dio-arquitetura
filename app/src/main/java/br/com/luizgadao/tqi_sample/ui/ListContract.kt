package br.com.luizgadao.tqi_sample.ui

import br.com.luizgadao.tqi_sample.ui.data.JsonResponse

interface ListContract {
    interface View {
        fun setupUI()
        fun showLoading()
        fun hideLoading()
        fun updateUI(jsonResponse: JsonResponse?)
    }

    interface Presenter {
        fun initialize()
        fun load()
    }
}