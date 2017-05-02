package projectmp.rjuan.mainpage;
/**
 * Created by rjuan on 4/29/2017.
 */


//import the right activities
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.widget.TextView;

//?????
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import static android.content.Context.SENSOR_SERVICE;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class accelorometer_Class extends AppCompatActivity implements SensorEventListener {
    //declare the private variables
    private TextView xText, yText, zText;
    private Sensor mySensor;
    private SensorManager SM;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelorometer__class);

        //create our sensor manager
        SM = (SensorManager)getSystemService(SENSOR_SERVICE);


        mySensor = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);


        //register sensor listener
        SM.registerListener(this, mySensor, SensorManager.SENSOR_DELAY_NORMAL);

        //assign textView
        xText = (TextView) xText.findViewById(R.id.xText);
        yText = (TextView) yText.findViewById(R.id.yText);
        zText = (TextView) zText.findViewById(R.id.zText);

    }

    public void onAccuracyChanged(Sensor sensor, int accuracy){

        //not in use

    }

    public void onSensorChanged(SensorEvent event){

        xText.setText("X: " + event.values[0]);
        yText.setText("Y: " + event.values[1]);
        zText.setText("Z: " + event.values[2]);

    }



}
