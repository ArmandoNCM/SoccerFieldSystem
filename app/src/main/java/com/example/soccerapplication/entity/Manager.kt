package com.example.soccerapplication.entity

import android.arch.persistence.room.Entity
import android.support.annotation.Nullable

@Entity(
        tableName = "manager",
        inheritSuperIndices = true
)
class Manager constructor(
        id : String,
        name : String,
        email : String,
        @Nullable
        phone : String?,
        birthDate : Long,
        favoriteTeam : String

) : Person(id, name, email, phone, birthDate, favoriteTeam) {




}