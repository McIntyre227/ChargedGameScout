package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__page);
        //WARNING: Anything above this line do not edit

        //Below to dotted line defines the needed button and are used to bring you to data collection start page
        Button Start_Collection_Open = (Button) findViewById(R.id.Start_Collection_Open_B); //Defines button for later use
        Start_Collection_Open.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                //Auto variables
                data_Collection_sandstorm.AutoAchievedMobility = "False";
                data_Collection_sandstorm.AutoDocked = "False";
                data_Collection_sandstorm.AutoEngaged = "False";
                data_Collection_sandstorm.AutoAttempted = "False";

                //Auto Left Grid
                data_Collection_sandstorm.AutoLeftTopLeft = "Grey";
                data_Collection_sandstorm.AutoLeftMiddleLeft = "Grey";
                data_Collection_sandstorm.AutoLeftBottomLeft = "Grey";
                data_Collection_sandstorm.AutoLeftTopCenter = "Grey";
                data_Collection_sandstorm.AutoLeftMiddleCenter = "Grey";
                data_Collection_sandstorm.AutoLeftBottomCenter = "Grey";
                data_Collection_sandstorm.AutoLeftTopRight = "Grey";
                data_Collection_sandstorm.AutoLeftMiddleRight = "Grey";
                data_Collection_sandstorm.AutoLeftBottomRight = "Grey";

                //Auto Coop Grid
                data_Collection_sandstorm.AutoCoopTopLeft = "Grey";
                data_Collection_sandstorm.AutoCoopMiddleLeft = "Grey";
                data_Collection_sandstorm.AutoCoopBottomLeft = "Grey";
                data_Collection_sandstorm.AutoCoopTopCenter = "Grey";
                data_Collection_sandstorm.AutoCoopMiddleCenter = "Grey";
                data_Collection_sandstorm.AutoCoopBottomCenter = "Grey";
                data_Collection_sandstorm.AutoCoopTopRight = "Grey";
                data_Collection_sandstorm.AutoCoopMiddleRight = "Grey";
                data_Collection_sandstorm.AutoCoopBottomRight = "Grey";

                //Auto Right Grid
                data_Collection_sandstorm.AutoRightTopLeft = "Grey";
                data_Collection_sandstorm.AutoRightMiddleLeft = "Grey";
                data_Collection_sandstorm.AutoRightBottomLeft = "Grey";
                data_Collection_sandstorm.AutoRightTopCenter = "Grey";
                data_Collection_sandstorm.AutoRightMiddleCenter = "Grey";
                data_Collection_sandstorm.AutoRightBottomCenter = "Grey";
                data_Collection_sandstorm.AutoRightTopRight = "Grey";
                data_Collection_sandstorm.AutoRightMiddleRight = "Grey";
                data_Collection_sandstorm.AutoRightBottomRight = "Grey";

                //TeleOp Variables
                data_collection_TeleOP.TeleTipped = "False";
                data_collection_TeleOP.TeleDefense = "False";
                data_collection_TeleOP.TeleFouls = "False";
                data_collection_TeleOP.TeleRobotStalled = "False";
                data_collection_TeleOP.TeleDocked = "False";
                data_collection_TeleOP.TeleEngaged = "False";
                data_collection_TeleOP.TeleParked = "False";
                data_collection_TeleOP.TeleAttempted = "False";

                //Tele Left Grid
                data_collection_TeleOP.TeleLeftTopLeft = "Grey";
                data_collection_TeleOP.TeleLeftMiddleLeft = "Grey";
                data_collection_TeleOP.TeleLeftBottomLeft = "Grey";
                data_collection_TeleOP.TeleLeftTopCenter = "Grey";
                data_collection_TeleOP.TeleLeftMiddleCenter = "Grey";
                data_collection_TeleOP.TeleLeftBottomCenter = "Grey";
                data_collection_TeleOP.TeleLeftTopRight = "Grey";
                data_collection_TeleOP.TeleLeftMiddleRight = "Grey";
                data_collection_TeleOP.TeleLeftBottomRight = "Grey";

                //Tele Coop Grid
                data_collection_TeleOP.TeleCoopTopLeft = "Grey";
                data_collection_TeleOP.TeleCoopMiddleLeft = "Grey";
                data_collection_TeleOP.TeleCoopBottomLeft = "Grey";
                data_collection_TeleOP.TeleCoopTopCenter = "Grey";
                data_collection_TeleOP.TeleCoopMiddleCenter = "Grey";
                data_collection_TeleOP.TeleCoopBottomCenter = "Grey";
                data_collection_TeleOP.TeleCoopTopRight = "Grey";
                data_collection_TeleOP.TeleCoopMiddleRight = "Grey";
                data_collection_TeleOP.TeleCoopBottomRight = "Grey";

                //Tele Right Grid
                data_collection_TeleOP.TeleRightTopLeft = "Grey";
                data_collection_TeleOP.TeleRightMiddleLeft = "Grey";
                data_collection_TeleOP.TeleRightBottomLeft = "Grey";
                data_collection_TeleOP.TeleRightTopCenter = "Grey";
                data_collection_TeleOP.TeleRightMiddleCenter = "Grey";
                data_collection_TeleOP.TeleRightBottomCenter = "Grey";
                data_collection_TeleOP.TeleRightTopRight = "Grey";
                data_collection_TeleOP.TeleRightMiddleRight = "Grey";
                data_collection_TeleOP.TeleRightBottomRight = "Grey";

                //data_Collection_sandstorm.AutoLeftBottomLeft = "Grey";

                Intent startintent = new Intent(getApplicationContext(), Data_Collection_Page_1.class);
                startActivity(startintent);
            }
        });
        //----------------------------------------------------------------------------------------------------------------

        /*
        //Below to dotted line defines the needed button and are used to bring you to the instruction page
        Button Instruct_Button = (Button) findViewById(R.id.Instructions);
        Instruct_Button.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Instructions_Page.class);
                startActivity(startintent);
            }
        });
        //----------------------------------------------------------------------------------------------------------------
    */
    }
}