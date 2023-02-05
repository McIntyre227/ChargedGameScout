package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static String AutoAchivedMobility = "False";
    public static String AutoDocked = "False";
    public static String AutoEngaged = "False";
    public static String AutoAttempted = "False";
    public static String AutoLeftTopLeft = "Grey";
    public static String AutoLeftTopCenter = "Grey";
    public static String AutoLeftTopRight = "Grey";
    public static String AutoLeftMiddleLeft = "Grey";
    public static String AutoLeftMiddleRight = "Grey";
    public static String AutoLeftBottomLeft = "Grey";
    public static String AutoLeftBottomCenter = "Grey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        final CheckBox AutoAchivedMobilityCB = (CheckBox) findViewById(R.id.Auto_AchievedMobility_CB);

        final RadioButton AutoDockedRB = (RadioButton) findViewById(R.id.Auto_Docked_RB);
        final RadioButton AutoEngagedRB = (RadioButton) findViewById(R.id.Auto_Engaged_RB);
        final RadioButton AutoAttemptedRB = (RadioButton) findViewById(R.id.Auto_Attempted_RB);

        //Defines all Buttons_B);
        final Button AutoLeftTopLeftB = (Button) findViewById(R.id.Auto_LeftTopLeft_B);
        final Button AutoLeftMiddleLeftB = (Button) findViewById(R.id.Auto_LeftMiddleLeft_B);
        final Button AutoLeftBottomLeftB = (Button) findViewById(R.id.Auto_LeftBottomLeft_B);
        final Button AutoLeftTopCenterB = (Button) findViewById(R.id.Auto_LeftTopCenter_B);
        final Button AutoLeftMiddleCenterB = (Button) findViewById(R.id.Auto_LeftMiddleCenter_B);
        final Button AutoLeftBottomCenterB = (Button) findViewById(R.id.Auto_LeftBottomCenter_B);
        final Button AutoLeftTopRightB = (Button) findViewById(R.id.Auto_LeftTopRight_B);
        final Button AutoLeftMiddleRightB = (Button) findViewById(R.id.Auto_LeftMiddleRight_B);
        final Button AutoLeftBottomRightB = (Button) findViewById(R.id.Auto_LeftBottomRight_B);
        final Button AutoCoopTopLeftB = (Button) findViewById(R.id.Auto_CoopTopLeft_B);
        final Button AutoCoopTopCenterB = (Button) findViewById(R.id.Auto_CoopTopCenter_B);
        final Button AutoCoopTopRightB = (Button) findViewById(R.id.Auto_CoopTopRight_B);
        final Button AutoCoopMiddleLeftB = (Button) findViewById(R.id.Auto_CoopMiddleLeft_B);
        final Button AutoCoopMiddleCenterB = (Button) findViewById(R.id.Auto_CoopMiddleCenter_B);
        final Button AutoCoopMiddleRightB = (Button) findViewById(R.id.Auto_CoopMiddleRight_B);
        final Button AutoCoopBottomLeftB = (Button) findViewById(R.id.Auto_CoopBottomLeft_B);
        final Button AutoCoopBottomCenterB = (Button) findViewById(R.id.Auto_CoopBottomCenter_B);
        final Button AutoCoopBottomRightB = (Button) findViewById(R.id.Auto_CoopBottomRight_B);
        final Button AutoRightTopLeftB = (Button) findViewById(R.id.Auto_RightTopLeft_B);
        final Button AutoRightTopCenterB = (Button) findViewById(R.id.Auto_RightTopCenter_B);
        final Button AutoRightTopRightB = (Button) findViewById(R.id.Auto_RightTopRight_B);
        final Button AutoRightMiddleLeftB = (Button) findViewById(R.id.Auto_RightMiddleLeft_B);
        final Button AutoRightMiddleCenterB = (Button) findViewById(R.id.Auto_RightMiddleCenter_B);
        final Button AutoRightMiddleRightB = (Button) findViewById(R.id.Auto_RightMiddleRight_B);
        final Button AutoRightBottomLeftB = (Button) findViewById(R.id.Auto_RightBottomLeft_B);
        final Button AutoRightBottomCenterB = (Button) findViewById(R.id.Auto_RightBottomCenter_B);
        final Button AutoRightBottomRightB = (Button) findViewById(R.id.Auto_RightBottomRight_B);


        //Defines and implements Button to continue to next page in the app.
        //The following only are checked when the button is pressed to go to the next page.
        Button To_Teleop = (Button) findViewById(R.id.To_Teleop);
        To_Teleop.setOnClickListener(new View.OnClickListener()
        { //only do the following when the To Teleop button is pressed.
            @Override
            public void onClick(View v) {

                if (AutoAchivedMobilityCB.isChecked()) {
                   AutoAchivedMobility = "True";
                }
                if (AutoDockedRB.isChecked()) {
                    AutoDocked = "True";
                }
                if (AutoEngagedRB.isChecked()) {
                    AutoEngaged = "True";
                }
                if (AutoAttemptedRB.isChecked()) {
                    AutoAttempted = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                startActivity(startintent);
            }
        });

        //The following code will fill out the grid when a button is pressed.
        //yellow for cones, purple for cubes, grey for no game element placed

        //This is the code for either cone or cube spots
        AutoLeftBottomLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftBottomLeft == "Grey") {
                    AutoLeftBottomLeftB.setBackgroundResource(R.color.colorYellow);
                    AutoLeftBottomLeft = "Yellow";
                }
                else if (AutoLeftBottomLeft == "Yellow") {
                    AutoLeftBottomLeftB.setBackgroundResource(R.color.colorPurple);
                    AutoLeftBottomLeft = "Purple";
                }
                else { // (AutoLeftBottomLeft == "Purple") {
                    AutoLeftBottomLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftBottomLeft = "Grey";
                }
            }
        });

        AutoLeftBottomCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftBottomCenter == "Grey") {
                    AutoLeftBottomCenterB.setBackgroundResource(R.color.colorYellow);
                    AutoLeftBottomCenter = "Yellow";
                }
                else if (AutoLeftBottomCenter == "Yellow") {
                    AutoLeftBottomCenterB.setBackgroundResource(R.color.colorPurple);
                    AutoLeftBottomCenter = "Purple";
                }
                else { // (AutoLeftBottomLeft == "Purple") {
                    AutoLeftBottomCenterB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftBottomCenter = "Grey";
                }
            }
        });

        //This is the code for cone only spots
        AutoLeftTopLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftTopLeft == "Grey") {
                    AutoLeftTopLeftB.setBackgroundResource(R.color.colorYellow);
                    AutoLeftTopLeft = "Yellow";
                }
                else {
                    AutoLeftTopLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftTopLeft = "Grey";
                }
            }
        });


        //This is the code for cube only spots
        AutoLeftMiddleLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftMiddleLeft == "Grey") {
                    AutoLeftMiddleLeftB.setBackgroundResource(R.color.colorPurple);
                    AutoLeftMiddleLeft = "Purple";
                }
                else {
                    AutoLeftMiddleLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftMiddleLeft = "Grey";
                }
            }
        });




    }  // bracket for this activity - do not delete
}   // bracket for this eintrie page - do not delete


