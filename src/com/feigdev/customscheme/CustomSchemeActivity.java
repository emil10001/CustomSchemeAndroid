package com.feigdev.customscheme;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CustomSchemeActivity extends Activity {
	public final static String CALLBACK_URL = "https://"; 
	public static final String TAG = "CustomSchemeActivity";
	  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public void onStart(){
    	super.onStart();
    	if (this.getIntent() != null){
    		onNewIntent(this.getIntent());
    	}
    }
    
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent called: " + intent.toString());
        Uri uri = intent.getData(); 
        if (uri != null){
        	String uriVar = uri.getQueryParameter("var");
        	if (uriVar != null){
        		Log.d(TAG, uriVar);
        		((TextView)findViewById(R.id.hello)).setText("var=" + uriVar);
        		
        	}
        }
      }
}