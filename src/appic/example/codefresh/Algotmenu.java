package appic.example.codefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Algotmenu extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.abmenu);
		Button b1=(Button)findViewById(R.id.dfs);
		Button b2=(Button)findViewById(R.id.bfs);
		Button b3=(Button)findViewById(R.id.mode);
		Button b4=(Button)findViewById(R.id.china);
		Button b5=(Button)findViewById(R.id.floyd);
		Button b6=(Button)findViewById(R.id.prim);
		Button b7=(Button)findViewById(R.id.kruk);
		Button b8=(Button)findViewById(R.id.dijk);
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
		case R.id.dfs:
			Intent in13=new Intent("appic.example.codefresh.BN");
			startActivity(in13);
			break;
		case R.id.bfs:
			Intent in12=new Intent("appic.example.codefresh.BO");
			startActivity(in12);
			break;
		case R.id.mode:
			Intent in11=new Intent("appic.example.codefresh.BP");
			startActivity(in11);
			break;
		case R.id.floyd:
			Intent in9=new Intent("appic.example.codefresh.BR");
			startActivity(in9);
			break;
		case R.id.china:
			Intent in10=new Intent("appic.example.codefresh.BQ");
			startActivity(in10);
			break;
		case R.id.prim:
			Intent in0=new Intent("appic.example.codefresh.BS");
			startActivity(in0);
			break;
		case R.id.kruk:
			Intent in8=new Intent("appic.example.codefresh.BT");
			startActivity(in8);
			break;
		case R.id.dijk:
			Intent in=new Intent("appic.example.codefresh.BU");
			startActivity(in);
			break;
		}
	}

}
