package com.shimmerresearch.multishimmer;

import com.shimmerresearch.driver.*;
import com.shimmerresearch.multishimmerplay.R;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

public class SensorViewActivity extends Activity{
	// Return Intent extra
    public static String mDone = "Done";
	private String mSensorName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	Bundle extras = getIntent().getExtras();
        int enabledSensors = extras.getInt("Enabled_Sensors");
    	// Setup the window	    
    	setContentView(R.layout.sensor_view);
    	final CheckBox accelCheckBox = (CheckBox) findViewById(R.id.checkBoxAccelerometerGraph);
    	final CheckBox gyroCheckBox = (CheckBox) findViewById(R.id.checkBoxGyroscopeGraph);
    	final CheckBox magCheckBox = (CheckBox) findViewById(R.id.checkBoxMagnetometerGraph);
 	    final CheckBox emgCheckBox = (CheckBox) findViewById(R.id.checkBoxEMGGraph); 
 	    final CheckBox strainGaugeCheckBox = (CheckBox) findViewById(R.id.checkBoxStrainGaugeGraph);
 	    final CheckBox ecgCheckBox = (CheckBox) findViewById(R.id.checkBoxECGGraph);
 	    final CheckBox gsrCheckBox = (CheckBox) findViewById(R.id.checkBoxGSRGraph);  
 	    final CheckBox heartRateCheckBox = (CheckBox) findViewById(R.id.checkBoxHeartRateGraph);
 	    final CheckBox expBoardA0CheckBox = (CheckBox) findViewById(R.id.checkBoxExpBoardA0Graph);
 	    final CheckBox expBoardA7CheckBox = (CheckBox) findViewById(R.id.checkBoxExpBoardA7Graph);
 	    final CheckBox timeStampCheckBox = (CheckBox) findViewById(R.id.checkBoxTimeStampGraph);
	   Log.d("EnabledSensors",Integer.toString(enabledSensors));
	   
 	   if (((enabledSensors & 0xFF) & Shimmer.SENSOR_ACCEL) > 0){
	    	accelCheckBox.setEnabled(true);
		} else {
			accelCheckBox.setEnabled(false);
		}
	    
		if (((enabledSensors & 0xFF)& Shimmer.SENSOR_GYRO) > 0) {
			gyroCheckBox.setEnabled(true);
		} else {
			gyroCheckBox.setEnabled(false);
		}
		
		if (((enabledSensors & 0xFF)& Shimmer.SENSOR_MAG) > 0) {
			magCheckBox.setEnabled(true);
		} else {
			magCheckBox.setEnabled(false);
		}
		if (((enabledSensors & 0xFF) & Shimmer.SENSOR_GSR) > 0) {	
			gsrCheckBox.setEnabled(true);
		} else {
			gsrCheckBox.setEnabled(false);
		}
		
		if (((enabledSensors & 0xFF) & Shimmer.SENSOR_ECG) > 0) {	
			ecgCheckBox.setEnabled(true);
		} else {
			ecgCheckBox.setEnabled(false);
		}
		
		if (((enabledSensors & 0xFF) & Shimmer.SENSOR_EMG) > 0)  {	
			emgCheckBox.setEnabled(true);
		} else {
			emgCheckBox.setEnabled(false);
		}
		if (((enabledSensors & 0xFF00) & Shimmer.SENSOR_STRAIN) > 0)  {	
			strainGaugeCheckBox.setEnabled(true);
		} else {
			strainGaugeCheckBox.setEnabled(false);
		}
		if (((enabledSensors & 0xFF00) & Shimmer.SENSOR_HEART) > 0)  {	
			heartRateCheckBox.setEnabled(true);
		} else {
			heartRateCheckBox.setEnabled(false);
		}
		
		if (((enabledSensors & 0xFF) & Shimmer.SENSOR_EXP_BOARD_A0) > 0)  {	
			expBoardA0CheckBox.setEnabled(true);
		} else {
			expBoardA0CheckBox.setEnabled(false);
		}
		
		if (((enabledSensors & 0xFF) & Shimmer.SENSOR_EXP_BOARD_A7) > 0)  {	
			Log.d("EnabledSensors",Integer.toString(enabledSensors));
			expBoardA7CheckBox.setEnabled(true);
		} else {
			expBoardA7CheckBox.setEnabled(false);
		}
 	    
 	    
 	    accelCheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="Accelerometer";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	            finish();
	        }
	    });
	   
	  
	   gyroCheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="Gyroscope";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	        }
	    });
	   
	  
	   magCheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="Magnetometer";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	        }
	    });
	   

	   emgCheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="EMG";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	        }
	    });
	   

	   strainGaugeCheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="StrainGauge";
	            //Log.d("SG",Integer.toString(mReturnEnabledSensors) + " " + Integer.toString(SENSOR_STRAIN_GAUGE));
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	        }
	    });
	   
	   
	   ecgCheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="ECG";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	        }
	    });
	   

	   gsrCheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="GSR";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	        }
	    });

	   heartRateCheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="HeartRate";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	        }
	    });

	   expBoardA0CheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="ExpBoardA0";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	            }
	    });

	   expBoardA7CheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="ExpBoardA7";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	     	}
	    });

	   timeStampCheckBox.setOnClickListener(new OnClickListener() {
	    	public void onClick(View v) {
	    		mSensorName="TimeStamp";
	            Intent intent = new Intent();
	            intent.putExtra(mDone, mSensorName);
	            // Set result and finish this Activity
	            setResult(Activity.RESULT_OK, intent);
	        	finish();
	     	}
	    });
    }
    
	 
	/*
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
	*/
}
