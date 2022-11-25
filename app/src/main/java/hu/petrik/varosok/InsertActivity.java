package hu.petrik.varosok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsertActivity extends AppCompatActivity {

    private Button addCityButton, visszaButton;
    private EditText varosText, orszagText, lakossagText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        init();
        visszaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InsertActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void init(){
        addCityButton = findViewById(R.id.addCityButton);
        visszaButton = findViewById(R.id.visszaButton);
        varosText = findViewById(R.id.varosText);
        orszagText = findViewById(R.id.orszagText);
        lakossagText = findViewById(R.id.lakossagText);
    }
}