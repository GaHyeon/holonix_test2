package com.example.rkgus.insta_.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rkgus.insta_.List.ListContents;
import com.example.rkgus.insta_.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;
import timber.log.Timber;

import static android.widget.Toast.LENGTH_SHORT;

public class CustomAdapter extends BaseAdapter{

    int position = 0;//listview의 위치라는데 그게 뭐여
    @BindView(R.id.feed_profile_img) ImageView profile_img;
    @BindView(R.id.feed_profile_name) TextView profile_name;

    private ArrayList<ListContents> listContents = new ArrayList<ListContents>() ;

    @Override
    public int getCount() {
        return listContents.size();
    }

    //리스트뷰에 데이터 넣어줌
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final int pos = position;
        final Context context = viewGroup.getContext();

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.contents, viewGroup, false);
        }

        ListContents listViewItem = listContents.get(position);
        //profile_img.setImageDrawable(listViewItem.get);//listViewItem class 작성 후
        //profile_img.setTextAlignment(listContents.get);
        
        return view;
    }
    
    @OnClick(R.id.feed_profile_name)
    void ClickProfile() {
      Timber.i("profile name clicked");
    }
    

    @Override
    public Object getItem(int i) {
        return listContents.get(position) ;
    }

    @Override
    public long getItemId(int i) {
        return position;
    }

    public void addContents(Drawable p_img, String p_name){
        ListContents item = new ListContents();

        item.setP_img(p_img);
        item.setP_name(p_name);

        listContents.add(item);
    }

}
