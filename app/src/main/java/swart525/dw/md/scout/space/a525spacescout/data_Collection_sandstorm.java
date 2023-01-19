package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    public static String AutoAchivedMobility = "False";
    public static String AutoDocked = "False";
    public static String AutoEngaged = "False";
    public static String AutoAttemptedEngaged = "False";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        final CheckBox AutoAchivedMobilityCB = (CheckBox) findViewById(R.id.Auto_AchievedMobility_CB);
        final CheckBox AutoDockedCB = (CheckBox) findViewById(R.id.Auto_Docked_CB);
        final CheckBox AutoEngagedCB = (CheckBox) findViewById(R.id.Auto_Engaged_CB);
        final CheckBox AutoAttemptedEngagedCB = (CheckBox) findViewById(R.id.Auto_AttemptedEngaged_CB);

        //Defines and implements Button to continue along with variable savings
        Button To_Teleop = (Button) findViewById(R.id.To_Teleop);
        To_Teleop.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                if (AutoAchivedMobilityCB.isChecked()) {
                   AutoAchivedMobility = "True";
                }
                if (AutoDockedCB.isChecked()) {
                    AutoDocked = "True";
                }
                if (AutoEngagedCB.isChecked()) {
                    AutoEngaged = "True";
                }
                if (AutoAttemptedEngagedCB.isChecked()) {
                    AutoAttemptedEngaged = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                startActivity(startintent);
            }
        });

    }

}


