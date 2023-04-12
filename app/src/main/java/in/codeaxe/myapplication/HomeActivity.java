package in.codeaxe.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HomeActivity extends AppCompatActivity {
    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        WebView wb = (WebView)findViewById(R.id.wv);
        wb.setWebViewClient(new Callback());
        wb.loadUrl("file:///android_asset/index.html");
        wb.setScrollbarFadingEnabled(false);
        WebSettings ws = wb.getSettings();
        ws.setJavaScriptEnabled(true);



    }
    private class Callback extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    }
}