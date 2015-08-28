package appic.example.codefresh;
import android.app.Activity;
import com.startapp.android.publish.StartAppSDK;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
		Button b1,b2,b3,b4;
		Intent i1,i2,i3,i4;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "207408138", true);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.imageButton1);
        b2=(Button)findViewById(R.id.imageButton2);
        b3=(Button)findViewById(R.id.imageButton3);
        b4=(Button)findViewById(R.id.imageButton4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
       
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.imageButton1:
			i1 = new Intent("appic.example.codefresh.BASIC");
			startActivity(i1);
			break;
		case R.id.imageButton2:
			i2 = new Intent("appic.example.codefresh.CLASSICAL");
			startActivity(i2);
			break;
		case R.id.imageButton3:
			i3 = new Intent("appic.example.codefresh.ALGO");
			startActivity(i3);
			break;
		case R.id.imageButton4:
			i4 = new Intent("appic.example.codefresh.TMENU");
			startActivity(i4);
			break;
			
		}
	}
}
