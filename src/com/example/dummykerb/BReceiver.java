package com.example.dummykerb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.util.Log;

public class BReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		System.out.println("Received at Kerb");
		Log.d("Debug", "Received at Kerb");
		String s = intent.getExtras().getString("package");
		System.out.println("PACKKKKK" + s);
		Log.d("Debug", s);
		Log.d("Debug", "Got this" + MainActivity.getTicket());
		System.out.println("Got this" + MainActivity.getTicket());
		MainActivity.sendTicket(context, s);
	}
}
