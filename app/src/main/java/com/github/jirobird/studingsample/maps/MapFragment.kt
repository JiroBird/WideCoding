package com.github.jirobird.studingsample.maps

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.github.jirobird.studingsample.R

class MapFragment():Fragment() {
    private lateinit var b:Button
    private lateinit var t:TextView

    private var mv:ViewModel? = null
    private var state:Response?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_map, container, false) ?: super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        b = view.findViewById(R.id.b_request_time)
        t = view.findViewById(R.id.tv_result)

        b.setOnClickListener {
            mv.askTime()
        }

        mv.subscribeTimeValue(){ response ->
            when state {
                error ->
                waiting -> {
                    включить крутилку
            }
            }
            t.setText(response.raw.text)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onDetach() {
        super.onDetach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}