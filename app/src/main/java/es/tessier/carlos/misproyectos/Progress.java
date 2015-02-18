package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Progress extends Activity {
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
    }


    public void OnClickProgress1(View view) {

        pd.show(this, "Haciendo algo", "Por favor espere...", true);

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                    pd.dismiss();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
    public void OnClickProgress2(View view) {

        pd.setIcon(R.drawable.ic_launcher);
        pd.setTitle("Bajando Ficheros");
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        //pd.setButton(DialogInterface.BUTTON_POSITIVE, getString(android.R.string.ok), null);
        pd.show();
        pd.setProgress(0);

            new Thread(new Runnable() {
                public void run() {
                    try {
                        for (int i = 0; i <= 10; i++ ) {
                            Thread.sleep(1000);
                            pd.incrementProgressBy(15);
                        }
                        pd.dismiss();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

}
