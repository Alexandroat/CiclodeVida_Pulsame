package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static es.tessier.carlos.misproyectos.R.menu.munu_actividad_intent_1a;

/**
 * Created by alex on 21/01/15.
 */
public class Intents_Act_02 extends Activity {
    private Button btn;
    EditText info;
    static final int RESULT_CODE_INTENNTS_ACT_02_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_act_02);
        info = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.buttonA);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(this, Intents_Act_02_B.class);
        startActivityForResult(intent, RESULT_CODE_INTENNTS_ACT_02_B);


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_CODE_INTENNTS_ACT_02_B) {
            if (resultCode == RESULT_OK) {
                info.setText(data.getData().toString());
            } else {
                info.setText("No hay info");
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(munu_actividad_intent_1a, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
