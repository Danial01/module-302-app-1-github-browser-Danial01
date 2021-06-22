package com.example.github_browser.model


import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class License(
    @SerializedName("key")
    val key: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("node_id")
    val nodeId: String? = "",
    @SerializedName("spdx_id")
    val spdxId: String? = "",
    @SerializedName("url")
    val url: String? = ""
): Parcelable

