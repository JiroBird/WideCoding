package com.github.jirobird.studingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.jirobird.studingsample.maps.MapFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fcv_fragment_container, MapFragment(), MapFragment::javaClass.name)
            .commit()
    }
}