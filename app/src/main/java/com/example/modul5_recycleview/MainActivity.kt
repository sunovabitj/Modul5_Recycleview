package com.example.modul5_recycleview

import List_MahasiswaAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cobarv.Inis_Variable
import com.example.modul05_recycleview.R

class MainActivity : AppCompatActivity() { private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(Inis_Variable(
            R.drawable. anis,
            namamhs = "Annisa Azka Putri Zahra",
            Nimmhs = "20102306",
            Telpmhs = "082124209224"
        ),
        Inis_Variable(
            R.drawable. bianca,
            namamhs = "bianca rayhanna ramadhanti moksen",
            Nimmhs = "20102122",
            Telpmhs = "081262072733"
        ),
        Inis_Variable(
            R.drawable. ibra,
            namamhs = "Naufa Ibrahim",
            Nimmhs = "20102165",
            Telpmhs = "083123786513"
        ),
        Inis_Variable(
            R.drawable. eros,
            namamhs = "Feurozsandy",
            Nimmhs = "20102312",
            Telpmhs = "08154238976"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)
        ShowListMahasiswa()
    }
    private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter= List_MahasiswaAdapter(this,
            Datamahasiswa){
        }
    }
}