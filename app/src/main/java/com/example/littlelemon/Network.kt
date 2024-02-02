package com.example.littlelemon

import androidx.room.Room
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/*
Network.kt– This file contains network data models.
JSON data will be converted to these models.
 */


// step-02-1: Representing the menu and menu items
@Serializable
data class MenuNetwork(
    val menu: List<MenuItemNetwork>
)

@Serializable
data class MenuItemNetwork(
    val id: Int,
    val title: String,
    val price: String
) {
    // step-02-03: Store data in Room Database
    fun toMenuItemRoom() = MenuItemRoom(
        id = id, title = title, price = price.toDouble()
    )
}
