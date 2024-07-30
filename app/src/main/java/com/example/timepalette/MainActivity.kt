package com.example.timepalette

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.timepalette.ui.theme.TimePaletteTheme

class MainActivity : ComponentActivity() {
    lateinit var btn : Button
    lateinit var title : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calenderlayout)
//        var asdf = false
//        btn = findViewById(R.id.btn)
//        title = findViewById(R.id.titleText)
//        btn.setOnClickListener{
//            if(!asdf){
//                title.text = getString(R.string.hello_world)
//                asdf = true
//            } else {
//                title.text = "La La La"
//                asdf = false
//            }
//        }
    }
}
