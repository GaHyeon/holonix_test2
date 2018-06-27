package com.example.rkgus.insta_;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.BinderThread;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.heart_img1) ImageButton btn_like1;
    @BindView(R.id.main_direct_icon) ImageButton direct_main;
    @BindView(R.id.like1) TextView like_cnt1;
    //ImageButton btn_pop_m;
    int i=1, j=1, k=1;

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
        ButterKnife.bind(this);

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

    }

    @OnClick(R.id.main_direct_icon)
    void mainDirectClick() {
        Intent intent = new Intent(
                getApplicationContext(), // 현재 화면의 제어권자
                DirectActivity.class); // 다음 넘어갈 클래스 지정
        startActivity(intent); // 다음 화면으로 넘어간다
    }

    //좋아요 클릭
    @OnClick(R.id.heart_img1)
    void heartClick() {
        if(btn_like1.getId()==R.id.heart_img1) {
                if (i==1) {
                    btn_like1.setImageResource(R.drawable.ic_btn_heart_clicked);
                    like_cnt1.setText(""+i);
                    i--;
                }
                else {
                    btn_like1.setImageResource(R.drawable.ic_btn_heart);
                    like_cnt1.setText(""+i);
                    i++;
                }
            }
    }

}
