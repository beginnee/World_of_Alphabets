package com.example.alphabettutorial;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    Context mContext;
    Activity a;
    /** Instantiate the interface and set the context */
    WebAppInterface(Context c) {
        mContext = c;
        a=(Activity)c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void startApp()
    {
    	Intent i=new Intent(mContext,StartActivity.class);
		mContext.startActivity(i);
    }
    public void exitApp()
    {
    	a.finish();
    }
}