package combunyipcmaven.github.maven;

import android.app.Activity;
import android.os.Bundle;


public class MyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);

        ProfileFragment profileFragment = new ProfileFragment();

        getFragmentManager().beginTransaction()
                .add(R.id.my_activity, profileFragment)
                .commit();
    }
}