package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by alex on 21/01/15.
 */
public class Intents_Act_02_B extends Activity {
    private Button btn;
    private EditText user;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_act_02_b);

        user = (EditText) findViewById(R.id.user);
        btn = (Button) findViewById(R.id.button3);
    }

    public void onClick3(View view) {

        Intent data = new Intent();

        if (user.getText() != null) {
            data.setData(Uri.parse(user.getText().toString()));
            setResult(RESULT_OK, data);


        } else {
            setResult(RESULT_CANCELED);
        }


        finish();


    }

}
