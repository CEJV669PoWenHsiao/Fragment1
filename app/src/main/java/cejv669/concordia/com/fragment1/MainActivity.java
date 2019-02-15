package cejv669.concordia.com.fragment1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.btn_ReplaceLayout);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fg = new BlankFragment();

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.list, fg);
                ft.commit();
            }
        });


    }
}
