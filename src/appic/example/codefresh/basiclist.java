package appic.example.codefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class basiclist extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basicprogmenu);
		Button b1=(Button)findViewById(R.id.b1);
		Button b2=(Button)findViewById(R.id.b2);
		Button b3=(Button)findViewById(R.id.b3);
		Button b4=(Button)findViewById(R.id.b4);
		Button b5=(Button)findViewById(R.id.b5);
		Button b6=(Button)findViewById(R.id.b6);
		Button b7=(Button)findViewById(R.id.b7);
		Button b8=(Button)findViewById(R.id.b8);
		Button b9=(Button)findViewById(R.id.b9);
		Button b10=(Button)findViewById(R.id.b10);
		Button b11=(Button)findViewById(R.id.b11);
		Button b12=(Button)findViewById(R.id.b12);
		Button b13=(Button)findViewById(R.id.b13);
		Button b14=(Button)findViewById(R.id.b14);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);

		b3.setOnClickListener(this);

		b4.setOnClickListener(this);

		b5.setOnClickListener(this);

		b6.setOnClickListener(this);

		b7.setOnClickListener(this);

		b8.setOnClickListener(this);

		b9.setOnClickListener(this);

		b10.setOnClickListener(this);
		b11.setOnClickListener(this);
		b12.setOnClickListener(this);
		b13.setOnClickListener(this);
		b14.setOnClickListener(this);
		

	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.b1:
			Intent in1=new Intent("appic.example.codefresh.AA");
			startActivity(in1);
			break;
		case R.id.b2:
			Intent in2=new Intent("appic.example.codefresh.AB");
			startActivity(in2);
			break;
		case R.id.b3:
			Intent in3=new Intent("appic.example.codefresh.AC");
			startActivity(in3);
			break;
		case R.id.b4:
			Intent in4=new Intent("appic.example.codefresh.AD");
			startActivity(in4);
			break;
		case R.id.b5:
			Intent in5=new Intent("appic.example.codefresh.AE");
			startActivity(in5);
			break;
		case R.id.b6:
			Intent in6=new Intent("appic.example.codefresh.AF");
			startActivity(in6);
			break;
		case R.id.b7:
			Intent in7=new Intent("appic.example.codefresh.AG");
			startActivity(in7);
			break;
		case R.id.b8:
			Intent in8=new Intent("appic.example.codefresh.AH");
			startActivity(in8);
			break;
		case R.id.b9:
			Intent in9=new Intent("appic.example.codefresh.AI");
			startActivity(in9);
			break;
		case R.id.b10:
			Intent in10=new Intent("appic.example.codefresh.AJ");
			startActivity(in10);
			break;
		case R.id.b11:
			Intent in11=new Intent("appic.example.codefresh.AK");
			startActivity(in11);
			break;
		case R.id.b12:
			Intent in12=new Intent("appic.example.codefresh.AL");
			startActivity(in12);
			break;
		case R.id.b13:
			Intent in13=new Intent("appic.example.codefresh.AM");
			startActivity(in13);
			break;
		case R.id.b14:
			Intent in14=new Intent("appic.example.codefresh.AN");
			startActivity(in14);
			break;
		}
		}
	}
	
	
	

	
	


