package com.feigdev.customscheme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class CustomSchemeBroadcastReceiver extends BroadcastReceiver {
	static final String TAG = "CustomSchemeBroadcastReceiver";
	
	@Override
    public void onReceive(Context context, Intent intent) {
        // Received intent only when the system boot is completed
        Log.i(TAG, "onReceiveIntent");
        Uri uri = intent.getData(); 
        String uriVar = uri.getQueryParameter("var");
        Log.d(TAG, uriVar);
        context.startService(new Intent(context, CustomSchemeActivity.class));
        
    }
   
}
