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
public class Intents_Act_03 extends Activity {
    static final int RESULT_CODE_INTENNTS_ACT_03 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_act_03);

    }

    public void onClickAct03(View view) {
        Intent intent = new Intent(this, Intents_Act_02.class);
        intent.putExtra("str1", "Esto es un String");
        intent.putExtra("num1", 25);
        Bundle bundle = new Bundle();
        bundle.putString("str2", "Esto es otro String");
        intent.putExtras(bundle);
        bundle.putInt("num2", 35);
        intent.putExtras(bundle);
        startActivityForResult(intent, RESULT_CODE_INTENNTS_ACT_03);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_CODE_INTENNTS_ACT_03) {
            if (resultCode == RESULT_OK) {
                data.getData().toString();
            } else {

            }
        }

    }
}
