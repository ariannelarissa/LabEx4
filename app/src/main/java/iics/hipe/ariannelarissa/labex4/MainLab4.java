package iics.hipe.ariannelarissa.labex4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainLab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab4);

                Button toastBtn = (Button) findViewById(R.id.toastButton);
                Button snackbarBtn = (Button) findViewById(R.id.snackbarButton);
                Button actionBtn = (Button) findViewById(R.id.actionButton);

                toastBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String message = "TOAST!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast.makeText(getApplicationContext(), message, duration).show();
                    }
                });

                snackbarBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        View view = findViewById(R.id.main_layout_id);
                        String message = "Snackbar message";
                        int duration = Snackbar.LENGTH_SHORT;

                        showSnackbar(view, message, duration);
                    }
                });

                actionBtn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        View view = findViewById(R.id.main_layout_id);
                        String message = "Snackbar message with actions";
                        int duration = Snackbar.LENGTH_SHORT;

                        showSnackbaract(view, message, duration);
                    }
                });
            }
            public void showSnackbar(View view, String message, int duration)
            {
                Snackbar.make(view, message, duration).show();
            }

            public void showSnackbaract (View view, String message, int duration) {
                final Snackbar snackbar = Snackbar.make(view, message, duration);
                snackbar.setAction("DISMISS", new View.OnClickListener() {
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                });
                snackbar.show();
            }
}
