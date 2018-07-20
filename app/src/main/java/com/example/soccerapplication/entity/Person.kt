package com.example.soccerapplication.entity


import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.support.annotation.NonNull
import org.jetbrains.annotations.Nullable

@Entity(
        tableName = "person",
        indices = [
            Index(value = ["id"], name = "person_index", unique = false)
        ]
)
abstract class Person constructor(

        @NonNull
        @ColumnInfo(name = "id")
        private val id : String,

        @NonNull
        @ColumnInfo(name = "name")
        private val name : String,

        @NonNull
        @ColumnInfo(name = "email")
        private val email: String,


        @Nullable
        @ColumnInfo(name = "phone")
        private val phone : String?,

        @NonNull
        @ColumnInfo(name = "birth_date")
        private val birthDate: Long,

        @NonNull
        @ColumnInfo(name = "favorite_team")
        private val favoriteTeam: String
) {







}
