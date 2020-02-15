package c.bmartinez.myportfolio;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationBehavior extends CoordinatorLayout.Behavior<BottomNavigationView> {

    public BottomNavigationBehavior(){ super(); }

    public BottomNavigationBehavior(Context context, AttributeSet attrs){ super(context, attrs); }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, BottomNavigationView child, View dependency){
        
    }
}
