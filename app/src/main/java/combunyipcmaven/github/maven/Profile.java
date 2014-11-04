package combunyipcmaven.github.maven;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class Profile extends Activity
    implements YesOrNo.Callbacks {

    FragmentTransaction profileTransaction;
    ProfileFragment profileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        profileFragment = new ProfileFragment();
        YesOrNo yesOrNo = new YesOrNo();

        profileTransaction = getFragmentManager().beginTransaction();
        profileTransaction
                .add(R.id.profile, profileFragment)
                .commit();
    }

    @Override
    public void onItemSelected(String choice) {
        switch (choice){
            case "yes":
            profileTransaction.replace(R.id.profile, profileFragment);


        }
    }
}