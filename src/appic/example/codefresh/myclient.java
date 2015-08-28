package appic.example.codefresh;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class myclient extends WebViewClient {
	@Override
	public boolean shouldOverrideUrlLoading(WebView v,String url){
		v.loadUrl(url);
		return true;
	}

}
