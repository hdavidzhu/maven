package combunyipcmaven.github.maven;


import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.media.audiofx.EnvironmentalReverb;
import android.os.Environment;

import java.io.File;

public class RecordScreen extends Activity{

    Camera camera;
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;
    CameraPreview preview = new CameraPreview(this, camera);
    File dir = this.getExternalFilesDir(Environment.DIRECTORY_MOVIES);


//    File dir  = Environment.getExternalStorageDirectory(Environment.DIRECTORY_PICTURES);

    private MediaRecorder mr;
    protected boolean prepareForVideoRecording() {
        camera.unlock();
        mr = new MediaRecorder();
        mr.setCamera(camera);
        mr.setAudioSource(MediaRecorder.AudioSource.CAMCORDER);
        mr.setVideoSource(MediaRecorder.VideoSource.CAMERA);
        mr.setProfile(CamcorderProfile.get(CamcorderProfile.QUALITY_HIGH));
        mr.setOutputFile(getOutputMediaFile(MEDIA_TYPE_VIDEO).toString());
        mr.setPreviewDisplay(preview.getHolder().getSurface());

        return true;
    }

    private File getOutputMediaFile(int type) {
        // Get directory and timestamp as before
        if (type == MEDIA_TYPE_IMAGE) {
            return new File(dir.getPath() + File.separator + "IMG_"
                    + timeStamp + ".jpg");
        } else if (type == MEDIA_TYPE_VIDEO) {
            return new File(dir.getPath() + File.separator + "VID_"
                    + timeStamp + ".3gp");
        } else {
            return null;
        }
    }


    }

}
