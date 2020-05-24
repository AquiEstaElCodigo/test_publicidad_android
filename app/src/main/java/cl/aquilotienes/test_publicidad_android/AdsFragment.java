package cl.aquilotienes.test_publicidad_android;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class AdsFragment extends Fragment {

    private AdView mAdView;
    private AdRequest adRequest;


    public AdsFragment() {
        // Required empty public constructor
    }

    public AdsFragment(Context context) {
        // Required empty public constructor
        MobileAds.initialize(context);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        View rootView = inflater.inflate(R.layout.fragment_ads, container, false);
        mAdView  = (AdView) rootView.findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        return rootView;

    }
}
