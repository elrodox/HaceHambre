package cl.uv.ici.tallerdeandroid.hacehambre.dao;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

import cl.uv.ici.tallerdeandroid.hacehambre.model.user.IUser;
import cl.uv.ici.tallerdeandroid.hacehambre.model.user.UserFactory;
import cl.uv.ici.tallerdeandroid.hacehambre.model.user.UserType;

/**
 * Created by Rodolfo on 18/12/2016.
 */
public class UserAuth {
    private static DatabaseReference db = FirebaseDatabase.getInstance().getReference();
    private UserAuth() {
    }

    public static void createUser(String name, String email, String password){
        DatabaseReference db = FirebaseDatabase.getInstance().getReference();
        String key = db.child("users").push().getKey();
        Map<String, Object> userValues = new HashMap<>();

        userValues.put("name", name);
        userValues.put("email", email);
        userValues.put("password", password);

        Map<String, Object> childUpdates = new HashMap<>();
        childUpdates.put("/users/"+key, userValues);

        db.updateChildren(childUpdates);



//        String key = mDatabase.child("posts").push().getKey();
//        Post post = new Post(userId, username, title, body);
//        Map<String, Object> postValues = post.toMap();
//
//        Map<String, Object> childUpdates = new HashMap<>();
//        childUpdates.put("/posts/" + key, postValues);
//        childUpdates.put("/user-posts/" + userId + "/" + key, postValues);
//
//        mDatabase.updateChildren(childUpdates);


    }

    public static IUser auth(String email, String password){
//        db.child("users").equalTo("email", email).;
        ValueEventListener usersListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI
//                Post post = dataSnapshot.getValue(Post.class);
                // ...
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w("Firebase", "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };
        return UserFactory.createUser(email, password, UserType.CLIENT);
    }
}
