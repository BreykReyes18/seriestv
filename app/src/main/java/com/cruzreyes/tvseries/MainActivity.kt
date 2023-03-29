package com.cruzreyes.tvseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.cruzreyes.tvseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var series = emptyArray<String>()
    lateinit var arrayAdapter: ArrayAdapter<*>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val series = arrayOf(
            "serie1",
            "serie2",
            "serie3",
            "serie4",
            "serie5",
            "serie6",
            "serie7",
            "serie8",
            "serie9",
            "serie10",
            "serie11",
            "serie12",
            "serie13",
            "serie14",
            "serie15",
            "serie16",
            "serie17",

        )

        var itemsAdapter = ArrayAdapter<String>(MainActivity@this,android.R.layout.simple_list_item_1, series)
        binding.tvList.adapter = itemsAdapter
    }
}