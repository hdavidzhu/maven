package combunyipcmaven.github.maven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends Activity {

    Intent openBasicInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);
        openBasicInfo = new Intent("com.combunyipcmaven.github.maven.MyActivity");

        Button loginButton = (Button) findViewById(R.id.bt_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(openBasicInfo);
            }
        });
    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        finish();
//    }
}