package com.cdah.carlosdaniel.mostcommonphrase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by carlos daniel on 06/10/2015.
 */
public class Categories extends Activity{
    private ListView lv1;

    private String[] categorias = {"Greetings", "Asking for Help and Directions", "How to Introduce Yourself", "Wish Someone Something", "Solving a Misunderstanding", "Spanish Expressions and Words", "Spanish Restaurant Survival Terms", "Greetings 2", "Common Questions", "Goodbyes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        lv1 = (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.custom_textview, categorias);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent i = new Intent(Categories.this, Greetings.class);
                    startActivity(i);
                }
                else if(position == 1){
                    Intent i = new Intent(Categories.this, AskingForHelp.class);
                    startActivity(i);
                }
                else if(position == 2){
                    Intent i = new Intent(Categories.this, HowToIntroduceYourself.class);
                    startActivity(i);
                }
                else if(position == 3){
                    Intent i = new Intent(Categories.this, WishSomeone.class);
                    startActivity(i);
                }
                else if(position == 4){
                    Intent i = new Intent(Categories.this, SolvingMisunderstanding.class);
                    startActivity(i);
                }
                else if(position == 5){
                    Intent i = new Intent(Categories.this, SpanishExpressions.class);
                    startActivity(i);
                }
                else if(position == 6){
                    Intent i = new Intent(Categories.this, SpanishRestaurant.class);
                    startActivity(i);
                }
                else if(position == 7){
                    Intent i = new Intent(Categories.this, Greetings_2.class);
                    startActivity(i);
                }
                else if(position == 8){
                    Intent i = new Intent(Categories.this, CommonsQuestions.class);
                    startActivity(i);
                }
                else if(position == 9){
                    Intent i = new Intent(Categories.this, Goodbyes.class);
                    startActivity(i);
                }
            }

        });
    }
}
