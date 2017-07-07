package project.android.mini_project1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import project.android.mini_project1.Adapter.TabPagerAdapter;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);

        View viewToolbar = getLayoutInflater().inflate(R.layout.tool_bar, null);

        ImageView i1 = (ImageView)viewToolbar.findViewById(R.id.toolIcon1);
        ImageView i2 = (ImageView)viewToolbar.findViewById(R.id.toolIcon3);
        i1.setOnClickListener(clickListener);
        i2.setOnClickListener(clickListener);
        actionBar.setCustomView(viewToolbar, new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));

        // TabLayout 초기화
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_icon_c1));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_icon2));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_icon3));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_icon4));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // ViewPager 초기화
        viewPager = (ViewPager) findViewById(R.id.pager);

        //TabPagerAdapter adapter 생성ㅌ
        TabPagerAdapter pagerAdapter = new TabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        // Set TabSelectedListener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) { //탭의 선택 상태를 제공

                switch(tab.getPosition()){
                    case 0 : tab.setIcon(R.drawable.tab_icon_c5);
                            break;
                    case 1 : tab.setIcon(R.drawable.tab_icon_c2);
                            break;
                    case 2 : tab.setIcon(R.drawable.tab_icon_c3);
                            break;
                    case 3 : tab.setIcon(R.drawable.tab_icon_c4);
                            break;
                }
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                switch(tab.getPosition()){
                    case 0 : tab.setIcon(R.drawable.tab_icon1);
                        break;
                    case 1 : tab.setIcon(R.drawable.tab_icon2);
                        break;
                    case 2 : tab.setIcon(R.drawable.tab_icon3);
                        break;
                    case 3 : tab.setIcon(R.drawable.tab_icon4);
                        break;
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    ImageView.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.toolIcon1 :
                    Toast.makeText(MainActivity.this, "툴바 아이콘1 클릭", Toast.LENGTH_LONG).show();
                    break;
                case R.id.toolIcon3 :
                    Toast.makeText(MainActivity.this, "툴바 아이콘2 클릭", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };



}
