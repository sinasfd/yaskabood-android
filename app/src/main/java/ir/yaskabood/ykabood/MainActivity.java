package ir.yaskabood.ykabood;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {



    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toast.makeText(getApplicationContext(),"لطفا برای استفاده از این اپلکیشن اینترنت خود را فعال کنید",Toast.LENGTH_SHORT).show();

        browser = (WebView) findViewById(R.id.webview);
        browser.setWebViewClient(new WebViewClient());
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("http://yaskabood.ir/view/");


        browser.getSettings().setAppCacheMaxSize(1024*1024*1024);
        browser.getSettings().setAppCachePath("/data/ir.yaskabood.ykabood/cache");
        browser.getSettings().setAppCacheEnabled(true);

        browser.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);


    }
}
