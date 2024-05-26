package com.sample.criminalintent.database

import androidx.room.Insert
import androidx.room.Update
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.sample.criminalintent.Crime
import java.util.UUID
import java.util.*

@Dao
interface CrimeDao {

        @Query("SELECT * FROM crime")
        fun getCrimes(): LiveData<List<Crime>>

        @Query("SELECT * FROM crime WHERE id=(:id)")
        fun getCrime(id: UUID): LiveData<Crime?>

    @Update
    fun updateCrime(crime: Crime)
    @Insert
    fun addCrime(crime: Crime)

    }
