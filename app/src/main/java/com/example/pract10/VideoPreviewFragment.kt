package com.example.pract10

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import com.example.pract10.databinding.FragmentVideoPreviewBinding

class VideoPreviewFragment : Fragment() {

    private lateinit var binding: FragmentVideoPreviewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_video_preview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentVideoPreviewBinding.bind(view)

        val videoUri = arguments?.getString("uri")
        binding.videoView.setVideoURI(Uri.parse(videoUri))
        binding.videoView.setMediaController(MediaController(requireContext()));
        binding.videoView.requestFocus(0);
        binding.videoView.start()
    }
}