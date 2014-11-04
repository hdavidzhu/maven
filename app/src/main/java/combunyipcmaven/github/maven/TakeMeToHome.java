package combunyipcmaven.github.maven;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TakeMeToHome extends Fragment {

    View takeMeToHome;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         takeMeToHome =  inflater.inflate(R.layout.yes_or_no, container, false);
        return takeMeToHome;
    }
}