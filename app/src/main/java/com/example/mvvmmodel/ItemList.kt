package com.example.mvvmmodel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ItemList(
    val results:List<Result>
):Parcelable
@Parcelize data class Result(val image:String,val name:String,val status:String,val species:String,val gender:String):Parcelable