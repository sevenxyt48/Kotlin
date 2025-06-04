package com.example.week14.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.week14.viewmodel.ItemEntity
import com.example.week14.viewmodel.ItemRepository
import com.example.week14.viewmodel.ItemViewModel
import com.example.week14.viewmodel.ItemViewModelFactory
import com.google.firebase.Firebase
import com.google.firebase.database.database

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val table = Firebase.database.getReference("Products/items")
    val itemViewModel: ItemViewModel = viewModel(factory = ItemViewModelFactory(ItemRepository(table)))
    val itemListState by itemViewModel.itemList.collectAsState(initial = emptyList())

    var selectedItemEntity by remember{ mutableStateOf<ItemEntity?>(null) }

    val selectedEvent = {itemEntity: ItemEntity -> selectedItemEntity = itemEntity}

    Column {
        InputScreen(viewModel = itemViewModel, selectedItemEntity)
        ItemList(list = itemListState, selectedEvent)
    }
//    Column {
//        InputScreen(viewModel(), selectedItem = null)
//        ItemListScreen(viewModel())
//    }
}