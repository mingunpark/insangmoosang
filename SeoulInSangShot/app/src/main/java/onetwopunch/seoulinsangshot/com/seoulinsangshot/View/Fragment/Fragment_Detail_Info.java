package onetwopunch.seoulinsangshot.com.seoulinsangshot.View.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import onetwopunch.seoulinsangshot.com.seoulinsangshot.R;

/**
 * Created by kwakgee on 2017. 9. 17..
 */

public class Fragment_Detail_Info extends Fragment {

    public Fragment_Detail_Info(){}

    public static Fragment_Detail_Info newInstance() {
        Fragment_Detail_Info fragment = new Fragment_Detail_Info();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_info, container, false);

        String area = getArguments().getString("area");
        Log.v("area", area);

        return rootView;

    }
}
