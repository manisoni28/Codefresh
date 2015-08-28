package appic.example.codefresh;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class menutbasic extends Activity implements OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		Button intro=(Button)findViewById(R.id.introduction);
		Button star=(Button)findViewById(R.id.start);
		Button dat=(Button)findViewById(R.id.data);
		Button me=(Button)findViewById(R.id.mem);
		Button key=(Button)findViewById(R.id.keyr);
		Button convert=(Button)findViewById(R.id.conver);
		Button expr=(Button)findViewById(R.id.expri);
		Button ifre=(Button)findViewById(R.id.ife);
		Button loopify=(Button)findViewById(R.id.loops);
		Button fuct=(Button)findViewById(R.id.functi);
		Button pointe=(Button)findViewById(R.id.point);
		Button arra=(Button)findViewById(R.id.arr);
		Button link=(Button)findViewById(R.id.linki);
		Button stru=(Button)findViewById(R.id.struc);
		
		link.setOnClickListener(this);
		stru.setOnClickListener(this);
		fuct.setOnClickListener(this);
		pointe.setOnClickListener(this);
		arra.setOnClickListener(this);
		loopify.setOnClickListener(this);
		intro.setOnClickListener(this);
		star.setOnClickListener(this);
		dat.setOnClickListener(this);
		me.setOnClickListener(this);
		key.setOnClickListener(this);
		convert.setOnClickListener(this);
		expr.setOnClickListener(this);
		ifre.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.introduction:
			Intent in13=new Intent("appic.example.codefresh.AZ");
			startActivity(in13);
			break;	
		case R.id.start:
			Intent in10=new Intent("appic.example.codefresh.AX");
			startActivity(in10);
			break;
		case R.id.data:
			Intent in3=new Intent("appic.example.codefresh.AQ");
			startActivity(in3);
			break;	
		case R.id.mem:
			Intent in8=new Intent("appic.example.codefresh.AV");
			startActivity(in8);
			break;	
		case R.id.keyr:
			Intent in15=new Intent("appic.example.codefresh.BB");
			startActivity(in15);
			break;	
		case R.id.conver:
			Intent in14=new Intent("appic.example.codefresh.BA");
			startActivity(in14);
			break;
		case R.id.expri:
			Intent in4=new Intent("appic.example.codefresh.AR");
			startActivity(in4);
			break;
		case R.id.ife:
			Intent in2=new Intent("appic.example.codefresh.AP");
			startActivity(in2);
			break;
		case R.id.loops:
			Intent in7=new Intent("appic.example.codefresh.AU");
			startActivity(in7);
			break;
		case R.id.functi:
			Intent in5=new Intent("appic.example.codefresh.AS");
			startActivity(in5);
			break;
		case R.id.point:
			Intent in9=new Intent("appic.example.codefresh.AW");
			startActivity(in9);
			break;
		case R.id.arr:
			Intent in1=new Intent("appic.example.codefresh.AO");
			startActivity(in1);
			break;
		case R.id.struc:
			Intent in12=new Intent("appic.example.codefresh.AY");
			startActivity(in12);
			break;
		case R.id.linki:
			Intent in6=new Intent("appic.example.codefresh.AT");
			startActivity(in6);
			break;
			
	}
	}
	
}
