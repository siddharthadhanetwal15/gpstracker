package and.com.gpstracker;

import android.os.Environment;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class LocationTrackingThread
{
    public LocationTrackingThread()
    {
        reference=FirebaseDatabase.getInstance().getReference();
    }


    DatabaseReference reference;
    File file;
    public void createFile() throws IOException {
        /*String path=Environment.getExternalStorageDirectory().getPath();
        String folder="/sid/gpsdata.txt";
        file=new File(path+folder);
        if (!file.exists())
        {
            file.createNewFile();
        }*/
    }
    double latitude;
    public void writeDataToFirebaseDatabase(double latitude, double longitude)
    {
    /*    ValueEventListener valueEventListener=new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
*/


                Location location=new Location();
                location.setLatitude(String.valueOf(latitude));
                location.setLongitude(String.valueOf(longitude));
                location.setTime(new Date().toString());
                reference.setValue(location);
                reference.child("location").push();


/*
        reference.child("location").child("latitude").setValue(latitude);
        reference.child("location").child("longitude").setValue(longitude);
        reference.child("location").child("time").setValue(new Date());*/
    }
    private void readDataFromFile()
    {

    }
}
