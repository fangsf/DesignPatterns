package example.fangsf.desiginpatterns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import example.fangsf.desiginpatterns.singleton.SingletonActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void singleton1(View view) {
        // 单利设计模式
        startActivity(new Intent(this, SingletonActivity.class));
    }
}