package com.example.pract10

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pract10.databinding.FragmentImagePreviewBinding

class ImagePreviewFragment : Fragment() {

    private lateinit var binding: FragmentImagePreviewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_image_preview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentImagePreviewBinding.bind(view)

        val imageUri = arguments?.getString("uri")
        binding.imageView.setImageURI(Uri.parse(imageUri))
    }
}