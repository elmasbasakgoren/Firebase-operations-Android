package companyprofileapp.com;

        import android.os.Bundle;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;

        import java.util.zip.Adler32;


public class activity3 extends AppCompatActivity implements ValueEventListener {
    TextView textView;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference firstDatabase = databaseReference.child("Vision");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aactivity_3);
        textView = (TextView)findViewById(R.id.A3);

    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        if (dataSnapshot.getValue(String.class)!= null) {
            String key = dataSnapshot.getKey();
            if (key.equals("Vision")){
                String A3 = dataSnapshot.getValue(String.class);

                textView.setText(A3);
            }
        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }

    @Override
    protected void onStart(){

        super.onStart();
        firstDatabase.addValueEventListener(this);

    }
}
