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
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopCenter = "False";
    public static String AutoLeftTopRight = "False";
    public static String AutoLeftMiddleLeft = "False";
    public static String AutoLeftMiddleRight = "False";
    public static String AutoLeftBottomLeft = "False";
    /*public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
    public static String AutoLeftTopLeft = "False";
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        final CheckBox AutoAchivedMobilityCB = (CheckBox) findViewById(R.id.Auto_AchievedMobility_CB);

        final RadioButton AutoDockedRB = (RadioButton) findViewById(R.id.Auto_Docked_RB);
        final RadioButton AutoEngagedRB = (RadioButton) findViewById(R.id.Auto_Engaged_RB);
        final RadioButton AutoAttemptedRB = (RadioButton) findViewById(R.id.Auto_Attempted_RB);

        //Defines all Buttons_B);
        final Button AutoLeftTopLeftB = (Button) findViewById(R.id.Tele_LeftTopLeft_B);
        final Button AutoLeftMiddleLeftB = (Button) findViewById(R.id.Tele_LeftMiddleLeft_B);
        final Button AutoLeftBottomLeftB = (Button) findViewById(R.id.Tele_LeftBottomLeft_B);
        final Button AutoLeftTopCenterB = (Button) findViewById(R.id.Tele_LeftTopCenter_B);
        final Button AutoLeftMiddleCenterB = (Button) findViewById(R.id.Tele_LeftMiddleCenter_B);
        final Button AutoLeftBottomCenterB = (Button) findViewById(R.id.Tele_LeftBottomCenter_B);
        final Button AutoLeftTopRightB = (Button) findViewById(R.id.Tele_LeftTopRight_B);
        final Button AutoLeftMiddleRightB = (Button) findViewById(R.id.Tele_LeftMiddleRight_B);
        final Button AutoLeftBottomRightB = (Button) findViewById(R.id.Tele_LeftBottomRight_B);
        final Button AutoCoopTopLeftB = (Button) findViewById(R.id.Tele_CoopTopLeft_B);
        final Button AutoCoopTopCenterB = (Button) findViewById(R.id.Tele_CoopTopCenter_B);
        final Button AutoCoopTopRightB = (Button) findViewById(R.id.Tele_CoopTopRight_B);
        final Button AutoCoopMiddleLeftB = (Button) findViewById(R.id.Tele_CoopMiddleLeft_B);
        final Button AutoCoopMiddleCenterB = (Button) findViewById(R.id.Tele_CoopMiddleCenter_B);
        final Button AutoCoopMiddleRightB = (Button) findViewById(R.id.Tele_CoopMiddleRight_B);
        final Button AutoCoopBottomLeftB = (Button) findViewById(R.id.Tele_CoopBottomLeft_B);
        final Button AutoCoopBottomCenterB = (Button) findViewById(R.id.Tele_CoopBottomCenter_B);
        final Button AutoCoopBottomRightB = (Button) findViewById(R.id.Tele_CoopBottomRight_B);
        final Button AutoRightTopLeftB = (Button) findViewById(R.id.Tele_RightTopLeft_B);
        final Button AutoRightTopCenterB = (Button) findViewById(R.id.Tele_RightTopCenter_B);
        final Button AutoRightTopRightB = (Button) findViewById(R.id.Tele_RightTopRight_B);
        final Button AutoRightMiddleLeftB = (Button) findViewById(R.id.Tele_RightMiddleLeft_B);
        final Button AutoRightMiddleCenterB = (Button) findViewById(R.id.Tele_RightMiddleCenter_B);
        final Button AutoRightMiddleRightB = (Button) findViewById(R.id.Tele_RightMiddleRight_B);
        final Button AutoRightBottomLeftB = (Button) findViewById(R.id.Tele_RightBottomLeft_B);
        final Button AutoRightBottomCenterB = (Button) findViewById(R.id.Tele_RightBottomCenter_B);
        final Button AutoRightBottomRightB = (Button) findViewById(R.id.Tele_RightBottomRight_B);


        //Defines and implements Button to continue along with variable savings
        Button To_Teleop = (Button) findViewById(R.id.To_Teleop);
        To_Teleop.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
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
        /*AutoLeftTopLeftB.setOnClickListener(new View.OnClickListener());
        {
            @Override
            public void on(View v) {
            if(AutoLeftTopLeft) {
                AutoLeftTopLeftB.setBackgroundResource(R.color.colorYellow;

            }
            if(AutoLeftMiddleLeft) {
                AutoLeftMiddleLeftB.setBackgroundResource(R.color.colorYellow)
            }

        }
        }
*/
    }

}


