package appic.example.codefresh;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Bd extends Activity implements OnClickListener{
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sortio);
		Button bu1=(Button)findViewById(R.id.sels);
		Button bu2=(Button)findViewById(R.id.ins);
		Button bu3=(Button)findViewById(R.id.mers);
		Button bu4=(Button)findViewById(R.id.qucs);
		bu1.setOnClickListener(this);
		bu2.setOnClickListener(this);
		bu3.setOnClickListener(this);
		bu4.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.sels:
			setContentView(R.layout.selse);
			break;
		case R.id.ins:
			setContentView(R.layout.ins);
			break;
		case R.id.mers:
			setContentView(R.layout.mers);
			break;
		case R.id.qucs:
			setContentView(R.layout.quck);
			break;
	}
	}
}
