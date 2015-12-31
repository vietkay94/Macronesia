package zapper.macronesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // brings you to select screen
    public void startSelectScreen(View v) {
        Intent myIntent = new Intent(this,selectScreen.class);

        startActivity(myIntent);
    }
}
