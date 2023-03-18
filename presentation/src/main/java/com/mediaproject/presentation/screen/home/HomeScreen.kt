package com.mediaproject.presentation.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.mediaproject.presentation.screen.vm.MapViewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    mapViewModel: MapViewModel = hiltViewModel(),
    onClickQrScan: () -> Unit = {},
    onClickMenu: () -> Unit = {},
) = Scaffold(
    topBar = {
        HomeScreenAppBar {
            onClickMenu()
        }
    },
) { padding ->
    val uiState = mapViewModel.uiState.observeAsState()

    uiState.value?.let {
        HomeScreenBody(
            modifier = modifier.padding(padding),
            locationState = it.locationState,
            qrScanState = it.qrScanState,
            isRent = it.isRentState,
            onChangeRent = { value ->
                mapViewModel.updateIsRent(isRent = value)
            },
            clearQrScanState = {
                mapViewModel.clearQrScan()
            }
        ) {
            onClickQrScan()
        }
    }
}