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
    //Left Grid
    public static String AutoLeftTopLeft = "Grey";
    public static String AutoLeftMiddleLeft = "Grey";
    public static String AutoLeftBottomLeft = "Grey";
    public static String AutoLeftTopCenter = "Grey";
    public static String AutoLeftMiddleCenter = "Grey";
    public static String AutoLeftBottomCenter = "Grey";
    public static String AutoLeftTopRight = "Grey";
    public static String AutoLeftMiddleRight = "Grey";
    public static String AutoLeftBottomRight = "Grey";
    //Coop Grid
    public static String AutoCoopTopLeft = "Grey";
    public static String AutoCoopMiddleLeft = "Grey";
    public static String AutoCoopBottomLeft = "Grey";
    public static String AutoCoopTopCenter = "Grey";
    public static String AutoCoopMiddleCenter = "Grey";
    public static String AutoCoopBottomCenter = "Grey";
    public static String AutoCoopTopRight = "Grey";
    public static String AutoCoopMiddleRight = "Grey";
    public static String AutoCoopBottomRight = "Grey";
    //Right Grid
    public static String AutoRightTopLeft = "Grey";
    public static String AutoRightMiddleLeft = "Grey";
    public static String AutoRightBottomLeft = "Grey";
    public static String AutoRightTopCenter = "Grey";
    public static String AutoRightMiddleCenter = "Grey";
    public static String AutoRightBottomCenter = "Grey";
    public static String AutoRightTopRight = "Grey";
    public static String AutoRightMiddleRight = "Grey";
    public static String AutoRightBottomRight = "Grey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);
        //Defines all CheckBox_CB
        final CheckBox AutoAchivedMobilityCB = (CheckBox) findViewById(R.id.Auto_AchievedMobility_CB);
        //Defines all RadioButtons_RB
        final RadioButton AutoDockedRB = (RadioButton) findViewById(R.id.Auto_Docked_RB);
        final RadioButton AutoEngagedRB = (RadioButton) findViewById(R.id.Auto_Engaged_RB);
        final RadioButton AutoAttemptedRB = (RadioButton) findViewById(R.id.Auto_Attempted_RB);
        //Defines all Buttons_B
             //Left Grid
        final Button AutoLeftTopLeftB = (Button) findViewById(R.id.Auto_LeftTopLeft_B);
        final Button AutoLeftMiddleLeftB = (Button) findViewById(R.id.Auto_LeftMiddleLeft_B);
        final Button AutoLeftBottomLeftB = (Button) findViewById(R.id.Auto_LeftBottomLeft_B);
        final Button AutoLeftTopCenterB = (Button) findViewById(R.id.Auto_LeftTopCenter_B);
        final Button AutoLeftMiddleCenterB = (Button) findViewById(R.id.Auto_LeftMiddleCenter_B);
        final Button AutoLeftBottomCenterB = (Button) findViewById(R.id.Auto_LeftBottomCenter_B);
        final Button AutoLeftTopRightB = (Button) findViewById(R.id.Auto_LeftTopRight_B);
        final Button AutoLeftMiddleRightB = (Button) findViewById(R.id.Auto_LeftMiddleRight_B);
        final Button AutoLeftBottomRightB = (Button) findViewById(R.id.Auto_LeftBottomRight_B);
             //Coop Grid
        final Button AutoCoopTopLeftB = (Button) findViewById(R.id.Auto_CoopTopLeft_B);
        final Button AutoCoopTopCenterB = (Button) findViewById(R.id.Auto_CoopTopCenter_B);
        final Button AutoCoopTopRightB = (Button) findViewById(R.id.Auto_CoopTopRight_B);
        final Button AutoCoopMiddleLeftB = (Button) findViewById(R.id.Auto_CoopMiddleLeft_B);
        final Button AutoCoopMiddleCenterB = (Button) findViewById(R.id.Auto_CoopMiddleCenter_B);
        final Button AutoCoopMiddleRightB = (Button) findViewById(R.id.Auto_CoopMiddleRight_B);
        final Button AutoCoopBottomLeftB = (Button) findViewById(R.id.Auto_CoopBottomLeft_B);
        final Button AutoCoopBottomCenterB = (Button) findViewById(R.id.Auto_CoopBottomCenter_B);
        final Button AutoCoopBottomRightB = (Button) findViewById(R.id.Auto_CoopBottomRight_B);
             //Right Grid
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
        //Left Grid
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

        AutoLeftBottomRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftBottomRight == "Grey") {
                    AutoLeftBottomRightB.setBackgroundResource(R.color.colorYellow);
                    AutoLeftBottomRight = "Yellow";
                }
                else if (AutoLeftBottomRight == "Yellow") {
                    AutoLeftBottomRightB.setBackgroundResource(R.color.colorPurple);
                    AutoLeftBottomRight = "Purple";
                }
                else { // (AutoLeftBottomLeft == "Purple") {
                    AutoLeftBottomRightB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftBottomRight = "Grey";
                }
            }
        });

        //Coop Grid
        AutoCoopBottomLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoCoopBottomLeft == "Grey") {
                    AutoCoopBottomLeftB.setBackgroundResource(R.color.colorYellow);
                    AutoCoopBottomLeft = "Yellow";
                }
                else if (AutoCoopBottomLeft == "Yellow") {
                    AutoCoopBottomLeftB.setBackgroundResource(R.color.colorPurple);
                    AutoCoopBottomLeft = "Purple";
                }
                else { // (AutoCoopBottomLeft == "Purple") {
                    AutoCoopBottomLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoCoopBottomLeft = "Grey";
                }
            }
        });

        AutoCoopBottomCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoCoopBottomCenter == "Grey") {
                    AutoCoopBottomCenterB.setBackgroundResource(R.color.colorYellow);
                    AutoCoopBottomCenter = "Yellow";
                }
                else if (AutoCoopBottomCenter == "Yellow") {
                    AutoCoopBottomCenterB.setBackgroundResource(R.color.colorPurple);
                    AutoCoopBottomCenter = "Purple";
                }
                else { // (AutoCoopBottomLeft == "Purple") {
                    AutoCoopBottomCenterB.setBackgroundResource(R.color.colorGrey);
                    AutoCoopBottomCenter = "Grey";
                }
            }
        });

        AutoCoopBottomRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoCoopBottomRight == "Grey") {
                    AutoCoopBottomRightB.setBackgroundResource(R.color.colorYellow);
                    AutoCoopBottomRight = "Yellow";
                }
                else if (AutoCoopBottomRight == "Yellow") {
                    AutoCoopBottomRightB.setBackgroundResource(R.color.colorPurple);
                    AutoCoopBottomRight = "Purple";
                }
                else { // (AutoCoopBottomLeft == "Purple") {
                    AutoCoopBottomRightB.setBackgroundResource(R.color.colorGrey);
                    AutoCoopBottomRight = "Grey";
                }
            }
        });

        //Right Grid
        AutoRightBottomLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoRightBottomLeft == "Grey") {
                    AutoRightBottomLeftB.setBackgroundResource(R.color.colorYellow);
                    AutoRightBottomLeft = "Yellow";
                }
                else if (AutoRightBottomLeft == "Yellow") {
                    AutoRightBottomLeftB.setBackgroundResource(R.color.colorPurple);
                    AutoRightBottomLeft = "Purple";
                }
                else { // (AutoRightBottomLeft == "Purple") {
                    AutoRightBottomLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoRightBottomLeft = "Grey";
                }
            }
        });

        AutoRightBottomCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoRightBottomCenter == "Grey") {
                    AutoRightBottomCenterB.setBackgroundResource(R.color.colorYellow);
                    AutoRightBottomCenter = "Yellow";
                }
                else if (AutoRightBottomCenter == "Yellow") {
                    AutoRightBottomCenterB.setBackgroundResource(R.color.colorPurple);
                    AutoRightBottomCenter = "Purple";
                }
                else { // (AutoRightBottomLeft == "Purple") {
                    AutoRightBottomCenterB.setBackgroundResource(R.color.colorGrey);
                    AutoRightBottomCenter = "Grey";
                }
            }
        });

        AutoRightBottomRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoRightBottomRight == "Grey") {
                    AutoRightBottomRightB.setBackgroundResource(R.color.colorYellow);
                    AutoRightBottomRight = "Yellow";
                }
                else if (AutoRightBottomRight == "Yellow") {
                    AutoRightBottomRightB.setBackgroundResource(R.color.colorPurple);
                    AutoRightBottomRight = "Purple";
                }
                else { // (AutoRightBottomLeft == "Purple") {
                    AutoRightBottomRightB.setBackgroundResource(R.color.colorGrey);
                    AutoRightBottomRight = "Grey";
                }
            }
        });


        //This is the code for cone only spots
        //Left Grid
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

        AutoLeftMiddleLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftMiddleLeft == "Grey") {
                    AutoLeftMiddleLeftB.setBackgroundResource(R.color.colorYellow);
                    AutoLeftMiddleLeft = "Yellow";
                }
                else {
                    AutoLeftMiddleLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftMiddleLeft = "Grey";
                }
            }
        });

        AutoLeftTopRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftTopRight == "Grey") {
                    AutoLeftTopRightB.setBackgroundResource(R.color.colorYellow);
                    AutoLeftTopRight = "Yellow";
                }
                else {
                    AutoLeftTopRightB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftTopRight = "Grey";
                }
            }
        });

        AutoLeftMiddleRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftMiddleRight == "Grey") {
                    AutoLeftMiddleRightB.setBackgroundResource(R.color.colorYellow);
                    AutoLeftMiddleRight = "Yellow";
                }
                else {
                    AutoLeftMiddleRightB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftMiddleRight = "Grey";
                }
            }
        });

        //Coop Grid
        AutoCoopTopLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoCoopTopLeft == "Grey") {
                    AutoCoopTopLeftB.setBackgroundResource(R.color.colorYellow);
                    AutoCoopTopLeft = "Yellow";
                }
                else {
                    AutoCoopTopLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoCoopTopLeft = "Grey";
                }
            }
        });

        AutoCoopMiddleLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoCoopMiddleLeft == "Grey") {
                    AutoCoopMiddleLeftB.setBackgroundResource(R.color.colorYellow);
                    AutoCoopMiddleLeft = "Yellow";
                }
                else {
                    AutoCoopMiddleLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoCoopMiddleLeft = "Grey";
                }
            }
        });

        AutoCoopTopRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoCoopTopRight == "Grey") {
                    AutoCoopTopRightB.setBackgroundResource(R.color.colorYellow);
                    AutoCoopTopRight = "Yellow";
                }
                else {
                    AutoCoopTopRightB.setBackgroundResource(R.color.colorGrey);
                    AutoCoopTopRight = "Grey";
                }
            }
        });

        AutoCoopMiddleRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoCoopMiddleRight == "Grey") {
                    AutoCoopMiddleRightB.setBackgroundResource(R.color.colorYellow);
                    AutoCoopMiddleRight = "Yellow";
                }
                else {
                    AutoCoopMiddleRightB.setBackgroundResource(R.color.colorGrey);
                    AutoCoopMiddleRight = "Grey";
                }
            }
        });

        //Right Grid
        AutoRightTopLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoRightTopLeft == "Grey") {
                    AutoRightTopLeftB.setBackgroundResource(R.color.colorYellow);
                    AutoRightTopLeft = "Yellow";
                }
                else {
                    AutoRightTopLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoRightTopLeft = "Grey";
                }
            }
        });

        AutoRightMiddleLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoRightMiddleLeft == "Grey") {
                    AutoRightMiddleLeftB.setBackgroundResource(R.color.colorYellow);
                    AutoRightMiddleLeft = "Yellow";
                }
                else {
                    AutoRightMiddleLeftB.setBackgroundResource(R.color.colorGrey);
                    AutoRightMiddleLeft = "Grey";
                }
            }
        });

        AutoRightTopRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoRightTopRight == "Grey") {
                    AutoRightTopRightB.setBackgroundResource(R.color.colorYellow);
                    AutoRightTopRight = "Yellow";
                }
                else {
                    AutoRightTopRightB.setBackgroundResource(R.color.colorGrey);
                    AutoRightTopRight = "Grey";
                }
            }
        });

        AutoRightMiddleRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoRightMiddleRight == "Grey") {
                    AutoRightMiddleRightB.setBackgroundResource(R.color.colorYellow);
                    AutoRightMiddleRight = "Yellow";
                }
                else {
                    AutoRightMiddleRightB.setBackgroundResource(R.color.colorGrey);
                    AutoRightMiddleRight = "Grey";
                }
            }
        });


        //This is the code for cube only spots
        //Left Grid
        AutoLeftTopCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftTopCenter == "Grey") {
                    AutoLeftTopCenterB.setBackgroundResource(R.color.colorPurple);
                    AutoLeftTopCenter = "Purple";
                }
                else {
                    AutoLeftTopCenterB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftTopCenter = "Grey";
                }
            }
        });

        AutoLeftMiddleCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoLeftMiddleCenter == "Grey") {
                    AutoLeftMiddleCenterB.setBackgroundResource(R.color.colorPurple);
                    AutoLeftMiddleCenter = "Purple";
                }
                else {
                    AutoLeftMiddleCenterB.setBackgroundResource(R.color.colorGrey);
                    AutoLeftMiddleCenter = "Grey";
                }
            }
        });

        //Coop Grid
        AutoCoopTopCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoCoopTopCenter == "Grey") {
                    AutoCoopTopCenterB.setBackgroundResource(R.color.colorPurple);
                    AutoCoopTopCenter = "Purple";
                }
                else {
                    AutoCoopTopCenterB.setBackgroundResource(R.color.colorGrey);
                    AutoCoopTopCenter = "Grey";
                }
            }
        });

        AutoCoopMiddleCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoCoopMiddleCenter == "Grey") {
                    AutoCoopMiddleCenterB.setBackgroundResource(R.color.colorPurple);
                    AutoCoopMiddleCenter = "Purple";
                }
                else {
                    AutoCoopMiddleCenterB.setBackgroundResource(R.color.colorGrey);
                    AutoCoopMiddleCenter = "Grey";
                }
            }
        });

        //Right Grid
        AutoRightTopCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoRightTopCenter == "Grey") {
                    AutoRightTopCenterB.setBackgroundResource(R.color.colorPurple);
                    AutoRightTopCenter = "Purple";
                }
                else {
                    AutoRightTopCenterB.setBackgroundResource(R.color.colorGrey);
                    AutoRightTopCenter = "Grey";
                }
            }
        });

        AutoRightMiddleCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (AutoRightMiddleCenter == "Grey") {
                    AutoRightMiddleCenterB.setBackgroundResource(R.color.colorPurple);
                    AutoRightMiddleCenter = "Purple";
                }
                else {
                    AutoRightMiddleCenterB.setBackgroundResource(R.color.colorGrey);
                    AutoRightMiddleCenter = "Grey";
                }
            }
        });

    }  // bracket for this activity - do not delete
}   // bracket for this eintrie page - do not delete


