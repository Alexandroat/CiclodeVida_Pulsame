package es.tessier.carlos.misproyectos;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String msj = intent.getExtras().getString("info");
        Toast.makeText(context, msj, Toast.LENGTH_SHORT);
    }


}
