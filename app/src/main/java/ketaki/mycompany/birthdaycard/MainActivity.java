package ketaki.mycompany.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openNewActivity();



            }
        });




    }

    public void openNewActivity(){

        EditText editText = (EditText) findViewById(R.id.editText) ;

        Intent intent = new Intent(this, displayCard.class);
        intent.putExtra("EditTextValue", editText.getText().toString());
        startActivity(intent);
    }



}