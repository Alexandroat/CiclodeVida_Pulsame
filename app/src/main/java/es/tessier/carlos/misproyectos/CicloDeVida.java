package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class CicloDeVida extends Activity {

    final static String TAG = CicloDeVida.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_de_vida);
    }

    @Override
    protected void onStart() {
        super.onStart();
        android.util.Log.i(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        android.util.Log.i(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        android.util.Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        android.util.Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        android.util.Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i(TAG, "onDestroy");
    }


}
