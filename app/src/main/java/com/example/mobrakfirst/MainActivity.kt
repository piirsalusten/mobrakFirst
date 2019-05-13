package com.example.mobrakfirst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.esri.arcgisruntime.mapping.ArcGISMap
import com.esri.arcgisruntime.mapping.Basemap
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val map = ArcGISMap(Basemap.Type.TOPOGRAPHIC, 59.4250354, 24.7438692, 16)
        mapView.map = map
    }

    override fun onPause() {
        super.onPause()
        mapView.pause()
    }
    override fun onResume() {
        super.onResume()
        mapView.resume()
    }
    override fun onDestroy() {
        super.onDestroy()
        mapView.dispose()
    }
}
