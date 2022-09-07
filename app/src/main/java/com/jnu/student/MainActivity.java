package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //这句话是生成activity_main.xml里面写的所有控件的，相当于把所有架构对象搭建出来
        //不调用这个，所有控件对象都为null
        setContentView(R.layout.activity_main);

        //3种方法setText

        //先找到控件
        //这个控件是一个TextView，在activity_main.xml可以看到
        //可以通过该控件的id号来找到它
        textViewHelloWorld = this.findViewById(R.id.text_hello_world2);

        //找到控件后调用setText可以设置该控件TextView里面的字符串
        textViewHelloWorld.setText("test");
        textViewHelloWorld.setText(R.string.string_hello_world2);
        textViewHelloWorld.setText(this.getResources().getText(R.string.string_hello_world2));

        string strHelloWorld = textViewHelloWorld.getText().toString();
    }
}