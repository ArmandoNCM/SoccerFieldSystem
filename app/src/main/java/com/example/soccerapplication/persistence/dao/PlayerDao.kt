package com.example.soccerapplication.persistence.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.example.soccerapplication.entity.Player

@Dao
interface PlayerDao {

    @Query("SELECT * FROM player")
    fun getAllPlayers() : List<Player>;

}