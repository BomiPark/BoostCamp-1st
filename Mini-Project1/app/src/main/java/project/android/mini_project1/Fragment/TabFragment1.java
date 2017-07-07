package project.android.mini_project1.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import project.android.mini_project1.Adapter.Adapter;
import project.android.mini_project1.Item;
import project.android.mini_project1.R;

public class TabFragment1 extends Fragment {

    private OnFragmentInteractionListener mListener;

    Context context;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    LinearLayoutManager layoutManager;

    public TabFragment1() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_fragment1, container, false);

        context = getActivity();
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler1);
        ArrayList items = new ArrayList<>();

        items.add(new Item());
        items.add(new Item());
        items.add(new Item(R.drawable.prop, "부스트캠프-boostcamp", "6월 29일 오후6:58 ·", R.string.content1 ,28,"댓글 2개 공유 1회",R.drawable.content2));
        items.add(new Item(R.drawable.prop2, "NAVER D2 Startup Factory", "11시간 ·", R.string.content4 ,131,"댓글 1개 공유 22회",R.drawable.content4,1));
        items.add(new Item(R.drawable.prop, "부스트캠프-boostcamp", "6월 13일 오후6:25 ·", R.string.content2 ,8, " ",R.drawable.content3));
        items.add(new Item(R.drawable.prop, "부스트캠프-boostcamp", "5월 21일 오후4:56 ·", R.string.content3 ,120,"댓글 7개",R.drawable.content1));

        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(items,context,R.layout.content);
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
