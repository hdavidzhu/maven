package combunyipcmaven.github.maven;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class YesOrNo extends Fragment {

    View yesOrNo;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        yesOrNo =  inflater.inflate(R.layout.yes_or_no, container, false);
        return yesOrNo;
    }

    public interface Callbacks {
        public void onItemSelected(String yesNoChoice);
    }
}