package com.example.landmarkkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var landmarkList:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Landmark sınıfı oluşturarak özellikleri kolay bir şekilde almayı sağladık
        val pisa = Landmark("PISA", "ITALY", R.drawable.pisa);
        val eiffel = Landmark("EIFFEL TOWER", "FRANCE", R.drawable.eiffel);
        val colosseum = Landmark("COLOSSEUM", "ITALY", R.drawable.colosseum);
        val big_ben = Landmark("BIG BEN", "ENGLAND", R.drawable.big_ben_tower);
        val london_bridge = Landmark("LONDON BRIDGE", "ENGLAND", R.drawable.london_bridge);
        val taj_mahal = Landmark("TAJ MAHAL", "INDIA", R.drawable.taj_mahal);
        val peri_bacalari = Landmark("PERI BACALARI", "TURKEY", R.drawable.peri_bacalari);
        val chandeokgung = Landmark("CHANDEOKGUNG", "KOREA", R.drawable.changdeokgung);
        val la_sagra_da_familia = Landmark("LA SAGRA DA\n\t\tFAMILIA", "SPAIN", R.drawable.la_sagrada_familia);
        val louvre_museum = Landmark("LOUVRE MUSEUM", "FRANCE", R.drawable.louvre_museum);
        val aya_sofia = Landmark("AYA SOFYA", "TURKEY", R.drawable.ayasofia);
        val cinque_terre = Landmark("CINQUE TERRE", "ITALY", R.drawable.cinque_terre);

        //ArrayList ile tüm verileri tek bir liste içinde topladık
        landmarkList=ArrayList<Landmark>()
        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(colosseum)
        landmarkList.add(big_ben)
        landmarkList.add(london_bridge)
        landmarkList.add(taj_mahal)
        landmarkList.add(peri_bacalari)
        landmarkList.add(chandeokgung)
        landmarkList.add(la_sagra_da_familia)
        landmarkList.add(louvre_museum)
        landmarkList.add(aya_sofia)
        landmarkList.add(cinque_terre)


        //LISTVIEW KULLANIMI
        //ADAPTER:Layout & data yı birbirine bağlar ve listview/recyclerview gibi görünümlere bağlanıp bunları kullanıcıya göstermemize olanak sağlar
        //Mapping:Bir veriyi başka bir çevirmeye yarar
        /*val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name})
        binding.listView.adapter=adapter
        binding.listView.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->
            //Verileri diğer aktiviteye aktardık
            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            startActivity(intent)
        }
        */


        //RECYCLERVIEW
        binding.recyclerView.layoutManager=LinearLayoutManager(this)

        val landmarkAdapter=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landmarkAdapter



    }
}