package com.example.charlesburks.fourseasons;


import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Integer [] Seasons = {R.drawable.spring, R.drawable.summer, R.drawable.fall, R.drawable.winter};
    int clicks =0;
    MediaPlayer buttonNoise;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView mainImg = (ImageView) findViewById(R.id.mainView);
        final Button button = (Button) findViewById(R.id.spingBtt);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks){
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[0]);
                        Toast toast= Toast.makeText(getApplicationContext(),
                                "Spring", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER| Gravity.CENTER_HORIZONTAL, 0, 200);
                        toast.show();

                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }

                mainImg.setBackgroundResource(Seasons[0]);
            }
        });
        final Button button2 = (Button) findViewById(R.id.summerBtt);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks){
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[1]);
                        Toast toast= Toast.makeText(getApplicationContext(),
                                "Summer", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 200);
                        toast.show();
                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });
        final Button button3 = (Button) findViewById(R.id.fallBtt);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks){
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[2]);
                        Toast toast= Toast.makeText(getApplicationContext(),
                                "Fall", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 200);
                        toast.show();
                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });
        final Button button4 = (Button) findViewById(R.id.winterBtt);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks = 0;
                switch (clicks){
                    case 0:

                        mainImg.setVisibility(View.VISIBLE);
                        mainImg.setBackgroundResource(Seasons[3]);
                        Toast toast= Toast.makeText(getApplicationContext(),
                                "Winter", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0, 200);
                        toast.show();
                        clicks = 1;
                        break;
                    case 1:
                        mainImg.setVisibility(View.INVISIBLE);
                        //clicks = 0;
                }
            }
        });


    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
