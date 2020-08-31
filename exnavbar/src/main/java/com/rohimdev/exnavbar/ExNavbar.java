package com.rohimdev.exnavbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import androidx.viewpager.widget.ViewPager;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ExNavbar extends ExNavbarInnter {

    public ExNavbar(Context context) {
        super(context);
    }

    public ExNavbar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExNavbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public ExNavbarInnter setIconVisibility(boolean visibility) {
        try {
            return super.setIconVisibility(visibility);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setTextVisibility(boolean visibility) {
        try {
            return super.setTextVisibility(visibility);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter enableAnimation(boolean enable) {
        try {
            return super.enableAnimation(enable);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter enableShiftingMode(boolean enable) {
        try {
            return super.enableShiftingMode(enable);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter enableItemShiftingMode(boolean enable) {
        try {
            return super.enableItemShiftingMode(enable);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public int getCurrentItem() {
        try {
            return super.getCurrentItem();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public int getMenuItemPosition(MenuItem item) {
        try {
            return super.getMenuItemPosition(item);
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public ExNavbarInnter setCurrentItem(int index) {
        try {
            return super.setCurrentItem(index);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public OnNavigationItemSelectedListener getOnNavigationItemSelectedListener() {
        try {
            return super.getOnNavigationItemSelectedListener();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener listener) {
        try {
            super.setOnNavigationItemSelectedListener(listener);
        } catch (Exception e) {
        }
    }

    @Override
    public BottomNavigationMenuView getBottomNavigationMenuView() {
        return super.getBottomNavigationMenuView();
    }

    @Override
    public ExNavbarInnter clearIconTintColor() {
        try {
            return super.clearIconTintColor();
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public BottomNavigationItemView[] getBottomNavigationItemViews() {
        try {
            return super.getBottomNavigationItemViews();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public BottomNavigationItemView getBottomNavigationItemView(int position) {
        try {
            return super.getBottomNavigationItemView(position);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public ImageView getIconAt(int position) {
        try {
            return super.getIconAt(position);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public TextView getSmallLabelAt(int position) {
        try {
            return super.getSmallLabelAt(position);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public TextView getLargeLabelAt(int position) {
        try {
            return super.getLargeLabelAt(position);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public int getItemCount() {
        try {
            return super.getItemCount();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public ExNavbarInnter setSmallTextSize(float sp) {
        try {
            return super.setSmallTextSize(sp);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setLargeTextSize(float sp) {
        try {
            return super.setLargeTextSize(sp);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setTextSize(float sp) {
        try {
            return super.setTextSize(sp);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setIconSizeAt(int position, float width, float height) {
        try {
            return super.setIconSizeAt(position, width, height);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setIconSize(float width, float height) {
        try {
            return super.setIconSize(width, height);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setIconSize(float dpSize) {
        try {
            return super.setIconSize(dpSize);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setItemHeight(int height) {
        try {
            return super.setItemHeight(height);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public int getItemHeight() {
        try {
            return super.getItemHeight();
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public ExNavbarInnter setTypeface(Typeface typeface, int style) {
        try {
            return super.setTypeface(typeface, style);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setTypeface(Typeface typeface) {
        try {
            return super.setTypeface(typeface);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setupWithViewPager(ViewPager viewPager) {
        try {
            return super.setupWithViewPager(viewPager);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setupWithViewPager(ViewPager viewPager, boolean smoothScroll) {
        try {
            return super.setupWithViewPager(viewPager, smoothScroll);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter enableShiftingMode(int position, boolean enable) {
        try {
            return super.enableShiftingMode(position, enable);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setItemBackground(int position, int background) {
        try {
            return super.setItemBackground(position, background);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setIconTintList(int position, ColorStateList tint) {
        try {
            return super.setIconTintList(position, tint);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setTextTintList(int position, ColorStateList tint) {
        try {
            return super.setTextTintList(position, tint);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setIconsMarginTop(int marginTop) {
        try {
            return super.setIconsMarginTop(marginTop);
        } catch (Exception e) {
            return this;
        }
    }

    @Override
    public ExNavbarInnter setIconMarginTop(int position, int marginTop) {
        try {
            return super.setIconMarginTop(position, marginTop);
        } catch (Exception e) {
            return this;
        }
    }
}