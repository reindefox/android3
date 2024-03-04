package com.example.android3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);
//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        EditText editText = new EditText(this);
//        editText.setHint("Введите Email");
//        editText.setId(View.generateViewId());
//
//        Button button = new Button(this);
//        button.setText("Отправить");
//        button.setId(View.generateViewId());
//        ConstraintLayout.LayoutParams editTextLayout = new
//                ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        editTextLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        editTextLayout.rightToLeft = button.getId();
//        editText.setLayoutParams(editTextLayout);
//        constraintLayout.addView(editText);
//        ConstraintLayout.LayoutParams buttonLayout = new
//                ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        buttonLayout.leftToRight = editText.getId();
//        buttonLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        button.setLayoutParams(buttonLayout);
//        constraintLayout.addView(button);
//        setContentView(constraintLayout);


//        ConstraintLayout constraintLayout = new ConstraintLayout(this);
//        TextView textView = new TextView(this);
//        textView.setBackgroundColor(0xFF00FF00);
//        textView.setText("Testing sample");
//        textView.setTextSize(30);
//
//        int margin50inDp = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics());
//
//        int margin60inDp = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 60, getResources().getDisplayMetrics());
//
//        int padding40inDp = (int) TypedValue.applyDimension(
//                TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
//
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ViewGroup.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);


//        layoutParams.setMargins(margin60inDp, margin50inDp, margin60inDp, margin50inDp);
//
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//
//        textView.setLayoutParams(layoutParams);
//
//        textView.setPadding(padding40inDp, padding40inDp, padding40inDp, padding40inDp);
//        constraintLayout.addView(textView);

//        setContentView(constraintLayout);


//
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//
//        setContentView(constraintLayout);



//        setContentView(R.layout.second_layout);
//        TextView textView = findViewById(R.id.header);
//        textView.setText("Test");
//
//        int valueInDp = 60;
//        int x = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDp, getResources().getDisplayMetrics());
//        setContentView(R.layout.activity_main);
    }
}