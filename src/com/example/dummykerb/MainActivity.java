package com.example.dummykerb;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    protected static String getTicket() {
    	Log.d("Debug", "Got here");
    	return "1";
    }
    
    protected static void sendTicket(Context c, String p) {
    	Log.d("Debug", "Got here");
    	Intent intent = new Intent();
        intent.setAction("com.example.dummydemo.TESTING");
        intent.setPackage(p);
        c.sendBroadcast(intent);
    }
    
}
