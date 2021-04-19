package com.kmtstudio.myhtmlusingtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    String myString = "<h1>This is Heading One </h1>\n"
            + "<h2>This is Heading Two </h2>\n"
            + "<h3>This is Heading Three </h3>\n"
            + "<p>This is Paragraph</p>\n\n"
            + "<p><u>This is Underline text </u></p>\n"
            + "<p><b>This is Bold text </b></p>\n"
            + "<p><i>This is Italic text </i></p>\n"
            + "Ordered list"
            + "<ol>\n"
            + "<li>Java</li>\n"
            + "<li>Kotlin</li>\n"
            + "<li>Dart</li>\n"
            + "<li>Flutter</li>\n"
            + "<li>Firebase</li>\n"
            + "<li>Git & GitHub</li>\n"
            + "</ol>\n"
            + "(a+b)<sup>2</sup> = a<sup>2</sup> + 2ab + b<sup>2</sup";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView = findViewById(R.id.txtViewID);

        textView.setText(Html.fromHtml(myString));


    }
}