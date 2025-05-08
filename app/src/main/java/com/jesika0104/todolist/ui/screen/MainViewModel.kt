package com.jesika0104.todolist.ui.screen

import androidx.lifecycle.ViewModel
import com.jesika0104.todolist.model.Task

class MainViewModel : ViewModel() {
    val data = listOf(
        Task(
            1,
            "Belajar Android Studio",
            "Belajar membuat aplikasi menggunakan Jetpack Compose dan Room.",
            "2025-05-09 12:34:56"
        ),
        Task(
            2,
            "Baca Buku",
            "Pemrograman - Robert C. Martin.",
            "2025-05-10 12:34:56"
        ),
        Task(
            3,
            "Olahraga",
            "Lari pagi selama 30 menit di taman.",
            "2025-05-11 12:34:56"
        ),
        Task(
            4,
            "Belajar Ngoding",
            "Belajar buat aplikasi To Do List pakai compose.",
            "2025-05-13 12:34:56"
        ),
        Task(
            5,
            "Kerja kelompok",
            "Melanjutkan progress tugas besar Teksif.",
            "2025-05-14 12:34:56"
        ),
        Task(
            6,
            "Review pelajaran",
            "Review pelajaran yang sudah dibahas di kelas",
            "2025-05-15 12:34:56"
        ),
    )
}