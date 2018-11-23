package com.example.triet.not_flashcards;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.exit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.saving).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newQuestion=((EditText) findViewById(R.id.question)).getText().toString();
                String newAnswer=((EditText) findViewById(R.id.answer)).getText().toString();
                Intent data = new Intent();                                         // create a new Intent, this is where we will put our data
                data.putExtra("string1", newQuestion);                         // puts one string into the Intent, with the key as 'string1'
                data.putExtra("string2", newAnswer);                         // puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data);                                         // set result code and bundle data for response
                finish();
            }
        });
        String s1 = getIntent().getStringExtra("string1"); // this string will be 'harry potter`
        String s2 = getIntent().getStringExtra("string2"); // this string will be 'voldemort'
}
}
