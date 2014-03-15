package com.example.alphabettutorial;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.Menu;
import android.view.View;

public class StartActivity extends Activity implements OnInitListener{

	TextToSpeech tts1;
	static int TTS_CHECK_CODE=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		tts1=new TextToSpeech(this,this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}
	public void back(View v)
	{
		Intent i=new Intent(this,AlphabetsActivity.class);
		startActivity(i);
		this.finish();
	}
	
	@Override
	public void onInit(int status) {
		 if(status==TextToSpeech.SUCCESS)
		 {
			 tts1.speak("Welcome To World Of Alphabets",TextToSpeech.QUEUE_FLUSH,null);
		 }
		
	}
	
	public void A(View v)
	{
		 
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","A");
		startActivity(in);
		//this.finish();
	}
	public void B(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","B");
		startActivity(in);
		//this.finish();
	}
	public void C(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","C");
		startActivity(in);
		//this.finish();
	}
	public void D(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","D");
		startActivity(in);
		//this.finish();
	}
	public void E(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","E");
		startActivity(in);
		//this.finish();
	}
	public void F(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","F");
		startActivity(in);
		//this.finish();
	}
	public void G(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","G");
		startActivity(in);
		//this.finish();
	}
	public void H(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","H");
		startActivity(in);
		//this.finish();
	}
	public void I(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","I");
		startActivity(in);
		//this.finish();
	}
	public void J(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","J");
		startActivity(in);
		//this.finish();
	}
	public void K(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","K");
		startActivity(in);
		//this.finish();
	}
	public void L(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","L");
		startActivity(in);
		//this.finish();
	}
	public void M(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","M");
		startActivity(in);
		//this.finish();
	}
	public void N(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","N");
		startActivity(in);
		//this.finish();
	}
	public void O(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","O");
		startActivity(in);
		//this.finish();
	}
	public void P(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","P");
		startActivity(in);
		//this.finish();
	}
	public void Q(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","Q");
		startActivity(in);
		//this.finish();
	}
	public void R(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","R");
		startActivity(in);
		//this.finish();
	}
	public void S(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","S");
		startActivity(in);
		//this.finish();
	}
	public void T(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","T");
		startActivity(in);
		//this.finish();
	}
	public void U(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","U");
		startActivity(in);
		//this.finish();
	}
	public void V(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","V");
		startActivity(in);
		//this.finish();
	}
	public void W(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","W");
		startActivity(in);
		//this.finish();
	}
	public void X(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","X");
		startActivity(in);
		//this.finish();
	}
	public void Y(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","Y");
		startActivity(in);
		//this.finish();
	}
	public void Z(View v)
	{
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter","Z");
		startActivity(in);
		//this.finish();
	}
	
	
}

