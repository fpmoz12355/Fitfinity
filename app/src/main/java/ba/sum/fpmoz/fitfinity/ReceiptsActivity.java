package ba.sum.fpmoz.fitfinity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;


public class ReceiptsActivity extends AppCompatActivity{


    FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipts);
    }
}