package zapper.macronesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class selectScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_screen);
    }

    // brings you to select screen
    public void startGraphics(View v) {
        Intent myIntent = new Intent(this,graphics.class);

        startActivity(myIntent);
        finish();
    }

    public void startCredits(View v) {
        Intent myIntent = new Intent(this,credits.class);

        startActivity(myIntent);
    }
}
