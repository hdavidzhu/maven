package combunyipcmaven.github.maven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends Activity {

    Intent openProfile;
    Intent openSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);
        openProfile = new Intent("com.combunyipcmaven.github.maven.MyActivity");
        openSignup = new Intent("com.combunyipcmaven.github.maven.Signup");

        Button loginButton = (Button) findViewById(R.id.bt_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(openProfile);
            }
        });

        Button signupButton = (Button) findViewById(R.id.bt_signup);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(openSignup);
            }
        });
    }
}