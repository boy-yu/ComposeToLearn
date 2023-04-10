package com.compose.composetolearn

import android.content.res.Configuration
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.compose.composetolearn.ui.theme.ComposeToLearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ComposeToLearnTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
//            }
            AndroidView(factory = {context ->
                WebView(context).apply {
                    settings.javaScriptEnabled = true
                    webViewClient = WebViewClient()
                    loadUrl("https://jetpackcompose.cn")
                }
            }, modifier = Modifier.fillMaxSize())
        }
    }
}
//
//@Composable
//fun Greeting(name: String) {
//    ComposeToLearnTheme{
//        Text(text = "Hello $name!")
//    }
//}
////设置Pixel设备中预览
//@Preview(device = Devices.PIXEL, showSystemUi = true)
//@Composable
//fun DefaultPreview() {
//    ComposeToLearnTheme {
//        Greeting("Android")
//    }
//}

