package com.example.fitrition;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class FirebaseDatabaseHelper {
    private FirebaseDatabase mDatabase;
    private DatabaseReference mReferenceUsers;

    public interface DataStatus{
        void DataIsLoaded();
        void DataIsInserted();
        void DataIsUpdated();
        void DataIsDeleted();
    }

    public FirebaseDatabaseHelper() {
        // Gets the reference of the real-time database
        mDatabase.getInstance("https://fittrition-5b1fa-default-rtdb.europe-west1.firebasedatabase.app/");
        // References the books node with all it's children
        mReferenceUsers = mDatabase.getReference("users");
    }

    public void addUser(User user, final DataStatus dataStatus){
        String key = mReferenceUsers.push().getKey();
        mReferenceUsers.child(key).setValue(user).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                dataStatus.DataIsInserted();
            }
        });
    }
}
