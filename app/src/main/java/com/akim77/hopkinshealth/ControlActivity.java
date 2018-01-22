package com.akim77.hopkinshealth;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.akim77.hopkinshealth.fragments.DynamicSurveyFragment;

public class ControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        DynamicSurveyFragment dynamicSurveyFragment = new DynamicSurveyFragment();

        fragmentTransaction.replace(android.R.id.content, dynamicSurveyFragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, SubmissionManager.instance.prettyMapToString(), Toast.LENGTH_SHORT).show();
    }
}
