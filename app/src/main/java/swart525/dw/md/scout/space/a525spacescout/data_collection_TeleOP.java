package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;


//After the first competition, we decided to only count the inner and outer
//goals as the top goal instead of separating them. When scouting, it was too
//hard to distinguish whether it hit the inner or outer.

//We also decided we did not need the cycle time data, so the Cycle Counter
//buttons were deleted. The same was true for the Crossing through the shield generator.

//The code for the above deleted was commented and not deleted.

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection

    public static String TeleTipped = "False";
    public static String TeleDefense = "False";
    public static String TeleFouls = "False";
    public static String TeleRobotStalled = "False";
    public static String TeleDocked = "False";
    public static String TeleEngaged = "False";
    public static String TeleParked = "False";
    public static String TeleAttempted = "False";
    //Left Grid
    public static String TeleLeftTopLeft = "Grey";
    public static String TeleLeftMiddleLeft = "Grey";
    public static String TeleLeftBottomLeft = "Grey";
    public static String TeleLeftTopCenter = "Grey";
    public static String TeleLeftMiddleCenter = "Grey";
    public static String TeleLeftBottomCenter = "Grey";
    public static String TeleLeftTopRight = "Grey";
    public static String TeleLeftMiddleRight = "Grey";
    public static String TeleLeftBottomRight = "Grey";
    //Coop Grid
    public static String TeleCoopTopLeft = "Grey";
    public static String TeleCoopMiddleLeft = "Grey";
    public static String TeleCoopBottomLeft = "Grey";
    public static String TeleCoopTopCenter = "Grey";
    public static String TeleCoopMiddleCenter = "Grey";
    public static String TeleCoopBottomCenter = "Grey";
    public static String TeleCoopTopRight = "Grey";
    public static String TeleCoopMiddleRight = "Grey";
    public static String TeleCoopBottomRight = "Grey";
    //Right Grid
    public static String TeleRightTopLeft = "Grey";
    public static String TeleRightMiddleLeft = "Grey";
    public static String TeleRightBottomLeft = "Grey";
    public static String TeleRightTopCenter = "Grey";
    public static String TeleRightMiddleCenter = "Grey";
    public static String TeleRightBottomCenter = "Grey";
    public static String TeleRightTopRight = "Grey";
    public static String TeleRightMiddleRight = "Grey";
    public static String TeleRightBottomRight = "Grey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);


        //Defines all checkboxesed_CB);
        final CheckBox TeleDefenseCB = (CheckBox) findViewById(R.id.Tele_Defense_CB);
        final CheckBox TeleTippedCB = (CheckBox) findViewById(R.id.Tele_Tipped_CB);
        final CheckBox TeleFoulsCB = (CheckBox) findViewById(R.id.Tele_Fouls_CB);
        final CheckBox TeleRobotStallCB = (CheckBox) findViewById(R.id.Tele_RobotStall_CB);
        //Defines all RadioButtons_RB
        final RadioButton TeleDockedRB = (RadioButton) findViewById(R.id.Tele_Docked_RB);
        final RadioButton TeleEngagedRB = (RadioButton) findViewById(R.id.Tele_Engaged_RB);
        final RadioButton TeleAttemptedRB = (RadioButton) findViewById(R.id.Tele_Attempted_RB);
        final RadioButton TeleParkedRB = (RadioButton) findViewById(R.id.Tele_Parked_RB);
        //Defines all Buttons_B
        //Left Grid
        final Button TeleLeftTopLeftB = (Button) findViewById(R.id.Tele_LeftTopLeft_B);
        final Button TeleLeftMiddleLeftB = (Button) findViewById(R.id.Tele_LeftMiddleLeft_B);
        final Button TeleLeftBottomLeftB = (Button) findViewById(R.id.Tele_LeftBottomLeft_B);
        final Button TeleLeftTopCenterB = (Button) findViewById(R.id.Tele_LeftTopCenter_B);
        final Button TeleLeftMiddleCenterB = (Button) findViewById(R.id.Tele_LeftMiddleCenter_B);
        final Button TeleLeftBottomCenterB = (Button) findViewById(R.id.Tele_LeftBottomCenter_B);
        final Button TeleLeftTopRightB = (Button) findViewById(R.id.Tele_LeftTopRight_B);
        final Button TeleLeftMiddleRightB = (Button) findViewById(R.id.Tele_LeftMiddleRight_B);
        final Button TeleLeftBottomRightB = (Button) findViewById(R.id.Tele_LeftBottomRight_B);
        //Coop Grid
        final Button TeleCoopTopLeftB = (Button) findViewById(R.id.Tele_CoopTopLeft_B);
        final Button TeleCoopTopCenterB = (Button) findViewById(R.id.Tele_CoopTopCenter_B);
        final Button TeleCoopTopRightB = (Button) findViewById(R.id.Tele_CoopTopRight_B);
        final Button TeleCoopMiddleLeftB = (Button) findViewById(R.id.Tele_CoopMiddleLeft_B);
        final Button TeleCoopMiddleCenterB = (Button) findViewById(R.id.Tele_CoopMiddleCenter_B);
        final Button TeleCoopMiddleRightB = (Button) findViewById(R.id.Tele_CoopMiddleRight_B);
        final Button TeleCoopBottomLeftB = (Button) findViewById(R.id.Tele_CoopBottomLeft_B);
        final Button TeleCoopBottomCenterB = (Button) findViewById(R.id.Tele_CoopBottomCenter_B);
        final Button TeleCoopBottomRightB = (Button) findViewById(R.id.Tele_CoopBottomRight_B);
        //Right Grid
        final Button TeleRightTopLeftB = (Button) findViewById(R.id.Tele_RightTopLeft_B);
        final Button TeleRightTopCenterB = (Button) findViewById(R.id.Tele_RightTopCenter_B);
        final Button TeleRightTopRightB = (Button) findViewById(R.id.Tele_RightTopRight_B);
        final Button TeleRightMiddleLeftB = (Button) findViewById(R.id.Tele_RightMiddleLeft_B);
        final Button TeleRightMiddleCenterB = (Button) findViewById(R.id.Tele_RightMiddleCenter_B);
        final Button TeleRightMiddleRightB = (Button) findViewById(R.id.Tele_RightMiddleRight_B);
        final Button TeleRightBottomLeftB = (Button) findViewById(R.id.Tele_RightBottomLeft_B);
        final Button TeleRightBottomCenterB = (Button) findViewById(R.id.Tele_RightBottomCenter_B);
        final Button TeleRightBottomRightB = (Button) findViewById(R.id.Tele_RightBottomRight_B);

        //Left Grid
        if (data_Collection_sandstorm.AutoLeftTopLeft == "Yellow"){
            TeleLeftTopLeftB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoLeftMiddleLeft == "Yellow"){
            TeleLeftMiddleLeftB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoLeftBottomLeft == "Yellow"){
            TeleLeftBottomLeftB.setBackgroundResource(R.color.colorYellow);}
        else if (data_Collection_sandstorm.AutoLeftBottomLeft == "Purple") {
            TeleLeftBottomLeftB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoLeftTopCenter == "Purple"){
            TeleLeftTopCenterB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoLeftMiddleCenter == "Purple"){
            TeleLeftMiddleCenterB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoLeftBottomCenter == "Yellow"){
            TeleLeftBottomCenterB.setBackgroundResource(R.color.colorYellow);}
        else if (data_Collection_sandstorm.AutoLeftBottomCenter == "Purple") {
            TeleLeftBottomCenterB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoLeftTopRight == "Yellow"){
            TeleLeftTopRightB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoLeftMiddleRight == "Yellow"){
            TeleLeftMiddleRightB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoLeftBottomRight == "Yellow"){
            TeleLeftBottomRightB.setBackgroundResource(R.color.colorYellow);}
        else if (data_Collection_sandstorm.AutoLeftBottomRight == "Purple") {
            TeleLeftBottomRightB.setBackgroundResource(R.color.colorPurple);}

        //Coop Grid
        if (data_Collection_sandstorm.AutoCoopTopLeft == "Yellow"){
            TeleCoopTopLeftB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoCoopMiddleLeft == "Yellow"){
            TeleCoopMiddleLeftB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoCoopBottomLeft == "Yellow"){
            TeleCoopBottomLeftB.setBackgroundResource(R.color.colorYellow);}
        else if (data_Collection_sandstorm.AutoCoopBottomLeft == "Purple") {
            TeleCoopBottomLeftB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoCoopTopCenter == "Purple"){
            TeleCoopTopCenterB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoCoopMiddleCenter == "Purple"){
            TeleCoopMiddleCenterB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoCoopBottomCenter == "Yellow"){
            TeleCoopBottomCenterB.setBackgroundResource(R.color.colorYellow);}
        else if (data_Collection_sandstorm.AutoCoopBottomCenter == "Purple") {
            TeleCoopBottomCenterB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoCoopTopRight == "Yellow"){
            TeleCoopTopRightB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoCoopMiddleRight == "Yellow"){
            TeleCoopMiddleRightB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoCoopBottomRight == "Yellow"){
            TeleCoopBottomRightB.setBackgroundResource(R.color.colorYellow);}
        else if (data_Collection_sandstorm.AutoCoopBottomRight == "Purple") {
            TeleCoopBottomRightB.setBackgroundResource(R.color.colorPurple);}

        //Right Grid
        if (data_Collection_sandstorm.AutoRightTopLeft == "Yellow"){
            TeleRightTopLeftB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoRightMiddleLeft == "Yellow"){
            TeleRightMiddleLeftB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoRightBottomLeft == "Yellow"){
            TeleRightBottomLeftB.setBackgroundResource(R.color.colorYellow);}
        else if (data_Collection_sandstorm.AutoRightBottomLeft == "Purple") {
            TeleRightBottomLeftB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoRightTopCenter == "Purple"){
            TeleRightTopCenterB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoRightMiddleCenter == "Purple"){
            TeleRightMiddleCenterB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoRightBottomCenter == "Yellow"){
            TeleRightBottomCenterB.setBackgroundResource(R.color.colorYellow);}
        else if (data_Collection_sandstorm.AutoRightBottomCenter == "Purple") {
            TeleRightBottomCenterB.setBackgroundResource(R.color.colorPurple);}

        if (data_Collection_sandstorm.AutoRightTopRight == "Yellow"){
            TeleRightTopRightB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoRightMiddleRight == "Yellow"){
            TeleRightMiddleRightB.setBackgroundResource(R.color.colorYellow);}

        if (data_Collection_sandstorm.AutoRightBottomRight == "Yellow"){
            TeleRightBottomRightB.setBackgroundResource(R.color.colorYellow);}
        else if (data_Collection_sandstorm.AutoRightBottomRight == "Purple") {
            TeleRightBottomRightB.setBackgroundResource(R.color.colorPurple);}



        //Below defines the button and commands for saving data and switching pages
        Button To_Submission = (Button) findViewById(R.id.To_Submision_B);
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
           public void onClick(View v) {

                if (TeleTippedCB.isChecked()) {
                    TeleTipped = "True";
                }

                if (TeleDefenseCB.isChecked()) {
                    TeleDefense = "True";
                }

                if (TeleFoulsCB.isChecked()) {
                    TeleFouls = "True";
                }

                if (TeleRobotStallCB.isChecked()) {
                    TeleRobotStalled = "True";
                }

                if (TeleDockedRB.isChecked()) {
                    TeleDocked = "True";
                }
                if (TeleEngagedRB.isChecked()) {
                    TeleEngaged = "True";
                }
                if (TeleAttemptedRB.isChecked()) {
                    TeleAttempted = "True";
                }
                if (TeleParkedRB.isChecked()) {
                    TeleParked = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(startintent);
            }
        });

        //The following code will fill out the grid when a button is pressed.
        //yellow for cones, purple for cubes, grey for no game element placed


        //This is the code for either cone or cube spots
        //Left Grid
        TeleLeftBottomLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleLeftBottomLeft == "Grey") {
                    TeleLeftBottomLeftB.setBackgroundResource(R.color.colorYellow);
                    TeleLeftBottomLeft = "Yellow";
                }
                else if (TeleLeftBottomLeft == "Yellow") {
                    TeleLeftBottomLeftB.setBackgroundResource(R.color.colorPurple);
                    TeleLeftBottomLeft = "Purple";
                }
                else { // (TeleLeftBottomLeft == "Purple") {
                    TeleLeftBottomLeftB.setBackgroundResource(R.color.colorGrey);
                    TeleLeftBottomLeft = "Grey";
                }
            }
        });

        TeleLeftBottomCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleLeftBottomCenter == "Grey") {
                    TeleLeftBottomCenterB.setBackgroundResource(R.color.colorYellow);
                    TeleLeftBottomCenter = "Yellow";
                }
                else if (TeleLeftBottomCenter == "Yellow") {
                    TeleLeftBottomCenterB.setBackgroundResource(R.color.colorPurple);
                    TeleLeftBottomCenter = "Purple";
                }
                else { // (TeleLeftBottomLeft == "Purple") {
                    TeleLeftBottomCenterB.setBackgroundResource(R.color.colorGrey);
                    TeleLeftBottomCenter = "Grey";
                }
            }
        });

        TeleLeftBottomRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleLeftBottomRight == "Grey") {
                    TeleLeftBottomRightB.setBackgroundResource(R.color.colorYellow);
                    TeleLeftBottomRight = "Yellow";
                }
                else if (TeleLeftBottomRight == "Yellow") {
                    TeleLeftBottomRightB.setBackgroundResource(R.color.colorPurple);
                    TeleLeftBottomRight = "Purple";
                }
                else { // (TeleLeftBottomLeft == "Purple") {
                    TeleLeftBottomRightB.setBackgroundResource(R.color.colorGrey);
                    TeleLeftBottomRight = "Grey";
                }
            }
        });

        //Coop Grid
        TeleCoopBottomLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleCoopBottomLeft == "Grey") {
                    TeleCoopBottomLeftB.setBackgroundResource(R.color.colorYellow);
                    TeleCoopBottomLeft = "Yellow";
                }
                else if (TeleCoopBottomLeft == "Yellow") {
                    TeleCoopBottomLeftB.setBackgroundResource(R.color.colorPurple);
                    TeleCoopBottomLeft = "Purple";
                }
                else { // (TeleCoopBottomLeft == "Purple") {
                    TeleCoopBottomLeftB.setBackgroundResource(R.color.colorGrey);
                    TeleCoopBottomLeft = "Grey";
                }
            }
        });

        TeleCoopBottomCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleCoopBottomCenter == "Grey") {
                    TeleCoopBottomCenterB.setBackgroundResource(R.color.colorYellow);
                    TeleCoopBottomCenter = "Yellow";
                }
                else if (TeleCoopBottomCenter == "Yellow") {
                    TeleCoopBottomCenterB.setBackgroundResource(R.color.colorPurple);
                    TeleCoopBottomCenter = "Purple";
                }
                else { // (TeleCoopBottomLeft == "Purple") {
                    TeleCoopBottomCenterB.setBackgroundResource(R.color.colorGrey);
                    TeleCoopBottomCenter = "Grey";
                }
            }
        });

        TeleCoopBottomRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleCoopBottomRight == "Grey") {
                    TeleCoopBottomRightB.setBackgroundResource(R.color.colorYellow);
                    TeleCoopBottomRight = "Yellow";
                }
                else if (TeleCoopBottomRight == "Yellow") {
                    TeleCoopBottomRightB.setBackgroundResource(R.color.colorPurple);
                    TeleCoopBottomRight = "Purple";
                }
                else { // (TeleCoopBottomLeft == "Purple") {
                    TeleCoopBottomRightB.setBackgroundResource(R.color.colorGrey);
                    TeleCoopBottomRight = "Grey";
                }
            }
        });

        //Right Grid
        TeleRightBottomLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleRightBottomLeft == "Grey") {
                    TeleRightBottomLeftB.setBackgroundResource(R.color.colorYellow);
                    TeleRightBottomLeft = "Yellow";
                }
                else if (TeleRightBottomLeft == "Yellow") {
                    TeleRightBottomLeftB.setBackgroundResource(R.color.colorPurple);
                    TeleRightBottomLeft = "Purple";
                }
                else { // (TeleRightBottomLeft == "Purple") {
                    TeleRightBottomLeftB.setBackgroundResource(R.color.colorGrey);
                    TeleRightBottomLeft = "Grey";
                }
            }
        });

        TeleRightBottomCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleRightBottomCenter == "Grey") {
                    TeleRightBottomCenterB.setBackgroundResource(R.color.colorYellow);
                    TeleRightBottomCenter = "Yellow";
                }
                else if (TeleRightBottomCenter == "Yellow") {
                    TeleRightBottomCenterB.setBackgroundResource(R.color.colorPurple);
                    TeleRightBottomCenter = "Purple";
                }
                else { // (TeleRightBottomLeft == "Purple") {
                    TeleRightBottomCenterB.setBackgroundResource(R.color.colorGrey);
                    TeleRightBottomCenter = "Grey";
                }
            }
        });

        TeleRightBottomRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleRightBottomRight == "Grey") {
                    TeleRightBottomRightB.setBackgroundResource(R.color.colorYellow);
                    TeleRightBottomRight = "Yellow";
                }
                else if (TeleRightBottomRight == "Yellow") {
                    TeleRightBottomRightB.setBackgroundResource(R.color.colorPurple);
                    TeleRightBottomRight = "Purple";
                }
                else { // (TeleRightBottomLeft == "Purple") {
                    TeleRightBottomRightB.setBackgroundResource(R.color.colorGrey);
                    TeleRightBottomRight = "Grey";
                }
            }
        });


        //This is the code for cone only spots
        //Left Grid
        TeleLeftTopLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleLeftTopLeft == "Grey") {
                    TeleLeftTopLeftB.setBackgroundResource(R.color.colorYellow);
                    TeleLeftTopLeft = "Yellow";
                }
                else {
                    TeleLeftTopLeftB.setBackgroundResource(R.color.colorGrey);
                    TeleLeftTopLeft = "Grey";
                }
            }
        });

        TeleLeftMiddleLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleLeftMiddleLeft == "Grey") {
                    TeleLeftMiddleLeftB.setBackgroundResource(R.color.colorYellow);
                    TeleLeftMiddleLeft = "Yellow";
                }
                else {
                    TeleLeftMiddleLeftB.setBackgroundResource(R.color.colorGrey);
                    TeleLeftMiddleLeft = "Grey";
                }
            }
        });

        TeleLeftTopRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleLeftTopRight == "Grey") {
                    TeleLeftTopRightB.setBackgroundResource(R.color.colorYellow);
                    TeleLeftTopRight = "Yellow";
                }
                else {
                    TeleLeftTopRightB.setBackgroundResource(R.color.colorGrey);
                    TeleLeftTopRight = "Grey";
                }
            }
        });

        TeleLeftMiddleRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleLeftMiddleRight == "Grey") {
                    TeleLeftMiddleRightB.setBackgroundResource(R.color.colorYellow);
                    TeleLeftMiddleRight = "Yellow";
                }
                else {
                    TeleLeftMiddleRightB.setBackgroundResource(R.color.colorGrey);
                    TeleLeftMiddleRight = "Grey";
                }
            }
        });

        //Coop Grid
        TeleCoopTopLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleCoopTopLeft == "Grey") {
                    TeleCoopTopLeftB.setBackgroundResource(R.color.colorYellow);
                    TeleCoopTopLeft = "Yellow";
                }
                else {
                    TeleCoopTopLeftB.setBackgroundResource(R.color.colorGrey);
                    TeleCoopTopLeft = "Grey";
                }
            }
        });

        TeleCoopMiddleLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleCoopMiddleLeft == "Grey") {
                    TeleCoopMiddleLeftB.setBackgroundResource(R.color.colorYellow);
                    TeleCoopMiddleLeft = "Yellow";
                }
                else {
                    TeleCoopMiddleLeftB.setBackgroundResource(R.color.colorGrey);
                    TeleCoopMiddleLeft = "Grey";
                }
            }
        });

        TeleCoopTopRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleCoopTopRight == "Grey") {
                    TeleCoopTopRightB.setBackgroundResource(R.color.colorYellow);
                    TeleCoopTopRight = "Yellow";
                }
                else {
                    TeleCoopTopRightB.setBackgroundResource(R.color.colorGrey);
                    TeleCoopTopRight = "Grey";
                }
            }
        });

        TeleCoopMiddleRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleCoopMiddleRight == "Grey") {
                    TeleCoopMiddleRightB.setBackgroundResource(R.color.colorYellow);
                    TeleCoopMiddleRight = "Yellow";
                }
                else {
                    TeleCoopMiddleRightB.setBackgroundResource(R.color.colorGrey);
                    TeleCoopMiddleRight = "Grey";
                }
            }
        });

        //Right Grid
        TeleRightTopLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleRightTopLeft == "Grey") {
                    TeleRightTopLeftB.setBackgroundResource(R.color.colorYellow);
                    TeleRightTopLeft = "Yellow";
                }
                else {
                    TeleRightTopLeftB.setBackgroundResource(R.color.colorGrey);
                    TeleRightTopLeft = "Grey";
                }
            }
        });

        TeleRightMiddleLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleRightMiddleLeft == "Grey") {
                    TeleRightMiddleLeftB.setBackgroundResource(R.color.colorYellow);
                    TeleRightMiddleLeft = "Yellow";
                }
                else {
                    TeleRightMiddleLeftB.setBackgroundResource(R.color.colorGrey);
                    TeleRightMiddleLeft = "Grey";
                }
            }
        });

        TeleRightTopRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleRightTopRight == "Grey") {
                    TeleRightTopRightB.setBackgroundResource(R.color.colorYellow);
                    TeleRightTopRight = "Yellow";
                }
                else {
                    TeleRightTopRightB.setBackgroundResource(R.color.colorGrey);
                    TeleRightTopRight = "Grey";
                }
            }
        });

        TeleRightMiddleRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleRightMiddleRight == "Grey") {
                    TeleRightMiddleRightB.setBackgroundResource(R.color.colorYellow);
                    TeleRightMiddleRight = "Yellow";
                }
                else {
                    TeleRightMiddleRightB.setBackgroundResource(R.color.colorGrey);
                    TeleRightMiddleRight = "Grey";
                }
            }
        });


        //This is the code for cube only spots
        //Left Grid
        TeleLeftTopCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleLeftTopCenter == "Grey") {
                    TeleLeftTopCenterB.setBackgroundResource(R.color.colorPurple);
                    TeleLeftTopCenter = "Purple";
                }
                else {
                    TeleLeftTopCenterB.setBackgroundResource(R.color.colorGrey);
                    TeleLeftTopCenter = "Grey";
                }
            }
        });

        TeleLeftMiddleCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleLeftMiddleCenter == "Grey") {
                    TeleLeftMiddleCenterB.setBackgroundResource(R.color.colorPurple);
                    TeleLeftMiddleCenter = "Purple";
                }
                else {
                    TeleLeftMiddleCenterB.setBackgroundResource(R.color.colorGrey);
                    TeleLeftMiddleCenter = "Grey";
                }
            }
        });

        //Coop Grid
        TeleCoopTopCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleCoopTopCenter == "Grey") {
                    TeleCoopTopCenterB.setBackgroundResource(R.color.colorPurple);
                    TeleCoopTopCenter = "Purple";
                }
                else {
                    TeleCoopTopCenterB.setBackgroundResource(R.color.colorGrey);
                    TeleCoopTopCenter = "Grey";
                }
            }
        });

        TeleCoopMiddleCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleCoopMiddleCenter == "Grey") {
                    TeleCoopMiddleCenterB.setBackgroundResource(R.color.colorPurple);
                    TeleCoopMiddleCenter = "Purple";
                }
                else {
                    TeleCoopMiddleCenterB.setBackgroundResource(R.color.colorGrey);
                    TeleCoopMiddleCenter = "Grey";
                }
            }
        });

        //Right Grid
        TeleRightTopCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleRightTopCenter == "Grey") {
                    TeleRightTopCenterB.setBackgroundResource(R.color.colorPurple);
                    TeleRightTopCenter = "Purple";
                }
                else {
                    TeleRightTopCenterB.setBackgroundResource(R.color.colorGrey);
                    TeleRightTopCenter = "Grey";
                }
            }
        });

        TeleRightMiddleCenterB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TeleRightMiddleCenter == "Grey") {
                    TeleRightMiddleCenterB.setBackgroundResource(R.color.colorPurple);
                    TeleRightMiddleCenter = "Purple";
                }
                else {
                    TeleRightMiddleCenterB.setBackgroundResource(R.color.colorGrey);
                    TeleRightMiddleCenter = "Grey";
                }
            }
        });

    }  // bracket for this activity - do not delete
}   // bracket for this eintrie page - do not delete