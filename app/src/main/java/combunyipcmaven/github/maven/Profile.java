package combunyipcmaven.github.maven;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
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

        Intent openProfile = getIntent();

        String source = openProfile.getStringExtra("source");
        displayByLocation(source);

    }

    private void displayByLocation(String source) {
        if (source.equals("BonusInfo")){
            TakeMeToHome takeMeToHome = new TakeMeToHome();
            profileTransaction.replace(R.id.notifications, takeMeToHome);
        } else if (source.equals("Preview")) {

        } else {

        }

    }

    @Override
    public void onItemSelected(String choice) {
//        switch (choice){
//            case "yes":
//            profileTransaction.replace(R.id.profile, profileFragment);
//        }
    }
}