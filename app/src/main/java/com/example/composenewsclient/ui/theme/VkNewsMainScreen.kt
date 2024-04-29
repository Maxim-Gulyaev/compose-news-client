package com.example.composenewsclient.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composenewsclient.MainViewModel
import com.example.composenewsclient.domain.FeedPost
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(viewModel: MainViewModel) {

    Scaffold(
        bottomBar = {
            NavigationBar {
                val selectedItemPosition = remember {
                    mutableIntStateOf(0)
                }
                val items = listOf(
                    NavigationItem.Home,
                    NavigationItem.Favourite,
                    NavigationItem.Profile
                )
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItemPosition.intValue == index,
                        onClick = { selectedItemPosition.intValue = index },
                        icon = {
                            Icon(item.icon, contentDescription = null)
                        },
                        label = {
                            Text(text = stringResource(id = item.titleResId))
                        },
                    )
                }
            }
        }
    ) {
        val feedPost = viewModel.feedPost.observeAsState(FeedPost())

        PostCard(
            modifier = Modifier.padding(8.dp),
            feedPost = feedPost.value,
            onViewsClickListener = viewModel::updateCount,
            onShareClickListener = viewModel::updateCount,
            onCommentClickListener = viewModel::updateCount,
            onLikeClickListener = viewModel::updateCount
        )
    }
}