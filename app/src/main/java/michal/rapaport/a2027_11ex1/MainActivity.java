package michal.rapaport.a2027_11ex1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
     private Button btPlus;
     private Button btMinus;
     private TextView tvPoints;
     private int points = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btPlus = findViewById(R.id.btPlus);
        btMinus = findViewById(R.id.btMinus);
        tvPoints = findViewById(R.id.tvPoints);

        btPlus.setOnClickListener(v -> {
            points++;
            tvPoints.setText("you have " + points + " points");
        });

        btMinus.setOnClickListener(v -> {
            points--;
            tvPoints.setText("you have " + points + " points");
        });
 

    }
}