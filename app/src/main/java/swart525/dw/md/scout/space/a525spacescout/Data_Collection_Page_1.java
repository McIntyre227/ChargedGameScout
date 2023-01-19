package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines Variables for Match/Team Number
    public static int Team_Num = 0;
    public static int Match_Num = 0;
    public static String Initials = "We got a runner";

    public static boolean flgBlueAlliance = false;

    public static String Red1 = "False";
    public boolean flgRed1 = true;
    public static String Red2 = "False";
    public boolean flgRed2 = true;
    public static String Red3 = "False";
    public boolean flgRed3 = true;
    public static String Red4 = "False";
    public boolean flgRed4 = true;
    public static String Red5 = "False";
    public boolean flgRed5 = true;
    public static String Red6 = "False";
    public boolean flgRed6 = true;
    //   public static String RedOther = "False";
    public static String Blue1 = "False";
    public boolean flgBlue1 = true;
    public static String Blue2 = "False";
    public boolean flgBlue2 = true;
    public static String Blue3 = "False";
    public boolean flgBlue3 = true;
    public static String Blue4 = "False";
    public boolean flgBlue4 = true;
    public static String Blue5 = "False";
    public boolean flgBlue5 = true;
    public static String Blue6 = "False";
    public boolean flgBlue6 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison numbers
        final int Compare_Match_Num = 150; //Match must be less than 150
        final int Compare_Team_Num = 1; //Team must be greater than 1

        //Defines text boxes for Match/Team Number
        final EditText Match_Num_txt = (EditText) findViewById(R.id.Match_Num_Txt);
        final EditText Team_Num_txt = (EditText) findViewById(R.id.Team_Num_txt);
        final EditText Initials_txt = (EditText) findViewById(R.id.Init_Txt);

        //Defines all RadioButtons for positions
       // final RadioButton StartLocation1RB = (RadioButton) findViewById(R.id.StartLocation1_RB);
        //final RadioButton StartLocation2RB = (RadioButton) findViewById(R.id.StartLocation2_RB);
        //final RadioButton StartLocation3RB = (RadioButton) findViewById(R.id.StartLocation3_RB);
       // final RadioButton StartLocation4RB = (RadioButton) findViewById(R.id.StartLocation4_RB);
       // final RadioButton StartLocation5RB = (RadioButton) findViewById(R.id.StartLocation5_RB);
       // final RadioButton StartLocation6RB = (RadioButton) findViewById(R.id.StartLocation6_RB);
       // final RadioButton StartUnknownRB = (RadioButton) findViewById(R.id.StartUnknown_RB);


        //final Button Red1CB = (Button) findViewById(R.id.Red1_B);
        //final Button Red2CB = (Button) findViewById(R.id.Red2_B);
        //final Button Red3CB = (Button) findViewById(R.id.Red3_B);
        //final Button Red4CB = (Button) findViewById(R.id.Red4_B);
        //final Button Red5CB = (Button) findViewById(R.id.Red5_B);
        //final Button Red6CB = (Button) findViewById(R.id.Red6_B);
        //  final Button RedOtherCB = (Button) findViewById(R.id.Red_Other_B);
        //final Button Blue1CB = (Button) findViewById(R.id.Blue1_B);
        //final Button Blue2CB = (Button) findViewById(R.id.Blue2_B);
        //final Button Blue3CB = (Button) findViewById(R.id.Blue3_B);
        //final Button Blue4CB = (Button) findViewById(R.id.Blue4_B);
        //final Button Blue5CB = (Button) findViewById(R.id.Blue5_B);
        //final Button Blue6CB = (Button) findViewById(R.id.Blue6_B);
        //  final Button BlueOtherCB = (Button) findViewById(R.id.Blue_Other_CB);

        //Defines button needed and actions to cancel a data collection
        Button Cancel_Collection = (Button) findViewById(R.id.Cancel_Collection_B);
        Cancel_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });
        /*if (flgBlueAlliance) {
            Red1CB.setBackgroundResource(R.color.grey_button);
            Red2CB.setBackgroundResource(R.color.grey_button);
            Red3CB.setBackgroundResource(R.color.grey_button);
            Red4CB.setBackgroundResource(R.color.grey_button);
            Red5CB.setBackgroundResource(R.color.grey_button);
            Red6CB.setBackgroundResource(R.color.grey_button);
            Blue1CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if (flgBlue1) {
                        Blue1CB.setBackgroundResource(R.color.button_yes_blue);
                        Blue2CB.setBackgroundResource(R.color.button_no);
                        Blue3CB.setBackgroundResource(R.color.button_no);
                        Blue4CB.setBackgroundResource(R.color.button_no);
                        Blue5CB.setBackgroundResource(R.color.button_no);
                        Blue6CB.setBackgroundResource(R.color.button_no);
                        flgBlue1 = false;
                        flgBlue2 = true;
                        flgBlue3 = true;
                        flgBlue4 = true;
                        flgBlue5 = true;
                        flgBlue6 = true;
                        Blue1 = "True";
                        Blue2 = "False";
                        Blue3 = "False";
                        Blue4 = "False";
                        Blue5 = "False";
                        Blue6 = "False";
                    } else {
                        Blue1CB.setBackgroundResource(R.color.button_no);
                        flgBlue1 = true;
                        Blue1 = "False";
                    }
                }
            });
            Blue2CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if (flgBlue2) {
                        Blue1CB.setBackgroundResource(R.color.button_no);
                        Blue2CB.setBackgroundResource(R.color.button_yes_blue);
                        Blue3CB.setBackgroundResource(R.color.button_no);
                        Blue4CB.setBackgroundResource(R.color.button_no);
                        Blue5CB.setBackgroundResource(R.color.button_no);
                        Blue6CB.setBackgroundResource(R.color.button_no);
                        flgBlue1 = true;
                        flgBlue2 = false;
                        flgBlue3 = true;
                        flgBlue4 = true;
                        flgBlue5 = true;
                        flgBlue6 = true;
                        Blue1 = "False";
                        Blue2 = "True";
                        Blue3 = "False";
                        Blue4 = "False";
                        Blue5 = "False";
                        Blue6 = "False";
                    } else {
                        Blue2CB.setBackgroundResource(R.color.button_no);
                        flgBlue2 = true;
                        Blue2 = "False";
                    }
                }
            });
            Blue3CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if (flgBlue3) {
                        Blue1CB.setBackgroundResource(R.color.button_no);
                        Blue2CB.setBackgroundResource(R.color.button_no);
                        Blue3CB.setBackgroundResource(R.color.button_yes_blue);
                        Blue4CB.setBackgroundResource(R.color.button_no);
                        Blue5CB.setBackgroundResource(R.color.button_no);
                        Blue6CB.setBackgroundResource(R.color.button_no);
                        flgBlue1 = true;
                        flgBlue2 = true;
                        flgBlue3 = false;
                        flgBlue4 = true;
                        flgBlue5 = true;
                        flgBlue6 = true;
                        Blue1 = "False";
                        Blue2 = "False";
                        Blue3 = "True";
                        Blue4 = "False";
                        Blue5 = "False";
                        Blue6 = "False";
                    } else {
                        Blue3CB.setBackgroundResource(R.color.button_no);
                        flgBlue3 = true;
                        Blue3 = "False";
                    }
                }
            });

            Blue4CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if (flgBlue4) {
                        Blue1CB.setBackgroundResource(R.color.button_no);
                        Blue2CB.setBackgroundResource(R.color.button_no);
                        Blue3CB.setBackgroundResource(R.color.button_no);
                        Blue4CB.setBackgroundResource(R.color.button_yes_blue);
                        Blue5CB.setBackgroundResource(R.color.button_no);
                        Blue6CB.setBackgroundResource(R.color.button_no);
                        flgBlue1 = true;
                        flgBlue2 = true;
                        flgBlue3 = true;
                        flgBlue4 = false;
                        flgBlue5 = true;
                        flgBlue6 = true;
                        Blue1 = "False";
                        Blue2 = "False";
                        Blue3 = "False";
                        Blue4 = "True";
                        Blue5 = "False";
                        Blue6 = "False";
                    } else {
                        Blue4CB.setBackgroundResource(R.color.button_no);
                        flgBlue4 = true;
                        Blue4 = "False";
                    }
                }
            });

            Blue5CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if (flgBlue5) { ;
                        Blue1CB.setBackgroundResource(R.color.button_no);
                        Blue2CB.setBackgroundResource(R.color.button_no);
                        Blue3CB.setBackgroundResource(R.color.button_no);
                        Blue4CB.setBackgroundResource(R.color.button_no);
                        Blue5CB.setBackgroundResource(R.color.button_yes_blue);
                        Blue6CB.setBackgroundResource(R.color.button_no);
                        flgBlue1 = true;
                        flgBlue2 = true;
                        flgBlue3 = true;
                        flgBlue4 = true;
                        flgBlue5 = false;
                        flgBlue6 = true;
                        Blue1 = "False";
                        Blue2 = "False";
                        Blue3 = "False";
                        Blue4 = "False";
                        Blue5 = "True";
                        Blue6 = "False";
                    } else {
                        Blue5CB.setBackgroundResource(R.color.button_no);
                        flgBlue5 = true;
                        Blue5 = "False";
                    }
                }
            });

            Blue6CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if (flgBlue6) {
                        Blue1CB.setBackgroundResource(R.color.button_no);
                        Blue2CB.setBackgroundResource(R.color.button_no);
                        Blue3CB.setBackgroundResource(R.color.button_no);
                        Blue4CB.setBackgroundResource(R.color.button_no);
                        Blue5CB.setBackgroundResource(R.color.button_no);
                        Blue6CB.setBackgroundResource(R.color.button_yes_blue);
                        flgBlue1 = true;
                        flgBlue2 = true;
                        flgBlue3 = true;
                        flgBlue4 = true;
                        flgBlue5 = true;
                        flgBlue6 = false;
                        Blue1 = "False";
                        Blue2 = "False";
                        Blue3 = "False";
                        Blue4 = "False";
                        Blue5 = "False";
                        Blue6 = "True";
                    } else {
                        Blue6CB.setBackgroundResource(R.color.button_no);
                        flgBlue6 = true;
                        Blue6 = "False";
                    }
                }
            });
        }else{
            Blue1CB.setBackgroundResource(R.color.grey_button);
            Blue2CB.setBackgroundResource(R.color.grey_button);
            Blue3CB.setBackgroundResource(R.color.grey_button);
            Blue4CB.setBackgroundResource(R.color.grey_button);
            Blue5CB.setBackgroundResource(R.color.grey_button);
            Blue6CB.setBackgroundResource(R.color.grey_button);
            Red1CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if(flgRed1) {
                        Red1CB.setBackgroundResource(R.color.button_yes_red);
                        Red2CB.setBackgroundResource(R.color.button_no);
                        Red3CB.setBackgroundResource(R.color.button_no);
                        Red4CB.setBackgroundResource(R.color.button_no);
                        Red5CB.setBackgroundResource(R.color.button_no);
                        Red6CB.setBackgroundResource(R.color.button_no);
                        flgRed1 = false;
                        flgRed2 = true;
                        flgRed3 = true;
                        flgRed4 = true;
                        flgRed5 = true;
                        flgRed6 = true;
                        Red1 = "True";
                        Red2 = "False";
                        Red3 = "False";
                        Red4 = "False";
                        Red5 = "False";
                        Red6 = "False";
                    }else{
                        Red1CB.setBackgroundResource(R.color.button_no);
                        flgRed1 = true;
                        Red1 = "False";
                    }
                }
            });

            Red2CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if(flgRed2) {
                        Red1CB.setBackgroundResource(R.color.button_no);
                        Red2CB.setBackgroundResource(R.color.button_yes_red);
                        Red3CB.setBackgroundResource(R.color.button_no);
                        Red4CB.setBackgroundResource(R.color.button_no);
                        Red5CB.setBackgroundResource(R.color.button_no);
                        Red6CB.setBackgroundResource(R.color.button_no);
                        flgRed1 = true;
                        flgRed2 = false;
                        flgRed3 = true;
                        flgRed4 = true;
                        flgRed5 = true;
                        flgRed6 = true;
                        Red1 = "False";
                        Red2 = "True";
                        Red3 = "False";
                        Red4 = "False";
                        Red5 = "False";
                        Red6 = "False";
                    }else{
                        Red2CB.setBackgroundResource(R.color.button_no);
                        flgRed2 = true;
                        Red2 = "False";
                    }
                }
            });

            Red3CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if(flgRed3) {
                        Red1CB.setBackgroundResource(R.color.button_no);
                        Red2CB.setBackgroundResource(R.color.button_no);
                        Red3CB.setBackgroundResource(R.color.button_yes_red);
                        Red4CB.setBackgroundResource(R.color.button_no);
                        Red5CB.setBackgroundResource(R.color.button_no);
                        Red6CB.setBackgroundResource(R.color.button_no);
                        flgRed1 = true;
                        flgRed2 = true;
                        flgRed3 = false;
                        flgRed4 = true;
                        flgRed5 = true;
                        flgRed6 = true;
                        Red1 = "False";
                        Red2 = "False";
                        Red3 = "True";
                        Red4 = "False";
                        Red5 = "False";
                        Red6 = "False";
                    }else{
                        Red3CB.setBackgroundResource(R.color.button_no);
                        flgRed3 = true;
                        Red3 = "False";
                    }
                }
            });

            Red4CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if(flgRed4) {
                        Red1CB.setBackgroundResource(R.color.button_no);
                        Red2CB.setBackgroundResource(R.color.button_no);
                        Red3CB.setBackgroundResource(R.color.button_no);
                        Red4CB.setBackgroundResource(R.color.button_yes_red);
                        Red5CB.setBackgroundResource(R.color.button_no);
                        Red6CB.setBackgroundResource(R.color.button_no);
                        flgRed1 = true;
                        flgRed2 = true;
                        flgRed3 = true;
                        flgRed4 = false;
                        flgRed5 = true;
                        flgRed6 = true;
                        Red1 = "False";
                        Red2 = "False";
                        Red3 = "False";
                        Red4 = "True";
                        Red5 = "False";
                        Red6 = "False";
                    }else{
                        Red4CB.setBackgroundResource(R.color.button_no);
                        flgRed4 = true;
                        Red4 = "False";
                    }
                }
            });

            Red5CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if(flgRed5) {
                        Red1CB.setBackgroundResource(R.color.button_no);
                        Red2CB.setBackgroundResource(R.color.button_no);
                        Red3CB.setBackgroundResource(R.color.button_no);
                        Red4CB.setBackgroundResource(R.color.button_no);
                        Red5CB.setBackgroundResource(R.color.button_yes_red);
                        Red6CB.setBackgroundResource(R.color.button_no);
                        flgRed1 = true;
                        flgRed2 = true;
                        flgRed3 = true;
                        flgRed4 = true;
                        flgRed5 = false;
                        flgRed6 = true;
                        Red1 = "False";
                        Red2 = "False";
                        Red3 = "False";
                        Red4 = "False";
                        Red5 = "True";
                        Red6 = "False";
                    }else{
                        Red5CB.setBackgroundResource(R.color.button_no);
                        flgRed5 = true;
                        Red5 = "False";
                    }
                }
            });

            Red6CB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Toast.makeText(Data_Collection_Page_1.this, "Left Button Press!", Toast.LENGTH_LONG).show();
                    if(flgRed6) {
                        Red1CB.setBackgroundResource(R.color.button_no);
                        Red2CB.setBackgroundResource(R.color.button_no);
                        Red3CB.setBackgroundResource(R.color.button_no);
                        Red4CB.setBackgroundResource(R.color.button_no);
                        Red5CB.setBackgroundResource(R.color.button_no);
                        Red6CB.setBackgroundResource(R.color.button_yes_red);
                        flgRed1 = true;
                        flgRed2 = true;
                        flgRed3 = true;
                        flgRed4 = true;
                        flgRed5 = true;
                        flgRed6 = false;
                        Red1 = "False";
                        Red2 = "False";
                        Red3 = "False";
                        Red4 = "False";
                        Red5 = "False";
                        Red6 = "True";
                    }else{
                        Red6CB.setBackgroundResource(R.color.button_no);
                        flgRed6 = true;
                        Red6 = "False";
                    }
                }
            });

        }

*/
        //Defines Start button and takes to next page as well as recording data
        Button Start_Collection = (Button) findViewById(R.id.Start_Collection);
        Start_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                if (Initials_txt.getText().toString().isEmpty() || Team_Num_txt.getText().toString().isEmpty() || Match_Num_txt.getText().toString().isEmpty()) {
                    Toast.makeText(Data_Collection_Page_1.this, "Cannot Continue. Please Enter ALL Information!", Toast.LENGTH_LONG).show();
                } else {
                    int Team_Num_Real = Integer.parseInt(Team_Num_txt.getText().toString());
                    int Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());
                    if (Compare_Match_Num > Match_Num_Real) {
                        if (Compare_Team_Num < Team_Num_Real) {
                            Team_Num = Integer.parseInt(Team_Num_txt.getText().toString()); //Sets team num data to txt box information
                            Match_Num = Integer.parseInt(Match_Num_txt.getText().toString()); //Sets match num data to txt box information
                            Initials = Initials_txt.getText().toString();
                            Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                            startActivity(startintent);
                        } else {
                            Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                    }

                    //Defines button needed and actions to cancel a data collection
                    Button Cancel_Collection = (Button) findViewById(R.id.Cancel_Collection_B);
                    Cancel_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
                        @Override
                        public void onClick(View v) {
                            Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                            startActivity(startintent);
                        }
                    });





                    //Defines Start button and takes to next page as well as recording data
                    Button Start_Collection = (Button) findViewById(R.id.Start_Collection);
                    Start_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
                        @Override
                        public void onClick(View v) {
                            if (Team_Num_txt.getText().toString().isEmpty()) {
                                Toast.makeText(Data_Collection_Page_1.this, "Cannot Continue. Please Enter Team Number!", Toast.LENGTH_LONG).show();
                            } else {
                                int Team_Num_Real = Integer.parseInt(Team_Num_txt.getText().toString());
                                if (Compare_Team_Num < Team_Num_Real) {
                                    Team_Num = Integer.parseInt(Team_Num_txt.getText().toString()); //Sets team num data to txt box information

                                    Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                                    startActivity(startintent);
                                } else {
                                    Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                                }
                            }

                        }
                    });
                }
            }
        });}}