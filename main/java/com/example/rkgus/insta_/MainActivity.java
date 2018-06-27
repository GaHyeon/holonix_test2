package com.example.rkgus.insta_;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.support.v7.app.ActionBar;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_like1;
    ImageButton btn_like2;
    ImageButton btn_like3;
    ImageButton direct_main;
    ImageButton btn_pop_m;
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

//        btn_pop_m = (ImageButton) findViewById(R.id.f1_pop_m);
//        btn_pop_m.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                PopupMenu popup= new PopupMenu(getApplicationContext(), v);//v는 클릭된 뷰를 의미
//
//                getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
//                btn_pop_m.setOnMenuItemClickListener(new OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {
//                        Toast.makeText(getApplicationContext(),
//                                "팝업메뉴 이벤트 처리 - "
//                                        + item.getTitle(),
//                                Toast.LENGTH_SHORT).show();
//                        return false;
//                    }
//                });
//                popup.show();//Popup Menu 보이기
//            }
//        });


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



    //좋아요버튼 클릭
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
