package com.example.grafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.grafica.databinding.ActivityMainBinding
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate


class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            binding = ActivityMainBinding.inflate(layoutInflater)
            val view =binding.root

            setContentView(view)

            var myChart: PieChart = binding.pieChart1

            var datalist: ArrayList<PieEntry> = arrayListOf()
            for( i in 0 until 5){
                datalist.add(PieEntry((Math.random() * 5 / 5).toFloat()))
                val dataSet= PieDataSet(datalist, "Resultados")

                val data = PieData(dataSet)
                myChart.setData(data)


            }
        }
    }