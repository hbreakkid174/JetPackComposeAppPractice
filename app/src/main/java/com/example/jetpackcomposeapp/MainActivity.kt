package com.example.jetpackcomposeapp

import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.example.jetpackcomposeapp.ui.theme.JetPackComposeAppTheme
import com.example.mylibrary.saveEncryptedPrefValue
import com.example.mylibrary.toastShort
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetPackComposeAppTheme {
                val context = LocalContext.current

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    /*TextCompose(Alignment.Center, Color.Green)
                    TextCompose(Alignment.TopCenter, Color.Blue)
                    TextCompose(Alignment.BottomEnd,Purple80)
                    TextCompose(Alignment.CenterEnd,Pink80)*//*Row {
                        ImageTextColumn(
                            textOne = "Android", textTwo = "JetpackCompose", context = context
                        )
//                    Divider(thickness = 2.dp, color = colorResource(id = R.color.purple_500))
                        Spacer(modifier = Modifier.padding(10.dp))
                        ImageTextRow(
                            textOne = "Android", textTwo = "JetpackCompose", context = context
                        )
                    }*//*    LazyColumn {
                            items(getListOfText().size) { i ->

                                RoundImageText(
                                    textOne = getListOfText()[i].textOne,
                                    textTwo = getListOfText()[i].textTwo
                                )
                            }
                        }*/
//                    LaunchEffectTest()
//                    RememberCoroutineScopeTest()
                    /* RememberUpdateStateTest {
                         Log.d(TAG, "onCreate: RememberUpdateStateTest")
                     }*/
//                    val context= LocalContext
              /*      DisposeEffectTest(onStart = {
                        toastShort("on Start")

                    }, onStop = {
                        toastShort("on Stop")
                    })*/
                }
            }
        }
    }

    /*  private fun getListOfText(): List<TextModel> {
          return listOf(
              TextModel("ada", "adadadadadadada"),
              TextModel("dad", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadaddadadasdasdadsfsfsdfsfssfsdfsdfsfsfsadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadadaafadadajdadkladjadkadadadkadjalkda"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadaddasdasdasdasdasdadadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
              TextModel("ada", "adadadadadadada"),
          )
      }*/

}
@Composable
fun DisposeEffectTest(
    lifeCycleOwner: LifecycleOwner = LocalLifecycleOwner.current,
    onStart: () -> Unit,
    onStop: () -> Unit
) {
    val currentOnStart by rememberUpdatedState(newValue = onStart)
    val currentOnStop by rememberUpdatedState(newValue = onStop)
    DisposableEffect(key1 = lifeCycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_START) {
                currentOnStart()
            } else if (event == Lifecycle.Event.ON_STOP) {
                currentOnStop()
            }

        }
        lifeCycleOwner.lifecycle.addObserver(observer)
        onDispose {
            lifeCycleOwner.lifecycle.removeObserver(observer)
        }
    }
}

@Composable
fun RememberUpdateStateTest(timeOutValue: () -> Unit) {
    val currentTimeOut by rememberUpdatedState(newValue = timeOutValue)
    LaunchedEffect(key1 = true) {
        delay(1000L)
        currentTimeOut()
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 10.dp)
    ) {
        Text(text = "trying Our Best")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RememberCoroutineScopeTest(
    modifier: Modifier = Modifier,
    snackbarHostState: SnackbarHostState = SnackbarHostState(),

    ) {
    val rememberCoroutineScope = rememberCoroutineScope()
    var mLastClickTime by remember { mutableStateOf(0L) }

    Scaffold(snackbarHost = { SnackbarHost(hostState = snackbarHostState) }) {
        Column(modifier = modifier.padding(it)) {
            Button(onClick = {
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    Log.d(TAG, "RememberCoroutineScopeTest: return")
                    return@Button
                }
                Log.d(TAG, "RememberCoroutineScopeTest: triggered")
                mLastClickTime = SystemClock.elapsedRealtime()
                rememberCoroutineScope.launch {
                    snackbarHostState.showSnackbar(message = "rememberCoroutineScope working perfectly")
                }

            }) {
                Text(text = "Testing rememberCoroutineScope")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LaunchEffectTest(snackbarHostState: SnackbarHostState = SnackbarHostState()) {
    LaunchedEffect(key1 = snackbarHostState) {
        snackbarHostState.showSnackbar(message = "This is launch effect", actionLabel = "done")
    }
    Scaffold(snackbarHost = {
        SnackbarHost(hostState = snackbarHostState)
    }) {
        Log.d(TAG, "LaunchEffectTest: $it")
        Box(Modifier.padding(it))
    }

}

@Composable
fun RoundImageText(modifier: Modifier = Modifier, textOne: String, textTwo: String) {
    modifier.run {
        Row(modifier = modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.image222),
                contentDescription = "abc",
                modifier = size(40.dp)
                    .clip(shape = CircleShape)
                    .border(width = 1.dp, color = Color.Red, shape = CircleShape)
            )
            Spacer(modifier = width(8.dp))
            // We keep track if the message is expanded or not in this
            // variable
            var isExpanded by remember { mutableStateOf(false) }

            Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
                Text(text = textOne)
                Spacer(modifier = height(4.dp))
                Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.dp) {

                    Text(
                        text = textTwo,
                        color = MaterialTheme.colorScheme.primary,
                        // If the message is expanded, we display all its content
                        // otherwise we only display the first line
                        maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                        style = MaterialTheme.typography.titleMedium
                    )
                }

            }
        }
    }

}/*
@Composable
fun ImageTextRow(
    modifier: Modifier = Modifier, textOne: String, textTwo: String, context: Context
) {
    Row {

        Image(painter = painterResource(id = R.drawable.image222),
            contentDescription = stringResource(
                id = R.string.app_name
            ),
            modifier
                .width(60.dp)
                .height(60.dp)
                .clickable {
                    debug("first image click")
                    context.toastShort("first image click")
                })
        Column {

            Text(text = textOne, fontSize = 20.sp)
            Spacer(modifier = Modifier.padding(1.dp))
            Text(text = textTwo, fontSize = 15.sp)
        }


    }
}
*/

/*@Composable
fun ImageTextColumn(
    modifier: Modifier = Modifier, textOne: String, textTwo: String, context: Context
) {
    Column {

        Image(painter = painterResource(id = R.drawable.image222),
            contentDescription = stringResource(
                id = R.string.app_name
            ),
            modifier
                .width(60.dp)
                .height(60.dp)
                .clickable {
                    debug("first image click")
                    context.toastShort("first image click")
                })
        Text(text = textOne, fontSize = 20.sp)
        Text(text = textTwo, fontSize = 15.sp)

    }
}*//*
@Composable
fun TextCompose(alignment: Alignment,color: Color) {
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = alignment
    ) {

        Text(
            text = "hello", modifier = Modifier, fontSize = 60.sp, style = TextStyle(color = color)
        )
    }
}
*/

