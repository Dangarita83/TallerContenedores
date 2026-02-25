package me.davidangarita.jetpackbsicocontenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.davidangarita.jetpackbsicocontenedores.ui.theme.JetpackBásicoContenedoresTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ContentScreen(){
    Column(modifier = Modifier.background(Color.Gray).padding(12.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.background(Color.Yellow).padding(18.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Inicio",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Red)
            )
            Text(
                text = "Perfil",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Green)
            )
            Text(
                text = "Configuración",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Red)
            )
        }
        Text(
            text = "Kasane",
            fontSize = 25.sp,
            modifier = Modifier.background(Color.Magenta)
        )
        Text(
            text = "Teto",
            fontSize = 25.sp,
            modifier = Modifier.background(Color.Red)
        )

    }
}