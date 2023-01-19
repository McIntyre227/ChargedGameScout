package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


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
    public static String TeleAttemptedDock = "False";
    public static String TeleEngaged = "False";
    public static String TelePark = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        //Defines all checkboxesed_CB);
        final CheckBox TeleDefenseCB = (CheckBox) findViewById(R.id.Tele_Defense_CB);
        final CheckBox TeleTippedCB = (CheckBox) findViewById(R.id.Tele_Tipped_CB);
        final CheckBox TeleFoulsCB = (CheckBox) findViewById(R.id.Tele_Fouls_CB);
        final CheckBox TeleRobotStallCB = (CheckBox) findViewById(R.id.Tele_RobotStall_CB);
        final CheckBox TeleDockedCB = (CheckBox) findViewById(R.id.Tele_Docked_CB);
        final CheckBox TeleAttemptedDockCB = (CheckBox) findViewById(R.id.Tele_AttemptedDock_CB);
        final CheckBox TeleEngagedCB = (CheckBox) findViewById(R.id.Tele_Engaged_CB);
        final CheckBox TeleParkCB = (CheckBox) findViewById(R.id.Tele_Park_CB);

        //Below defines the button and commands for saving data and switching pages
        Button To_EndGame = (Button) findViewById(R.id.To_Endgame_B);
        To_EndGame.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
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

                if (TeleDockedCB.isChecked()) {
                    TeleDocked = "True";
                }

                if (TeleAttemptedDockCB.isChecked()) {
                    TeleAttemptedDock = "True";
                }

                if (TeleEngagedCB.isChecked()) {
                    TeleEngaged = "True";
                }

                if (TeleParkCB.isChecked()) {
                    TelePark = "True";
                }

                    Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                    startActivity(startintent);
                }

        });
    }
}
