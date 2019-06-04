package com.example.iteradmin.broadcastreceiver_android13

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadCast : BroadcastReceiver(){
    override fun onReceive(p0: Context?, p1: Intent?) {
        val s:String?=p1?.action
        when(s){
            Intent.ACTION_POWER_CONNECTED ->{
                Toast.makeText(p0,"charging",Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_POWER_DISCONNECTED ->{
                Toast.makeText(p0,"charger disconnected",Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED ->{
                Toast.makeText(p0,"Airplane Mode",Toast.LENGTH_SHORT).show()
            }
        }
    }

}