package com.example.rkgus.insta_;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.support.v7.app.ActionBar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_like1;
    ImageButton btn_like2;
    ImageButton btn_like3;
    ImageButton direct_main;
    int i=1, j=1, k=1;
    TextView like_num1;
    TextView like_num2;
    TextView like_num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.my_actionbar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        setContentView(R.layout.activity_main);

        direct_main = (ImageButton)findViewById(R.id.main_direct_icon);
        direct_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        DirectActivity.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다
            }
        });


        출처: http://bitsoul.tistory.com/6 [Happy Programmer~]


        like_num1 = (TextView)findViewById(R.id.like);
        like_num2 = (TextView)findViewById(R.id.like2);
        like_num3 = (TextView)findViewById(R.id.like3);

        btn_like1 = (ImageButton) findViewById(R.id.heart_img1);
        btn_like2 = (ImageButton) findViewById(R.id.heart_img2);
        btn_like3 = (ImageButton) findViewById(R.id.heart_img3);

        btn_like1.setOnClickListener(imgHeartButton);
        btn_like2.setOnClickListener(imgHeartButton);
        btn_like3.setOnClickListener(imgHeartButton);
    }

    View.OnClickListener imgHeartButton = new View.OnClickListener() {
        public void onClick(View view) {

            //feed1 like
            if(view.getId()==R.id.heart_img1) {
                if (i==1) {
                    btn_like1.setImageResource(R.drawable.ic_btn_heart_clicked);
                    like_num1.setText(""+i);
                    i--;
                }
                else {
                    btn_like1.setImageResource(R.drawable.ic_btn_heart);
                    like_num1.setText(""+i);
                    i++;
                }
            }

            //feed2 like
            if(view.getId()==R.id.heart_img2) {
                if (j==1) {
                    btn_like2.setImageResource(R.drawable.ic_btn_heart_clicked);
                    like_num2.setText(""+j);
                    j--;
                }
                else {
                    btn_like2.setImageResource(R.drawable.ic_btn_heart);
                    like_num2.setText(""+j);
                    j++;
                }
            }

            //feed3 like
            if(view.getId()==R.id.heart_img3) {
                if (k==1) {
                    btn_like3.setImageResource(R.drawable.ic_btn_heart_clicked);
                    like_num3.setText(""+k);
                    k--;
                }
                else {
                    btn_like3.setImageResource(R.drawable.ic_btn_heart);
                    like_num3.setText(""+k);
                    k++;
                }
            }
        }
    };
}
