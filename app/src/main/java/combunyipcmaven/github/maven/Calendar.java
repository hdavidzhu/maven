package combunyipcmaven.github.maven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calendar extends Activity {

    Intent openCalendarViewer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.time_choose);
        openCalendarViewer = new Intent("com.combunyipcmaven.github.maven.Calendar");

        Button finishCalendarButton = (Button) findViewById(R.id.bt_finish_calendar);
        finishCalendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(openCalendarViewer);
            }
        });
    }
}
