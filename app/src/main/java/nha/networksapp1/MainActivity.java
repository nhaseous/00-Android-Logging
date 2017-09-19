package nha.networksapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate() called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate() terminated");
    }

    @Override
    public void onStart() {
        Log.i(TAG, "onStart() called");
        super.onStart();
        Log.i(TAG, "onStart() terminated");
    }

    @Override
    public void onResume() {
        Log.i(TAG, "onResume() called");
        super.onResume();
        Log.i(TAG, "onResume() terminated");
    }

    @Override
    public void onPause() {
        Log.i(TAG, "onPause() called");
        super.onPause();
        Log.i(TAG, "onPause() terminated");
    }

    @Override
    public void onRestart() {
        Log.i(TAG, "onRestart() called");
        super.onRestart();
        Log.i(TAG, "onRestart() terminated");
    }

    @Override
    public void onStop() {
        Log.i(TAG, "onStop() called");
        super.onStop();
        Log.i(TAG, "onStop() terminated");
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy() called");
        super.onDestroy();
        Log.i(TAG, "onDestroy() terminated");
    }
}
