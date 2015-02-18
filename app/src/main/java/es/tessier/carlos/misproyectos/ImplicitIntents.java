package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ImplicitIntents extends Activity {
    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents);
        btn1 = (Button) findViewById(R.id.btnPage);
        btn2 = (Button) findViewById(R.id.btnTel);
        btn3 = (Button) findViewById(R.id.btnLoc);
    }


    public void onClickWebBrowser(View view) {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.uem.es"));
        startActivity(intent);
    }

    public void onClickCall(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+902232350"));
        startActivity(intent);

    }

    public void onClickShowMap(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.37367,-3.919848"));
        startActivity(intent);

    }

}
