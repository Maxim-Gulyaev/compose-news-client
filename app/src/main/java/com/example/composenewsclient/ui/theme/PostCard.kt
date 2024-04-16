package com.example.composenewsclient.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.ChatBubble
import androidx.compose.material.icons.outlined.Light
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composenewsclient.R

@Composable
fun PostCard() {
     Card(
         modifier = Modifier
             .fillMaxSize()
     ) {
         Column(
             modifier = Modifier
                 .padding(horizontal = 8.dp)
         ) {
             PostHeader()
             Text(
                 text = stringResource(R.string.loren_ipsum)
             )
             Spacer(modifier = Modifier.height(8.dp))
             Image(
                 modifier = Modifier.fillMaxWidth(),
                 painter = painterResource(id = R.drawable.post_content_image),
                 contentDescription = "",
                 contentScale = ContentScale.FillWidth
             )
             Statistics()
         }
     }
}

@Composable
private fun PostHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            painter = painterResource(id = R.drawable.post_comunity_thumbnail),
            contentDescription = ""
        )
        Spacer(Modifier.width(8.dp))
        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            Text(
                text = "/dev/null",
                color = MaterialTheme.colorScheme.onPrimary
            )
            Spacer(Modifier.width(4.dp))
            Text(
                text = "14:00",
                color = MaterialTheme.colorScheme.onSecondary
            )
        }
        Icon(
            imageVector = Icons.Rounded.MoreVert,
            contentDescription = "",
            tint = MaterialTheme.colorScheme.onSecondary
        )
    }
}

@Composable
private fun Statistics() {
    Row(
        modifier = Modifier
            .padding(top = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            IconWithText(R.drawable.ic_views_count, "916")
        }
        Row(
            modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconWithText(R.drawable.ic_share, "9")
            IconWithText(R.drawable.ic_comment, "384")
            IconWithText(R.drawable.ic_like, "16")
        }
    }
}

@Composable
private fun IconWithText(
    iconResId: Int,
    text: String
) {
    Row {
        Icon(
            painterResource(id = iconResId),
            contentDescription = "",
            tint = MaterialTheme.colorScheme.onSecondary
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = text,
            color = MaterialTheme.colorScheme.onSecondary)
    }
}

@Preview
@Composable
fun LightPreview() {
    ComposeNewsClientTheme(
        darkTheme = false
    ){
        PostCard()
    }
}

@Preview
@Composable
fun DarkPreview() {
    ComposeNewsClientTheme(
        darkTheme = true
    ){
        PostCard()
    }
}