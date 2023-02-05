package swart525.dw.md.scout.space.a525spacescout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Actual_Submit extends AppCompatActivity {

    //Names the file it will be saved to
    public String fileName = "Blue_1_Data.csv";
    public String filePath = "/ScoutData/";

    //Compiles string for CSV file
    public String Final_String = Data_Collection_Page_1.Team_Num + "," +
            Data_Collection_Page_1.Match_Num + "," +
            data_Collection_sandstorm.AutoAttempted + "," +
            data_Collection_sandstorm.AutoAchivedMobility + "," +
            data_Collection_sandstorm.AutoDocked + "," +
            data_Collection_sandstorm.AutoEngaged + "," +
            //Left Grid
            data_Collection_sandstorm.AutoLeftTopLeft + "," +
            data_Collection_sandstorm.AutoLeftMiddleLeft + "," +
            data_Collection_sandstorm.AutoLeftBottomLeft + "," +
            data_Collection_sandstorm.AutoLeftTopCenter + "," +
            data_Collection_sandstorm.AutoLeftMiddleCenter + "," +
            data_Collection_sandstorm.AutoLeftBottomCenter + "," +
            data_Collection_sandstorm.AutoLeftTopRight + "," +
            data_Collection_sandstorm.AutoLeftMiddleRight + "," +
            data_Collection_sandstorm.AutoLeftBottomRight + "," +
            //Coop Grid
            data_Collection_sandstorm.AutoCoopTopLeft + "," +
            data_Collection_sandstorm.AutoCoopMiddleLeft + "," +
            data_Collection_sandstorm.AutoCoopBottomLeft + "," +
            data_Collection_sandstorm.AutoCoopTopCenter + "," +
            data_Collection_sandstorm.AutoCoopMiddleCenter + "," +
            data_Collection_sandstorm.AutoCoopBottomCenter + "," +
            data_Collection_sandstorm.AutoCoopTopRight + "," +
            data_Collection_sandstorm.AutoCoopMiddleRight + "," +
            data_Collection_sandstorm.AutoCoopBottomRight + "," +
            //Right Grid
            data_Collection_sandstorm.AutoRightTopLeft + "," +
            data_Collection_sandstorm.AutoRightMiddleLeft + "," +
            data_Collection_sandstorm.AutoRightBottomLeft + "," +
            data_Collection_sandstorm.AutoRightTopCenter + "," +
            data_Collection_sandstorm.AutoRightMiddleCenter + "," +
            data_Collection_sandstorm.AutoRightBottomCenter + "," +
            data_Collection_sandstorm.AutoRightTopRight + "," +
            data_Collection_sandstorm.AutoRightMiddleRight + "," +
            data_Collection_sandstorm.AutoRightBottomRight + "," +

            data_collection_TeleOP.TeleDefense + "," +
            data_collection_TeleOP.TeleFouls + "," +
            data_collection_TeleOP.TeleParked + "," +
            data_collection_TeleOP.TeleDocked + "," +
            data_collection_TeleOP.TeleEngaged + "," +
            data_collection_TeleOP.TeleAttempted + "," +
            data_collection_TeleOP.TeleTipped + "," +
            data_collection_TeleOP.TeleRobotStalled + "," +

            Save_Page.comment + "," +
            Data_Collection_Page_1.Initials;

    File externalStorageDir = Environment.getExternalStorageDirectory();
    public File Scout_Data = new File(externalStorageDir , "/DCIM/" + fileName);

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual__submit);
        Button Press_Here = (Button) findViewById(R.id.Press_Here);
        Button Click_to_go_Back = (Button) findViewById(R.id.Backto);

        Click_to_go_Back.setOnClickListener(new View.OnClickListener(){//Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });
    } */


    //Checks for confirmation from external storage
        private boolean isExternalStorageWritable () {
            if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
                Log.i("State", "Yes, it is writable!");
                return true;
            } else {
                return false;
            }
        }

        public void Press_Here (View v){
            if (isExternalStorageWritable() && checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                if(Scout_Data.exists() && Scout_Data.isFile() ){
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(Scout_Data, true)));
                        out.println(Final_String);
                        out.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    File textFile = new File(Environment.getExternalStorageDirectory().getPath() + "/DCIM", fileName);
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        FileOutputStream fos = new FileOutputStream(textFile);
                        Final_String = Final_String + "\n";
                        fos.write(Final_String.getBytes());
                        fos.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                //write an else if - turn on permissions
            }
        }

    public boolean checkPermission (String permission) {
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_actual__submit);
            final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
            Press_Here.setVisibility(View.VISIBLE);

    }
}










