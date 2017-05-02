package projectmp.rjuan.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;


import com.tomerrosenfeld.customanalogclockview.CustomAnalogClock;

public class mainPage extends AppCompatActivity {

    //second attempt
    public Button spec;

    public void init(){
        spec = (Button)findViewById(R.id.specButton);
        Listener myListener;


    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        //*************************************************************
        //this functions update the main clock accordingly with every minute
        CustomAnalogClock customAnalogClock = (CustomAnalogClock) findViewById(R.id.analog_clock);
        customAnalogClock.setAutoUpdate(true);
        //************************************************************


    }


    //This function will run the diagnosis activity (AKA accelorometerClassActivity
    //*****************************************************************************

   /* public void runSettings(View v){
        Toast test = Toast.makeText(this, "edit was clicked", Toast.LENGTH_LONG);
        test.show();

        //packaget the array to send to second window
        //Intent myIntend = new Intent(this, accelorometer_Class.class);
        //this.startActivity(myIntend);

    }
    */
}
