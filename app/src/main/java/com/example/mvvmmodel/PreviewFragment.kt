package com.example.mvvmmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.DialogFragment

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class PreviewFragment (private val iconImageResource: String): DialogFragment() {
    private lateinit var previewImage:ImageView
    private lateinit var closeButton:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_preview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        previewImage = view.findViewById(R.id.previewImage)
        closeButton = view.findViewById(R.id.closeButton)
        previewImage.setImage(iconImageResource)
        closeButton.setOnClickListener{
            dismiss()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(iconImageResource: String): PreviewFragment{
            return PreviewFragment(iconImageResource)
            }
    }
}