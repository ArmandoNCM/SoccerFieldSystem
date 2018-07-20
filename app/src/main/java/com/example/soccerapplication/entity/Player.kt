package com.example.soccerapplication.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.support.annotation.NonNull
import android.support.annotation.Nullable


@Entity(
        tableName = "player",
        inheritSuperIndices = true
)
class Player constructor(
        id : String,
        name : String,
        email : String,
        @Nullable
        phone : String?,
        birthDate : Long,
        favoriteTeam : String,
        @NonNull
        @ColumnInfo(name = "position")
        private var position : String,

        @NonNull
        @ColumnInfo(name = "number")
        private var number : Byte,

        @NonNull
        @ColumnInfo(name = "dominant_leg")
        private var dominantLeg : String
        ) : Person(id, name, email, phone, birthDate, favoriteTeam)  {



}