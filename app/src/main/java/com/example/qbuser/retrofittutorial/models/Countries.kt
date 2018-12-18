package com.example.qbuser.retrofittutorial.models

import com.google.gson.annotations.SerializedName


data class Country(
    @SerializedName('id') val id: Int,
    @SerializedName('name') val name:String,
    @SerializedName('isd_code') val isdCode: String,
    @SerializedName('icon') val flagUrl: String,
    @SerializedName('code') val code: String,
    @SerializedName('fars_name') val farsName: String,
    @SerializedName('arab_name') val arabName: String,
    @SerializedName('y_position') val yPosition: String,
    @SerializedName('index') val index: String,
    @SerializedName('iso_code_3') val iso3Code: String


)
