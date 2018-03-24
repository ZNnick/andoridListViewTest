package com.example.asus.fragmenttest;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.asus.fragmenttest.frament.AnrotherFragment;
import com.example.asus.fragmenttest.frament.RightFragment;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);

        button.setOnClickListener(this);
//        replaceFragment(new RightFragment());
        //获取碎片的实例（仅用于实验）

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
//                replaceFragment(new AnrotherFragment());
                break;
            default:

        }
    }
//    private void replaceFragment(Fragment fragment){
//        FragmentManager fragmentManager=getSupportFragmentManager();
//
////        RightFragment rightFragment=(RightFragment)getFragmentManager().findFragmentById(); //获取碎片实例
//        FragmentTransaction transaction=fragmentManager.beginTransaction();
//        transaction.replace(R.id.right_layout,fragment);
//        transaction.addToBackStack(null);//将事物添加到返回栈
//        transaction.commit();
//
//
//    }
}
