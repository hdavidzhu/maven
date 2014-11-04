package combunyipcmaven.github.maven;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;


public class RecordScreen extends Activity {
    private ShowCamera showCamera;
    private Camera cameraObject;

    Intent openBonusInfo;

    public static Camera isCameraAvailable() {
        Camera object = null;
        try {object = Camera.open();}
        catch (Exception e){}
        return object;
    }

    private Camera.PictureCallback capturedIt = new Camera.PictureCallback() {
        @Override
        public void onPictureTaken(byte[] data, Camera camera) {
            Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);
            if (bitmap == null) {
                Toast.makeText(getApplicationContext(), "not taken", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "taken", Toast.LENGTH_SHORT).show();
            }
            cameraObject.release();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_screen);
        cameraObject = isCameraAvailable();
        showCamera = new ShowCamera(this, cameraObject);
        FrameLayout preview = (FrameLayout) findViewById(R.id.camera_preview);
        preview.addView(showCamera);

        Button captureButton = (Button) findViewById(R.id.bt_capture);
        captureButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return true;
            }
        });

        openBonusInfo = new Intent("com.combunyipcmaven.github.maven.BonusInfo");

        Button videoSubmitButton = (Button) findViewById(R.id.bt_video_submit);
        videoSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(openBonusInfo);
            }
        });

    }

    public void snapIt(View view) {
        cameraObject.takePicture(null, null, capturedIt);
    }
}