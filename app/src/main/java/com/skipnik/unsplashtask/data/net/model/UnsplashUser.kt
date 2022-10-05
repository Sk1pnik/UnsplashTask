package com.skipnik.unsplashtask.data.net.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashUser(
    val name: String,
    val username: String
) : Parcelable {
}
