package appic.example.codefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Tmenu extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tmenu);
		Button b1=(Button)findViewById(R.id.comp1);
		Button b2=(Button)findViewById(R.id.comp2);
		Button b3=(Button)findViewById(R.id.comp3);
		Button b4=(Button)findViewById(R.id.comp4);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.comp1:
			Intent in13=new Intent("appic.example.codefresh.BJ");
			startActivity(in13);
			break;
		case R.id.comp2:
			Intent in32=new Intent("appic.example.codefresh.BK");
			startActivity(in32);
			break;
		case R.id.comp3:
			Intent in3=new Intent("appic.example.codefresh.BL");
			startActivity(in3);
			break;
		case R.id.comp4:
			Intent in1=new Intent("appic.example.codefresh.BM");
			startActivity(in1);
			break;
		}
		}
	}

