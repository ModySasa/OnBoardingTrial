package com.example.android.onboardingtrial;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PaperOnboardingPage scr1 = new PaperOnboardingPage(null, null,
                ContextCompat.getColor(this,R.color.background), R.drawable.onboard1, R.drawable.tabicon);
        PaperOnboardingPage scr2 = new PaperOnboardingPage(null, null,
                ContextCompat.getColor(this,R.color.background), R.drawable.onboard2, R.drawable.tabicon);
        PaperOnboardingPage scr3 = new PaperOnboardingPage(null, null,
                ContextCompat.getColor(this,R.color.background), R.drawable.onboard3, R.drawable.tabicon);

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(scr1);
        elements.add(scr2);
        elements.add(scr3);
        PaperOnboardingFragment onBoardingFragment = PaperOnboardingFragment.newInstance(elements);

        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, onBoardingFragment).commit();

        Button skip_button=findViewById(R.id.skip_button);
        skip_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO open the next activity through intent
            }
        });
    }
}
