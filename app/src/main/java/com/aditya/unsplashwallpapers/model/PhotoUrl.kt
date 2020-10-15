package com.aditya.unsplashwallpapers.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PhotoUrl(
    var raw:String,
    var full:String,
    var regular:String,
    var small:String,
    var thumb:String
):Parcelable {
}