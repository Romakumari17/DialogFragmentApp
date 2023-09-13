package com.romakumari.dialogfragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.romakumari.dialogfragmentapp.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.webview.loadUrl("https://in.pinterest.com/")
        binding.webview.settings.javaScriptEnabled = true
    }
}