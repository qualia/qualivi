package ug.drewb.qualivi;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;

public class MainActivity extends Activity {

    Vibrator vibrator;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
    }

    @Override
    public void onStart() {
        super.onStart();

        long[] pattern = new long[] { 1, 2, 3, 2, 1 };
        vibrator.vibrate(pattern, 0);
    }

    @Override
    public void onStop() {
        super.onStop();

        vibrator.cancel();
    }

}
