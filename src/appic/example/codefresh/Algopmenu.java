package appic.example.codefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Algopmenu extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abcmenu);
		Button b1=(Button)findViewById(R.id.dfse);
		Button b2=(Button)findViewById(R.id.bfse);
		Button b3=(Button)findViewById(R.id.modee);
		Button b4=(Button)findViewById(R.id.chinae);
		Button b5=(Button)findViewById(R.id.floyde);
		Button b6=(Button)findViewById(R.id.prime);
		Button b7=(Button)findViewById(R.id.kruke);
		Button b8=(Button)findViewById(R.id.dijke);
		b8.setOnClickListener(this);
		b7.setOnClickListener(this);
		b6.setOnClickListener(this);
		b5.setOnClickListener(this);
		
		b4.setOnClickListener(this);
		
		b3.setOnClickListener(this);
		b1.setOnClickListener(this);
		
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.dfse:
			Intent in13=new Intent("appic.example.codefresh.BNO");
			startActivity(in13);
			break;
		case R.id.bfse:
			Intent in12=new Intent("appic.example.codefresh.BOO");
			startActivity(in12);
			break;
		case R.id.modee:
			Intent in11=new Intent("appic.example.codefresh.BPO");
			startActivity(in11);
			break;
		case R.id.floyde:
			Intent in9=new Intent("appic.example.codefresh.BRO");
			startActivity(in9);
			break;
		case R.id.chinae:
			Intent in10=new Intent("appic.example.codefresh.BQO");
			startActivity(in10);
			break;
		case R.id.prime:
			Intent in0=new Intent("appic.example.codefresh.BSO");
			startActivity(in0);
			break;
		case R.id.kruke:
			Intent in8=new Intent("appic.example.codefresh.BTO");
			startActivity(in8);
			break;
		case R.id.dijke:
			Intent in=new Intent("appic.example.codefresh.BUO");
			startActivity(in);
			break;
		}
	}

}
