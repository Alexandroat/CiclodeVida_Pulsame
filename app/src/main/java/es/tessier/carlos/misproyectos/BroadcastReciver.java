package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class BroadcastReciver extends Activity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_reciver);
        btn = (Button) findViewById(R.id.broadcastIntent);
    }


    public void sendBroadcastIntent(View view) {
        Intent intent = new Intent();
        intent.putExtra("info", "HelloWorld");
        intent.setAction("es.tessier.carlos.misproyectos.CUSTOM_INTENT");
        sendBroadcast(intent);

    }
}
