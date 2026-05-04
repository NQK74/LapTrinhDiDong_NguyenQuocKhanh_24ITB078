package com.example.myapplication

import com.example.myapplication.data.Item
import com.example.myapplication.ui.item.toItem
import com.example.myapplication.ui.item.toItemDetails
import org.junit.Assert.assertEquals
import org.junit.Test

class ItemUiStateTest {
    @Test
    fun itemDetails_roundTrip_mapsValuesCorrectly() {
        val source = Item(id = 7, name = "Apples", price = 12.5, quantity = 3)

        val mappedBack = source.toItemDetails().toItem()

        assertEquals(source.id, mappedBack.id)
        assertEquals(source.name, mappedBack.name)
        assertEquals(source.price, mappedBack.price, 0.0)
        assertEquals(source.quantity, mappedBack.quantity)
    }
}

