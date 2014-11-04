package combunyipcmaven.github.maven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BonusInfo extends Activity {
    Intent openProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bonus_info);

        Button submitBonusInfo = (Button) findViewById(R.id.bt_submit_bonus_info);
        openProfile = new Intent(this, Profile.class);
        openProfile.putExtra("source", "BonusInfo");

        submitBonusInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(openProfile);
            }
        });
    }
}