package com.stmik.myrecyclerview

import android.view.View

interface RecyclerViewClickListener {

    // method yang akan dipanggil di MainActivity
    fun onItemClickListener(view: View, book: Book)

}

