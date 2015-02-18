package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by alejandro on 08/02/15.
 */
public class Intents_Act_03_B extends Activity {

    private String str1 = getIntent().getStringExtra("num3");
    private int num1 = getIntent().getIntExtra("num3", 0);

    private Bundle bundle = getIntent().getExtras();
    private String str2 = bundle.getString("num3");
    private int num2 = bundle.getInt("num3");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_act_03_b);
        Toast.makeText(getApplicationContext(), str1, Toast.LENGTH_SHORT);
        Toast.makeText(getApplicationContext(), num1, Toast.LENGTH_SHORT);
        Toast.makeText(getApplicationContext(), str2, Toast.LENGTH_SHORT);
        Toast.makeText(getApplicationContext(), num2, Toast.LENGTH_SHORT);
    }

    public void onClickAtc_03B(View view) {
        Intent intent = new Intent(this, Intents_Act_02.class);
        intent.putExtra("num3", 45);
        intent.setData(Uri.parse("num3"));
        finish();


    }
}
