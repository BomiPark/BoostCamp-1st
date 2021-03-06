package project.android.mini_project1.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import project.android.mini_project1.Fragment.TabFragment1;
import project.android.mini_project1.Fragment.TabFragment2;
import project.android.mini_project1.Fragment.TabFragment3;
import project.android.mini_project1.Fragment.TabFragment4;

/**
 * Created by qkrqh on 2017-07-06.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabFragment1 tabFragment1 = new TabFragment1();
                return tabFragment1;
            case 1:
                TabFragment2 tabFragment2 = new TabFragment2();
                return tabFragment2;
            case 2:
                TabFragment3 tabFragment3 = new TabFragment3();
                return tabFragment3;
            case 3:
                TabFragment4 tabFragment4 = new TabFragment4();
                return tabFragment4;
            default:
                return null;
        }
    }
}
