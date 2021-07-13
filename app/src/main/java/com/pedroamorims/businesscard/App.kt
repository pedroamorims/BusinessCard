package com.pedroamorims.businesscard

import android.app.Application
import com.pedroamorims.businesscard.data.AppDatabase
import com.pedroamorims.businesscard.data.BusinessCardRepository

class App : Application(){
    val database by lazy{ AppDatabase.getDatabase(this)}
    val repository by lazy{BusinessCardRepository(database.businessDao()) }
}