package project.android.mini_project1.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import project.android.mini_project1.Item;
import project.android.mini_project1.MainActivity;
import project.android.mini_project1.R;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private ArrayList<Item> items;
    int item_layout;


    public Adapter(ArrayList<Item> items, Context context, int item_layout){
        this.items = items;
        this.context = context;
        this.item_layout=item_layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        ViewHolder holder;
        switch (viewType){
            case 0 :
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.camera_item, parent, false);
                holder = new ViewHolder(view);
                return holder;
            case 1 :
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.update_item, parent, false);
                holder = new ViewHolder(view);
                return holder;

        }
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content, parent, false);
        holder = new ViewHolder(view);
        return holder;

    }

    public void onBindViewHolder(ViewHolder holder, int position) {

        if(position >= 2) {
            Item item = items.get(position);
            holder.propImg.setImageResource(item.getPropImg());
            holder.name.setText(item.getName());
            holder.date.setText(item.getDate());
            holder.content.setText(item.getContent());
            holder.date.setText(item.getDate());
            holder.like.setText(item.getLikeCCount() + " ");
            holder.contentImg.setImageResource(item.getContentImg());
            holder.reply.setText(item.getReplyCount());

            holder.btn1.setOnClickListener(clickListener);
            holder.btn2.setOnClickListener(clickListener);
            holder.btn3.setOnClickListener(clickListener);


        }
    }

    Button.OnClickListener clickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn1 :
                    Toast.makeText(context.getApplicationContext(), "좋아요 버튼 클릭", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn2 :
                    Toast.makeText(context.getApplicationContext(), "댓글달기 버튼 클릭", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn3 :
                    Toast.makeText(context.getApplicationContext(), "공유하기 버튼 클릭", Toast.LENGTH_LONG).show();
                    break;


            }
        }
    };

    @Override
    public int getItemViewType(int position) {
        if(position <= 1)
            return position;
        else
            return 2;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView propImg, contentImg;
        TextView name,date, content, like, reply;
        Button btn1, btn2, btn3;

        public ViewHolder(View view) {
            super(view);
            propImg = (ImageView)view.findViewById(R.id.propImg);
            name = (TextView)view.findViewById(R.id.name);
            date = (TextView)view.findViewById(R.id.date);
            content = (TextView)view.findViewById(R.id.content);
            contentImg = (ImageView)view.findViewById(R.id.contentImg);
            like = (TextView)view.findViewById(R.id.like);
            reply = (TextView)view.findViewById(R.id.reply);
            btn1= (Button)view.findViewById(R.id.btn1);
            btn2= (Button)view.findViewById(R.id.btn2);
            btn3= (Button)view.findViewById(R.id.btn3);
        }

    }


}
