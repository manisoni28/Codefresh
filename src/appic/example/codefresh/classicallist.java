package appic.example.codefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class classicallist extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.classprogmenu);
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
		Button b15=(Button)findViewById(R.id.b15);
		
		
		
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
		b15.setOnClickListener(this);
		
		
		

	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.b1:
			Intent iz = new Intent("appic.example.codefresh.CLA1");
			startActivity(iz);
			break;
		case R.id.b2:
			//setContentView(R.layout.class2);
			Intent iz2 = new Intent("appic.example.codefresh.CLA2");
			startActivity(iz2);
			break;
		case R.id.b3:
			//setContentView(R.layout.class4);
			Intent iz3 = new Intent("appic.example.codefresh.CLA3");
			startActivity(iz3);
			break;
		case R.id.b4:
		//	setContentView(R.layout.class3);
			Intent iz4 = new Intent("appic.example.codefresh.CLA4");
			startActivity(iz4);
			break;
		case R.id.b5:
		//	setContentView(R.layout.class5);
			Intent iz5 = new Intent("appic.example.codefresh.CLA5");
			startActivity(iz5);
			break;
		case R.id.b6:
		//	setContentView(R.layout.class6);
			Intent iz6 = new Intent("appic.example.codefresh.CLA6");
			startActivity(iz6);
			break;
		case R.id.b7:
			//setContentView(R.layout.class7);
			Intent iz7 = new Intent("appic.example.codefresh.CLA7");
			startActivity(iz7);
			break;
		case R.id.b8:
			//setContentView(R.layout.class8);
			Intent iz8= new Intent("appic.example.codefresh.CLA8");
			startActivity(iz8);
			break;
		case R.id.b9:
			//setContentView(R.layout.class9);
			Intent iz9 = new Intent("appic.example.codefresh.CL9");
			startActivity(iz9);
			break;
		case R.id.b10:
		//	setContentView(R.layout.class10);
			Intent iz10 = new Intent("appic.example.codefresh.CLA10");
			startActivity(iz10);
			break;
		case R.id.b11:
			//setContentView(R.layout.class11);
			Intent iz11 = new Intent("appic.example.codefresh.CLA11");
			startActivity(iz11);
			break;
		case R.id.b12:
			//setContentView(R.layout.class12);
			Intent iz12 = new Intent("appic.example.codefresh.CLA12");
			startActivity(iz12);
			break;
		case R.id.b13:
			//setContentView(R.layout.class13);
			Intent iz13 = new Intent("appic.example.codefresh.CLA13");
			startActivity(iz13);
			break;
		case R.id.b14:
		//	setContentView(R.layout.class14);
			Intent iz14 = new Intent("appic.example.codefresh.CLA14");
			startActivity(iz14);
			break;
		case R.id.b15:
		//	setContentView(R.layout.class15);
			Intent iz15 = new Intent("appic.example.codefresh.CLA15");
			startActivity(iz15);
			break;
		
		}
		}
	}
	
	
	

	
	


