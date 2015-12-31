package zapper.macronesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class choice1 extends AppCompatActivity {

    int mClickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice1);
    }

    public void result1 (View v){

        mClickCounter++;

        Intent GamePage2 = new Intent(this,gamepage2.class);
        GamePage2.putExtra("COUNTER",mClickCounter);

        startActivity(GamePage2);
        finish();
    }

    public void result2 (View v){

        mClickCounter = mClickCounter + 2;

        Intent GamePage2 = new Intent(this,gamepage2.class);
        GamePage2.putExtra("COUNTER",mClickCounter);

        startActivity(GamePage2);
        finish();
    }

    public void result3 (View v){

        mClickCounter = mClickCounter + 3;

        Intent GamePage2 = new Intent(this,gamepage2.class);
        GamePage2.putExtra("COUNTER",mClickCounter);

        startActivity(GamePage2);
        finish();
    }
}
