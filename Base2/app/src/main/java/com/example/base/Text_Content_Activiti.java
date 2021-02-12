package com.example.base;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Text_Content_Activiti extends AppCompatActivity {
    private TextView text_content;
    private ImageView imageContent;
    private int category=0;
    private int position=0;
    private int[] array_information = {R.string.information, R.string.information2,R.string.information3};
    private int[] array_info_dataTypes = {R.string.info_dataTypes, R.string.info_dataTypes2,R.string.info_dataTypes3,R.string.info_dataTypes4,R.string.info_dataTypes5};
    private int[] array_image_csharp = {R.drawable.ic_first, R.drawable.ic_first,R.drawable.ic_base};
    private int[] array_image_intlong = {R.drawable.ic_int, R.drawable.ic_int,R.drawable.ic_long,R.drawable.ic_float,R.drawable.ic_double};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        text_content = findViewById(R.id.text_main_Content);
        imageContent = findViewById(R.id.image_Content);
        reciveIntent();
    }
    private void reciveIntent()
    {
        Intent i = getIntent();
        if (i!=null)
        {
         category = i.getIntExtra("category",0);
         position = i.getIntExtra("position",0);
        }
        switch (category)
        {
            case 0:
                imageContent.setImageResource(array_image_csharp[position]);
                text_content.setText(array_information[position]);
                break;
            case 1:
                text_content.setText(array_info_dataTypes[position]);
                imageContent.setImageResource(array_image_intlong[position]);
                break;
            case 2:
                text_content.setText(array_information[position]);
                break;
        }
    }
}
