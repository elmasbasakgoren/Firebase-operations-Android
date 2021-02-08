package companyprofileapp.com;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
İmport com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Activity4 extends AppCompatActivity {

    private static final String TAG = "Activity4";

    private static final String KEY_TITLE ="title";
    private static final String KEY_DESCRIPTION = "description";

    private EditText editTextTitle;
    private EditText editTextDescription;

   private FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        editTextTitle = findViewById(R.id.edit_text_title);
        editTextDescription = findViewById(R.id.edit_text_2title);

        }

         public void saveNote(View view)
        {
          String title = editTextTitle.getText().toString();
        String description = editTextDescription.getText().toString();

         Map<String, Object> note = new HashMap<>();

         note.put(KEY_TITLE, title);
         note.put(KEY_DESCRIPTION, description);


          db.collection("notebook").document("My First Note").set(note)
                 .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                 public void onSuccess(Void aVoid) {
                    Toast.makeText(Activity4.this, "Note Saved", Toast.LENGTH_SHORT).show();
                     //basarili olma durumunda
               }
             })
                 .addOnFailureListener(new OnFailureListener() {
                   @Override
                public void onFailure(@NonNull Exception e) {
                  Toast.makeText(Activity4.this, "Error!", Toast.LENGTH_SHORT).show();
                  Log.d(TAG, e.toString());
        }
        });
        }


           }

    }}