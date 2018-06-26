package com.example.rkgus.insta_;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_like1;
    ImageButton btn_like2;
    ImageButton btn_like3;
    int i=1, j=1, k=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

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
                    i--;
                }
                else {
                    btn_like1.setImageResource(R.drawable.ic_btn_heart);
                    i++;
                }
            }
            //여러 게시글 좋아요가 왜 안될까.
            //feed2 like
            if(view.getId()==R.id.heart_img2) {
                if (j==1) {
                    btn_like2.setImageResource(R.drawable.ic_btn_heart_clicked);
                    j--;
                }
                else {
                    btn_like2.setImageResource(R.drawable.ic_btn_heart);
                    j++;
                }
            }

            //feed3 like
            if(view.getId()==R.id.heart_img3) {
                if (k==1) {
                    btn_like3.setImageResource(R.drawable.ic_btn_heart_clicked);
                    k--;
                }
                else {
                    btn_like3.setImageResource(R.drawable.ic_btn_heart);
                    k++;
                }
            }
        }
    };
}
