package com.example.soccerapplication.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.support.annotation.NonNull

@Entity(tableName = "business")
class Business constructor(

        @NonNull
        @ColumnInfo(name = "city")
        private val city : String,

        @NonNull
        @ColumnInfo(name = "name")
        private val name : String,

        @NonNull
        @ColumnInfo(name = "address")
        private val address : String
){

}