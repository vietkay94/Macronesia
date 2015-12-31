package zapper.macronesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class graphics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics);
    }

    public void starthdNewGame(View v) {
        Intent myIntent = new Intent(this,hdgamepage1.class);

        startActivity(myIntent);
        finish();
    }

    public void startNewGame(View v) {
        Intent myIntent = new Intent(this,gamepage1.class);

        startActivity(myIntent);
        finish();
    }
}
