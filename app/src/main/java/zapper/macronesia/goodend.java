package zapper.macronesia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class goodend extends AppCompatActivity {

    int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodend);
    }

    public void nextText(View v) {
        Intent mIntent = getIntent();

        String lines = " xxxOr shall the brusque inhabitants of Macronesia prove too much for the weary captain?xxxFind out in the upcoming Macronesia Origins DLC package!xxxSupport this adventure visual novel and the indie developers behind it by giving us a positive rating!xxxYou have our thanks here at...xxx xxx";
        String[] arrayLines = lines.split("xxx");

        String nextLine = arrayLines[counter];

        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(nextLine);


        if (counter == 5) {
            Intent Credits1 = new Intent(this,credits.class);
            startActivity(Credits1);
            finish();
        }

        counter++;
    }
}
