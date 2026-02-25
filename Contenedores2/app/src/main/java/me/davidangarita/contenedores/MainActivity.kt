package me.davidangarita.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.davidangarita.contenedores.ui.theme.ContenedoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.imagecheck),
                    contentDescription = "Imagen check",
                    modifier = Modifier.size(450gi.dp)
                )




        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun ContentScreen(){
    Column(modifier = Modifier
        .background(Color.Magenta)
        .padding(18.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(modifier = Modifier
            .background(Color.Blue)
            .padding(18.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                text= "Incio",
                fontSize = 25.sp,
                modifier = Modifier
                    .background(Color.Red))

            Text(text= "Perfil",
                fontSize = 25.sp,
                modifier = Modifier
                    .background(Color.Yellow))

            Text(text= "Configuracion",
                fontSize = 25.sp,
                modifier = Modifier
                    .background(Color.Gray))


        }

        Text(text= "Texto",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Gray))
        Text(text= "Texto",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Gray))
        Text(text= "Texto",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Gray))



    }}}




