package appic.example.codefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Cmenu extends Activity implements OnClickListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cmenu);
		Button bump=(Button)findViewById(R.id.linku);
		Button bump1=(Button)findViewById(R.id.sea);
		Button bump2=(Button)findViewById(R.id.sorti);
		Button bump3=(Button)findViewById(R.id.stacks);
		Button bump4=(Button)findViewById(R.id.queues);
		Button bump5=(Button)findViewById(R.id.cqueues);
		Button bump6=(Button)findViewById(R.id.tre);
		Button bump7=(Button)findViewById(R.id.hea);
		bump7.setOnClickListener(this);
		bump6.setOnClickListener(this);
		bump5.setOnClickListener(this);
		bump4.setOnClickListener(this);
		bump3.setOnClickListener(this);
		bump.setOnClickListener(this);
		bump1.setOnClickListener(this);
		bump2.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.linku:
			Intent iz = new Intent("appic.example.codefresh.CLINKU");
			startActivity(iz);
			break;
		case R.id.sea:
			Intent iz1 = new Intent("appic.example.codefresh.BC");
			startActivity(iz1);
			break;
		case R.id.sorti:
			Intent iz2 = new Intent("appic.example.codefresh.BD");
			startActivity(iz2);
			break;
		case R.id.stacks:
			Intent iz3 = new Intent("appic.example.codefresh.BE");
			startActivity(iz3);
			break;
		case R.id.queues:
			Intent iz4 = new Intent("appic.example.codefresh.BF");
			startActivity(iz4);
			break;
		case R.id.cqueues:
			Intent iz5 = new Intent("appic.example.codefresh.BG");
			startActivity(iz5);
			break;
		case R.id.tre:
			Intent iz6 = new Intent("appic.example.codefresh.BH");
			startActivity(iz6);
		case R.id.hea:
			Intent iz7 = new Intent("appic.example.codefresh.BI");
			startActivity(iz7);
				break;
		}
	}

}
