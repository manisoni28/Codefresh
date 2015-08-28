package appic.example.codefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class basic extends Activity implements OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inbasic);
		Button basicin=(Button)findViewById(R.id.basic1);
		Button bsic=(Button)findViewById(R.id.basic2);
		basicin.setOnClickListener(this);
		bsic.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.basic1:
			Intent in=new Intent("appic.example.codefresh.MENUTBASIC");
			startActivity(in);
			break;
		case R.id.basic2:
			Intent intr=new Intent("appic.example.codefresh.BASICLIST");
			startActivity(intr);
			break;	
	}
	}
}
