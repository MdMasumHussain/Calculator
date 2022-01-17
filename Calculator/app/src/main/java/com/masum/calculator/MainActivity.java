package com.masum.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.masum.calculator.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView web = (WebView) findViewById(R.id.webview);
web.loadUrl("file:///android_asset/index.html");
  WebSettings setting = web.getSettings();
  setting.setJavaScriptEnabled(true);
  web.setWebChromeClient(new WebChromeClient());
  web.setWebViewClient(new WebViewClient());
    }

}
