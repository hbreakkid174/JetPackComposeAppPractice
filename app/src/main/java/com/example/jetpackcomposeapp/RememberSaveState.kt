package com.example.jetpackcomposeapp

import android.os.Parcelable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.mapSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.parcelize.Parcelize

@Parcelize
data class ParcelTest(val name: String, val subName: String) : Parcelable

data class MapSaverTest(val mapName: String, val mapValue: String)

data class ListSaverTest(val name: String)

@Composable
fun ParcelTestComp(modifier: Modifier = Modifier) {
    val parcelTest = rememberSaveable {
        mutableStateOf(ParcelTest("parcelTest", "testing It"))
    }

    Column {
        Text(text = "Name: ${parcelTest.value.name}")
        Spacer(modifier = modifier.padding(all = 10.dp))
        Text(text = "SUb Name: ${parcelTest.value.subName}")
        Spacer(modifier = modifier.padding(all = 15.dp))
        Button(onClick = {
            val newParcelTest = ParcelTest("new Value", "Testing Phase")
            parcelTest.value = newParcelTest
        }) {
            Text(text = "CLick")
        }
    }

}

val MapSaver = run {
    val mapNameKey = "mapNameKey"
    val mapValueKey = "mapValueKey"
    mapSaver(save = { mapOf(mapNameKey to it.mapName, mapValueKey to it.mapValue) },
        restore = { MapSaverTest(it[mapNameKey] as String, it[mapValueKey] as String) })
}

@Composable
fun MapSaverTestComp(modifier: Modifier = Modifier) {
    val mapRemember = rememberSaveable(stateSaver = MapSaver) {
        mutableStateOf(MapSaverTest("Mapping", "MapValued"))
    }
    Column {
        Text(text = "Map Name: ${mapRemember.value.mapName}")
        Spacer(modifier = modifier.padding(all = 10.dp))
        Text(text = "Map Value: ${mapRemember.value.mapValue}")
        Spacer(modifier = modifier.padding(all = 15.dp))
        Button(onClick = {
            val mapSaverNew =
                MapSaverTest(mapName = "mapping value new", mapValue = "mapping to new")
            mapRemember.value = mapSaverNew
        }) {
            Text(text = "CLick")
        }
    }
}

val ListSaver = listSaver<ListSaverTest, Any>(save = { listOf(it.name) },
    restore = { ListSaverTest(it[0] as String) })

@Composable
fun ListSaverTestComp(modifier: Modifier = Modifier) {
    val listRemember = rememberSaveable(stateSaver = ListSaver) {
        mutableStateOf(ListSaverTest(name = "ListNaming"))
    }
    Column {
        Text(text = "Map Name: ${listRemember.value.name}")
        Spacer(modifier = modifier.padding(all = 15.dp))
        Button(onClick = {
            val listSaverNew = ListSaverTest(name = "New List Naming")
            listRemember.value = listSaverNew
        }) {
            Text(text = "CLick")
        }
    }
}