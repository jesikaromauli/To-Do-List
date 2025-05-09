package com.jesika0104.todolist.navigation

import com.jesika0104.todolist.ui.screen.KEY_ID_TASK

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_TASK}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}