package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_collection_end_game extends AppCompatActivity {

    //Defines needed variables

    public static String HangTraversal = "False";
    public static String HangHigh = "False";
    public static String HangMid = "False";
    public static String HangLow = "False";
    public static String NoHang = "False";
    public static String AttemptedHang = "False";
    public static String NoAttempt = "False";
    public static String FellOffRung = "False";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements
        final RadioButton HangHighRB = (RadioButton) findViewById(R.id.HangHigh_RB);
        final RadioButton HangMidRB = (RadioButton) findViewById(R.id.HangMid_RB);
        final RadioButton HangLowRB = (RadioButton) findViewById(R.id.HangLow_RB);
        final RadioButton NohangRB = (RadioButton) findViewById(R.id.Nohang_RB);

        final CheckBox AttemptedHangCB = (CheckBox) findViewById(R.id.AttemptedHang_CB);

        final CheckBox FellOffRungCB = (CheckBox) findViewById(R.id.FellOffRung_CB);


        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                if (HangHighRB.isChecked()) {
                    HangHigh = "True";
                }
                if (HangMidRB.isChecked())  {
                    HangMid = "True";
                }
                if (HangLowRB.isChecked()) {
                    HangLow = "True";
                }
                if (AttemptedHangCB.isChecked()) {
                    AttemptedHang = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(startintent);
            }
        });


    }

}


