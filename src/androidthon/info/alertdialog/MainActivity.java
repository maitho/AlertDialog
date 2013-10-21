package androidthon.info.alertdialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Button buttn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttn = (Button) findViewById(R.id.bt_alertdialog);
		
		buttn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//Initialising alert dialog
				AlertDialog myAlertDialog = new AlertDialog.Builder(MainActivity.this).create();
				//Adding the Title 
				myAlertDialog.setTitle("This is Alert Dialog");
				//Adding Message
				myAlertDialog.setMessage("Showing Alert Dialog on Androidthon.info");
				//adding an image
				myAlertDialog.setIcon(R.drawable.ic_launcher);
				//setting up OK button 
				myAlertDialog.setButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						//toast message hown after successful execution of the alert dialog
						Toast.makeText(getApplicationContext(), "You have Clicked OK", Toast.LENGTH_SHORT).show();
						
					}
				});
				
				//displaying the Alert message
				myAlertDialog.show();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
