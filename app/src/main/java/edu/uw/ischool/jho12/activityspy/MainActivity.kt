package edu.uw.ischool.jho12.activityspy

import android.os.Bundle
import android.util.Log
import androidx.compose.ui.unit.dp
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import edu.uw.ischool.jho12.activityspy.ui.theme.ActivitySpyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate event fired - savedInstanceState: $savedInstanceState")
        setContent {
            ActivitySpyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("UW")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy event fired")
        Log.e("MainActivity", "We're going down, Captain!")
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Greetings, $name!")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Whoa")
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "--Neo, The Matrix",
            fontStyle = FontStyle.Italic
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActivitySpyTheme {
        Greeting("UW")
    }
}