package com.example.alphabettutorial;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AlphaActivity extends Activity implements OnInitListener{


	String ltr;
	TextToSpeech tts;
	static int TTS_CHECK_CODE=0;
	
	String alphabets[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	TextView t1;
	ImageView im;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alpha);
		t1=(TextView)findViewById(R.id.talpha);
		im=(ImageView)findViewById(R.id.imageView1);
		tts=new TextToSpeech(this,this);
		//Intent in=new Intent();
	    ltr=getIntent().getExtras().getString("letter");
	    if(ltr.equals("A"))
	    {
	    	Button b1=(Button)findViewById(R.id.button1);
	    	b1.setEnabled(false);
	    }
	    if(ltr.equals("Z"))
	    {
	    	Button b2=(Button)findViewById(R.id.button2);
	    	b2.setEnabled(false);
	    }	

	    alpha();
	    

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alpha, menu);
		return true;
	}

	public void onNext(View v)
	{
		String text=t1.getText().toString();
		String first_char=text.charAt(0)+"";
		int i;
		for(i=0;i<=25;i++)
			if(first_char.equals(alphabets[i]))	break;
		i++;
		ltr=alphabets[i];
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter",ltr);
		startActivity(in);
	}
	
	public void onPrevious(View v)
	{
		String text=t1.getText().toString();
		String first_char=text.charAt(0)+"";
		int i;
		for(i=0;i<=25;i++)
			if(first_char.equals(alphabets[i]))	break;
		i--;
		ltr=alphabets[i];
		Intent in=new Intent(this,AlphaActivity.class);
		in.putExtra("letter",ltr);
		startActivity(in);		
	}
	
	String x="";

	public void alpha()
	{
		if(ltr.equals("A"))
	    {
			t1.setText("Apple");
			im.setImageResource(R.drawable.apple1);
			x="A For Apple";
	    }
		else if(ltr.equals("B"))
		{
			t1.setText("Ball");
			im.setImageResource(R.drawable.ball);
			x="B For Ball";
		}
		else if(ltr.equals("C"))
		{
			t1.setText("Cat");
			im.setImageResource(R.drawable.cat);
			x="C For Cat";
			 
		}
		else if(ltr.equals("D"))
		{
			t1.setText("Dog");
			im.setImageResource(R.drawable.dog);
			x="D For Dog";
		}
		else if(ltr.equals("E"))
		{
			t1.setText("Elephant");
			im.setImageResource(R.drawable.elephant);
			x="E For Elephant";						 
		}
		else if(ltr.equals("F"))
		{
			t1.setText("Fish");
			im.setImageResource(R.drawable.fish);
			x="F For Fish";			 
		}
		else if(ltr.equals("G"))
		{
			t1.setText("Goat");
			im.setImageResource(R.drawable.goat);
			x="G For Goat";			 
		}
		else if(ltr.equals("H"))
		{
			t1.setText("Hen");
			im.setImageResource(R.drawable.hen);
			x="H For Hen";			 
		}
		else if(ltr.equals("I"))
		{
			t1.setText("Icecream");
			im.setImageResource(R.drawable.ice_cream);
			x="I For Icecream";				 
		}
		else if(ltr.equals("J"))
		{
			t1.setText("Jug");
			im.setImageResource(R.drawable.jug);
			x="J For Jug";					 
		}
		else if(ltr.equals("K"))
		{
			t1.setText("Kite");
			im.setImageResource(R.drawable.kite);
			x="K For Kite";							 
		}
		else if(ltr.equals("L"))
		{
			t1.setText("Lion");
			im.setImageResource(R.drawable.lion);
			x="L For Lion";				 
		}
		else if(ltr.equals("M"))
		{
			t1.setText("Monkey");
			im.setImageResource(R.drawable.monkey);
			x="M For Monkey";				 
		}
		else if(ltr.equals("N"))
		{
			t1.setText("Nest");
			im.setImageResource(R.drawable.nest);
			x="N For Nest";						 
		}
		else if(ltr.equals("O"))
		{
			t1.setText("Owl");
			im.setImageResource(R.drawable.owl);
			x="O For Owl";				 
		}
		else if(ltr.equals("P"))
		{
			t1.setText("Parrot");
			im.setImageResource(R.drawable.parrot);
			x="P For Parrot";	 
		}
		else if(ltr.equals("Q"))
		{
			t1.setText("Queen");
			im.setImageResource(R.drawable.queen);
			x="Q For Queen";										 
		}
		else if(ltr.equals("R"))
		{
			t1.setText("Rabbit");
			im.setImageResource(R.drawable.rabbit);
			x="R For Rabbit";												 
		}
		else if(ltr.equals("S"))
		{
			t1.setText("Ship");
			im.setImageResource(R.drawable.ship);
			x="S For Ship";													 
		}
		else if(ltr.equals("T"))																
		{
			t1.setText("Tiger");
			im.setImageResource(R.drawable.tiger);
			x="T For Tiger";
		}
		else if(ltr.equals("U"))
		{
			t1.setText("Umbrella");
			im.setImageResource(R.drawable.umbrella1);
			x="U For Umbrella";
		}
		else if(ltr.equals("V"))
		{
			t1.setText("Van");
			im.setImageResource(R.drawable.van);
			x="V For Van";				 
		}
		else if(ltr.equals("W"))
		{
			t1.setText("Watch");
			im.setImageResource(R.drawable.watch);
			x="W For Watch";					 
		}
		else if(ltr.equals("X"))
		{
			t1.setText("Xmas");
			im.setImageResource(R.drawable.xmas);
			x="X For Xmas";																			
		}
		else if(ltr.equals("Y"))
		{
			t1.setText("Yak");
			im.setImageResource(R.drawable.yak);
			x="Y For Yak";
		}
		else if(ltr.equals("Z"))
		{
			t1.setText("Zebra");
			im.setImageResource(R.drawable.zebra);
			x="Z For Zebra";
		}																									 
}
	
	public void back(View v)
	{
		Intent i=new Intent(this,StartActivity.class);
		startActivity(i);
		this.finish();
	}
	
	@Override
	public void onInit(int status) {
		 if(status==TextToSpeech.SUCCESS)
		 {
			 tts.speak(x,TextToSpeech.QUEUE_FLUSH,null);
		 }
		
	}

}
