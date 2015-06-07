package com.example.monday;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class First extends Activity {

	private Button bt=null;
	private Button sg=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        
        bt = (Button) findViewById(R.id.selfinfo);
        sg = (Button) findViewById(R.id.startgame);
        bt.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                showToast();
            }
        });
        sg.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
   		 Intent intent = new Intent();
   		 intent.setClass(First.this,thegame.class);
   		 First.this.startActivity(intent);
        }
    });
   
        }
    

    private void showToast(){
    	
    	 Toast toast=Toast.makeText(getApplicationContext(), "Passenger's First App! Easy but hard.", Toast.LENGTH_SHORT); 
         toast.show(); 
         
    }
      abstract class MyButtonListener implements OnClickListener{
    	 
    	 public void onClick(View v){
    		 //TODO Auto-generated method stub
    		 Intent intent = new Intent();
    		 intent.setClass(First.this,thegame.class);
    		 First.this.startActivity(intent);
    		  
    		   
    	 }

		
     }
   

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.first, menu);
        return true;
    }
    
}

