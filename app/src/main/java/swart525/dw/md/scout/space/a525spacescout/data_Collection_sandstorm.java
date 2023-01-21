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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        final CheckBox AutoAchivedMobilityCB = (CheckBox) findViewById(R.id.Auto_AchievedMobility_CB);

        final RadioButton AutoDockedRB = (RadioButton) findViewById(R.id.Auto_Docked_RB);
        final RadioButton AutoEngagedRB = (RadioButton) findViewById(R.id.Auto_Engaged_RB);
        final RadioButton AutoAttemptedRB = (RadioButton) findViewById(R.id.Auto_Attempted_RB);

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

    }

}


