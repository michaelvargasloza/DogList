package com.example.doglist

import com.google.gson.annotations.SerializedName

//@SerializedName recibe el nombre del parámetro a recibir para que nosotros podamos renombrar las variables
data class DogResponse (
    @SerializedName ("status") var status:String,
    @SerializedName ("message") var images:List<String>)