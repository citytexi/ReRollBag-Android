package com.mediaproject.presentation.widgets.states

import com.mediaproject.domain.model.ReRollBagMarker

sealed class AdminHomeUIState(
    open val qrScanState: QrScanState,
    open val locationState: LocationState,
    open val markerList: List<ReRollBagMarker>,
) {

    object Init : AdminHomeUIState(
        qrScanState = QrScanState.Init,
        locationState = LocationState.Init,
        markerList = listOf()
    )

    data class Update(
        override val qrScanState: QrScanState,
        override val locationState: LocationState,
        override val markerList: List<ReRollBagMarker>,
    ) : AdminHomeUIState(
        qrScanState = qrScanState,
        locationState = locationState,
        markerList = markerList,
    )

}
