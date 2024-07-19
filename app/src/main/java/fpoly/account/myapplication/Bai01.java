package fpoly.account.myapplication;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

import fpoly.account.myapplication.Fragments.Fragment1;
import fpoly.account.myapplication.Fragments.Fragment2;

public class Bai01 extends AppCompatActivity {
    TextView tvFragment1, tvFragment2;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvFragment1 = findViewById(R.id.tv_fragment1);
        tvFragment2 = findViewById(R.id.tv_fragment2);
        frameLayout = findViewById(R.id.fragment_container);
        tvFragment1.setOnClickListener(v -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container, new Fragment1()).commit();
        });
        tvFragment2.setOnClickListener(v -> {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment_container, new Fragment2()).commit();
        });
    }
}