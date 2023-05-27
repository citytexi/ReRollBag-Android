package com.mediaproject.presentation.screen.admin.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AdminHomeScreen(
    modifier: Modifier = Modifier,
    onClickMenu: () -> Unit = {},
) = Scaffold(
    topBar = {
        AdminHomeScreenAppBar {
            onClickMenu()
        }
    },
) { padding ->
    AdminHomeScreenBody(
        modifier = modifier.padding(padding),
    )
}
