package ketaki.mycompany.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class displayCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_card);



        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("Happy Birthday "+getIntent().getStringExtra("EditTextValue"));


        MediaPlayer play= MediaPlayer.create(displayCard.this,R.raw.happy);
        play.start();



    }


}