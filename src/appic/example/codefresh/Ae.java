package appic.example.codefresh;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Ae extends Activity{
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bp5);
		TabHost the=(TabHost)findViewById(R.id.tabhost);
		the.setup();
		TabSpec specs=the.newTabSpec("tag1");
		specs.setContent(R.id.tab1);
		specs.setIndicator("PROGRAM");
		the.addTab(specs);
		specs=the.newTabSpec("tag2");
		specs.setContent(R.id.tab2);
		specs.setIndicator("OUTPUT");
		the.addTab(specs);
		WebView ur=(WebView)findViewById(R.id.web);
		ur.setWebViewClient(new myclient());
		ur.loadUrl("http://ideone.com/YqLtrd");
	}
}
