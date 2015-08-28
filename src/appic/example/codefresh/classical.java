package appic.example.codefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class classical extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inclassical);
		Button cment=(Button)findViewById(R.id.class1);
		Button cmenp=(Button)findViewById(R.id.class2);
		cment.setOnClickListener(this);
		cmenp.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.class1:
			Intent in=new Intent("appic.example.codefresh.CMENU");
			startActivity(in);
			break;
		case R.id.class2:
			Intent in1=new Intent("appic.example.codefresh.CLASSICALLIST");
			startActivity(in1);
			break;
	}
		
	}
	
}
