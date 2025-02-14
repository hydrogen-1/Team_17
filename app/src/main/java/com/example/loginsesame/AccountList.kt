package com.example.loginsesame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginsesame.RecyclerViewAdapter.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_password_overview.*

lateinit var accountAdapter : RecyclerAdapter

class AccountList : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_overview)

        accountAdapter = RecyclerAdapter(mutableListOf())

        rvAccounts.adapter = accountAdapter
        rvAccounts.layoutManager = LinearLayoutManager(this)


        // Inserts Test Values
        val new_account = account("test@mail.com", "Max Musterman")
        accountAdapter.addAccount(new_account)

    }




}