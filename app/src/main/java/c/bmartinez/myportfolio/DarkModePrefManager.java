package c.bmartinez.myportfolio;

import android.content.Context;
import android.content.SharedPreferences;

public class DarkModePrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    //Shared pref mode
    int PRIVATE_MODDE = 0;

    //Shared preferences file name
    private static final String PREF_NAME = "dark-mode";
    private static  final String IS_NIGHT_MODE = "IsNightMode";

    public DarkModePrefManager(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME,PRIVATE_MODDE);
        editor = pref.edit();
    }

    public void setDarkMode(boolean isFirstTime){
        editor.putBoolean(IS_NIGHT_MODE, true);
        editor.commit();
    }
}
