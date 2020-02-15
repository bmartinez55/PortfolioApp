package c.bmartinez.myportfolio;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationBehavior extends CoordinatorLayout.Behavior<BottomNavigationView> {

    public BottomNavigationBehavior(){ super(); }

    public BottomNavigationBehavior(Context context, AttributeSet attrs){ super(context, attrs); }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, BottomNavigationView child, View dependency){
        boolean dependsOn = dependency instanceof FrameLayout;
        return dependsOn;
    }

    @Override
    public boolean onNestedPreScroll(CoordinatorLayout coordinatorLayout, BottomNavigationView child, View target, int dx, int dy, int[] consumed){
        if(dy < 0)
            showBottomNavigationView(child);
        else if (dy > 0)
            hideBottomNavigationView(child);
    }
}
