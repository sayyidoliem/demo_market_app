package com.example.kampusappdemo.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material.icons.outlined.RemoveCircleOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.demomarketapp.R

@Composable
fun CardListHomeDemo(
    nameCampus: String,
    location: String,
    image: Int,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .padding(16.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Column(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
            Image(
                modifier = Modifier
                    .widthIn(max = 300.dp)
                    .aspectRatio(16f / 9f),
                painter = painterResource(id = image),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )

            Text(
                modifier = Modifier.padding(8.dp),
                text = "${nameCampus}\n${location}",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.bodyLarge,
            )
        }
    }
}

@Composable
fun CardLastSeenHomeDemo(
    nameCampus: String,
    location: String,
    image: Int,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .padding(16.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Column(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 200.dp),
                painter = painterResource(id = image),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )

            Text(
                modifier = Modifier.padding(8.dp),
                text = "${nameCampus}\n${location}",
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.bodyLarge,
            )
        }
    }
}

@Composable
fun CardListSearchDemo(
    nameCampus: String,
    ppp: String,
    image: Int,
    location: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .padding(16.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Column(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .defaultMinSize(minWidth = 56.dp, minHeight = 56.dp)
                    .heightIn(max = 200.dp),
                painter = painterResource(id = image),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = "${nameCampus}\n${ppp}",
                    fontWeight = FontWeight.SemiBold,
                    style = MaterialTheme.typography.bodyLarge,
                )
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = location,
                    fontWeight = FontWeight.Normal,
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardListCartDemo() {
    ListItem(
        leadingContent = {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = ""
            )
        },
        headlineContent = { Text(text = "Product Name") },
        supportingContent = {
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier.size(12.dp),
                        imageVector = Icons.Default.Circle,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(text = "Vendor Name")
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier.size(12.dp),
                        imageVector = Icons.Default.Circle,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(text = "Delivery type")
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier.size(12.dp),
                        imageVector = Icons.Default.Circle,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Text(text = "Price")
                }
            }
        },
        trailingContent = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Outlined.AddCircleOutline, contentDescription = "")
                }
                Text(text = "0")
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Outlined.RemoveCircleOutline, contentDescription = "")
                }
            }
        }
    )
}

@Composable
fun CardPaymentMethodDemo() {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .defaultMinSize(minWidth = 120.dp)
            .clip(RoundedCornerShape(10.dp)),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .defaultMinSize(minHeight = 100.dp)
                .align(Alignment.CenterHorizontally),
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            text = "Bank",
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardProfileDemo() {
    Card {
        ListItem(
            headlineContent = {
                Text(text = "Name")
            },
            supportingContent = {
                Text(text = "Aksa Akakaak")
            }
        )
        Divider()
        ListItem(
            headlineContent = {
                Text(text = "Phone Number")
            },
            supportingContent = {
                Text(text = "+123 - 4567 - 8910")
            }
        )
        Divider()
        ListItem(
            headlineContent = {
                Text(text = "E - Mail")
            },
            supportingContent = {
                Text(text = "Blablabla@gmail.com")
            }
        )
    }
}