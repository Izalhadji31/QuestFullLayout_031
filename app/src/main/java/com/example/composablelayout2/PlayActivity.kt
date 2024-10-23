package com.example.composablelayout2

import android.graphics.drawable.shapes.OvalShape
import android.preference.PreferenceActivity.Header
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun PlayActivity(){
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderSection()
        Text(text = "Kepada Yth,",
            fontSize = 20.sp)
        Text(text = "Muh. Syafrizal H.A,",
            fontSize = 20.sp)
        Spacer(modifier = Modifier.size(50.dp))
        DetailSurat(
            judul = "Nama", isinya = "Muh. Syafrizal H.A."
        )
        DetailSurat(
            judul = "Email", isinya = "ryzalhadji@gmail.com"
        )
        DetailSurat(
            judul = "NoTelp", isinya = "0831331"
        )
        DetailSurat(
            judul = "Ket", isinya = "Pam"
        )
    }
}

@Composable
fun HeaderSection(){
    Box(modifier = Modifier.fillMaxWidth()
        .background(color = Color.Gray)
        .padding(15.dp)){
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            Column {
                Text(text = "Daerah Kampus merdeka",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "Fax = 031-31313131, Tlp = 08313131",
                    color = Color.White
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ){
                Image(painter = painterResource(id = R.drawable.km),
                    contentDescription = "", modifier = Modifier.size(85.dp)
                        .clip(CircleShape)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null)
            }
        }
    }
}

@Composable
fun DetailSurat(
    judul: String, isinya: String
){
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Row(modifier = Modifier.fillMaxWidth().padding(top = 12.dp
        )){
            Text(
                text = judul,
                modifier = Modifier.weight(0.3f),
                fontSize = 18.sp
            )
            Text(text = ":",
                modifier = Modifier.weight(0.2f),
                fontWeight = FontWeight.Bold
            )
            Text(text = isinya,
                modifier = Modifier.weight(0.9f),
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}



