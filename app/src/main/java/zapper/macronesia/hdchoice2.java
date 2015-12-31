package zapper.macronesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class hdchoice2 extends AppCompatActivity {

    int mClickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdchoice2);
    }

    public void result4 (View v){

        mClickCounter++;

        Intent GamePage3 = new Intent(this,hdgamepage3.class);
        GamePage3.putExtra("COUNTER", mClickCounter);

        startActivity(GamePage3);
        finish();
    }

    public void result5 (View v){

        mClickCounter = mClickCounter + 22;

        Intent GamePage3 = new Intent(this,hdgamepage3.class);
        GamePage3.putExtra("COUNTER",mClickCounter);

        startActivity(GamePage3);
        finish();
    }

    public void result6 (View v){

        mClickCounter = mClickCounter + 74;

        Intent GamePage3 = new Intent(this,hdgamepage3.class);
        GamePage3.putExtra("COUNTER",mClickCounter);

        startActivity(GamePage3);
        finish();
    }
}
