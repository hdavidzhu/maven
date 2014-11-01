package combunyipcmaven.github.maven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        final Intent openBasicInfo = new Intent("com.combunyipcmaven.github.maven.BasicInfoInput");

        Button basicInfoButton = (Button) findViewById(R.id.bt_signup_form);
        basicInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(openBasicInfo);
            }
        });


    }
}
