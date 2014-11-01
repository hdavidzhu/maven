package combunyipcmaven.github.maven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VideoPrompt extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_prompt);

        final Intent openRecordScreen = new Intent("com.combunyipcmaven.github.maven.RecordScreen");

        final Button recordScreenButton = (Button) findViewById(R.id.bt_record_screen);
        recordScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(openRecordScreen);
            }
        });
    }
}