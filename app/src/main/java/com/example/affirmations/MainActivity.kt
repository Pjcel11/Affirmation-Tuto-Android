package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations() //1 je charge mes données
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view) //2 je link recycler view a celui du code
        recyclerView.adapter = ItemAdapter(this, myDataset) //3 je set l'adapter
        /*Pour indiquer à recyclerView d'utiliser la classe ItemAdapter que vous avez créée, créez une instance ItemAdapter. ItemAdapter attend deux paramètres : le contexte (this) de cette activité et les affirmations dans myDataset.
Affectez l'objet ItemAdapter à la propriété adapter de la recyclerView*/

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)/* ici Rviex a taille fixee donc on peut mettre ca
        mais c pas forcement le cas*/

        // Servait a afficher longuueur de la liste en Datasource au lieu du hello World
        //val textView: TextView = findViewById(R.id.textview)
        //textView.text = Datasource().loadAffirmations().size.toString()
    }
}