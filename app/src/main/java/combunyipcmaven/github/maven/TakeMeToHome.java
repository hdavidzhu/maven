package combunyipcmaven.github.maven;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TakeMeToHome extends Fragment {

    View takeMeToHome;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        takeMeToHome =  inflater.inflate(R.layout.take_me_to_home, container, false);

        context = getActivity();
        Button openHome = (Button) takeMeToHome.findViewById(R.id.bt_take_me_to_home);
        openHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openHome = new Intent(context, HomeActivity.class);
                startActivity(openHome);
            }
        });

        return takeMeToHome;


    }

    @Override
    public void onResume() {
        super.onResume();

    }
}