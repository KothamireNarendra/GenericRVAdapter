package com.techguys.genericadapter

abstract class ListItemViewModel{
    var adapterPosition: Int = -1
    var onListItemViewClickListener: GenericAdapter.OnListItemViewClickListener? = null
}