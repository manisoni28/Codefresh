package appic.example.codefresh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class algo extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inalgorithm);
		Button basicin=(Button)findViewById(R.id.algo1);
		Button bsic=(Button)findViewById(R.id.algo2);
		basicin.setOnClickListener(this);
		bsic.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stubcase
		switch(arg0.getId()){
		case R.id.algo1:
			Intent in=new Intent("appic.example.codefresh.ALGOTMENU");
			startActivity(in);
			break;
		case R.id.algo2:
			Intent intr=new Intent("appic.example.codefresh.ALGOPMENU");
			startActivity(intr);
			break;	
	}
		
	}
	
}
