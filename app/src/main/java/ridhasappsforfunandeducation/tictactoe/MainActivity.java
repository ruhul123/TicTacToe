package ridhasappsforfunandeducation.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    public Button a1, a2, a3, b1, b2, b3, c1, c2, c3;
    public EditText enternameO, enternameX;
    public TextView Player_O, Player_X, Player_indicator;
    public Button reset;
    public String playerSymbol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1 = (Button) findViewById(R.id.a1);
        a2 = (Button) findViewById(R.id.a2);
        a3 = (Button) findViewById(R.id.a3);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        c1 = (Button) findViewById(R.id.c1);
        c2 = (Button) findViewById(R.id.c2);
        c3 = (Button) findViewById(R.id.c3);
        enternameO = (EditText) findViewById(R.id.enternameO);
        enternameX = (EditText) findViewById(R.id.enternameX);
        Player_O = (TextView) findViewById(R.id.Player_O);
        Player_X = (TextView) findViewById(R.id.Player_X);
        Player_indicator = (TextView) findViewById(R.id.Player_indicator);
        reset = (Button) findViewById(R.id.reset);
        Player_indicator.setText("Player O");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean col1(String plI) {

        if ((a1.getText() == plI) && (b1.getText() == plI) && (c1.getText() == plI)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean col2(String plI) {

        if ((a2.getText() == plI) && (b2.getText() == plI) && (c2.getText() == plI)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean col3(String plI) {

        if ((a3.getText() == plI) && (b3.getText() == plI) && (c3.getText() == plI)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean row1(String plI) {

        if ((a1.getText() == plI) && (a2.getText() == plI) && (a3.getText() == plI)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean row2(String plI) {

        if ((b1.getText() == plI) && (b2.getText() == plI) && (b3.getText() == plI)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean row3(String plI) {

        if ((c1.getText() == plI) && (c2.getText() == plI) && (c3.getText() == plI)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean dialeftright(String plI) {

        if ((a1.getText() == plI) && (b2.getText() == plI) && (c3.getText() == plI)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean diarightleft(String plI) {

        if ((a3.getText() == plI) && (b2.getText() == plI) && (c1.getText() == plI)) {
            return true;
        } else {
            return false;
        }
    }

    public void getWinString(String plI) {
        String playername;

        if (plI=="O"){
            playername = enternameO.getText().toString();
        }else {
            playername = enternameX.getText().toString();
        }
        Player_indicator.setText(playername + " WINS!!!");
    }




    public void btnCommon(Button b){

    }

    public void a1(View view) {
        String aa1 = a1.getText().toString();


        if (aa1 == "") {
            if (Player_indicator.getText() == "Player O") {
                a1.setText("O");
                Player_indicator.setText("Player X");

            } else if (Player_indicator.getText() == "Player X") {
                a1.setText("x");
                Player_indicator.setText("Player O");

            }
            aa1 = a1.getText().toString();
            if ((row1(aa1)) || (col1(aa1) == true) || (dialeftright(aa1) == true)) {
                getWinString(aa1);

            }

        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();

        }


    }


    public void a2(View view) {
        String aa2 = a2.getText().toString();
        if (aa2 == "") {
            if (Player_indicator.getText() == "Player O") {
                a2.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                a2.setText("x");
                Player_indicator.setText("Player O");

            }
            aa2 = a2.getText().toString();
            if ((row1(aa2) == true) || (col2(aa2) == true)) {
                getWinString(aa2);
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }
    }

    public void a3(View view) {
        String aa3 = a3.getText().toString();
        if (aa3 == "") {
            if (Player_indicator.getText() == "Player O") {
                a3.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                a3.setText("x");
                Player_indicator.setText("Player O");

            }
            aa3 = a3.getText().toString();

            //MRC -if ((row1(aa3) == true) || (col3(aa3) == true) && (diarightleft(aa3) == true)) {

            if ((row1(aa3) == true) || (col3(aa3) == true) || (diarightleft(aa3) == true)) {
                //getWinString(aa3);
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }

    }

    public void b1(View view) {
        String bb1 = b1.getText().toString();
        if (bb1 == "") {
            if (Player_indicator.getText() == "Player O") {
                b1.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                b1.setText("x");
                Player_indicator.setText("Player O");

            }
            bb1 = b1.getText().toString();
            if ((row2(bb1) == true) || (col1(bb1) == true)) {
                //getWinString(bb1);
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }

    }

    public void b2(View view) {
        String bb2 = b2.getText().toString();
        if (bb2 == "") {
            if (Player_indicator.getText() == "Player O") {
                b2.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                b2.setText("x");
                Player_indicator.setText("Player O");

            }
            bb2 = b2.getText().toString();
            if ((row2(bb2) == true) || (col2(bb2) == true)) {
                getWinString(bb2);
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }

    }


    public void b3(View view) {
        String bb3 = b3.getText().toString();
        if (bb3 == "") {
            if (Player_indicator.getText() == "Player O") {
                b3.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                b3.setText("x");
                Player_indicator.setText("Player O");

            }
            bb3 = b3.getText().toString();
            if ((row2(bb3) == true) || (col3(bb3) == true)) {
                getWinString(bb3);
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }

    }


    public void c1(View view) {
        String cc1 = c1.getText().toString();
        if (cc1 == "") {
            if (Player_indicator.getText() == "Player O") {
                c1.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                c1.setText("x");
                Player_indicator.setText("Player O");

            }
            cc1 = c1.getText().toString();
            //MRC - if ((row3(cc1) == true) || (col1(cc1) == true) || (dialeftright(cc1) == true))
            if ((row3(cc1) == true) || (col1(cc1) == true) || (diarightleft(cc1) == true)) {
                getWinString(cc1);
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }

    }


    public void c2(View view) {
        String cc2 = c2.getText().toString();
        if (cc2 == "") {
            if (Player_indicator.getText() == "Player O") {
                c2.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                c2.setText("x");
                Player_indicator.setText("Player O");

            }
            cc2 = c2.getText().toString();
            if ((row3(cc2) == true) || (col2(cc2) == true)) {
                getWinString(cc2);
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }

    }


    public void c3(View view) {
        String cc3 = c3.getText().toString();
        if (cc3 == "") {
            if (Player_indicator.getText() == "Player O") {
                c3.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                c3.setText("x");
                Player_indicator.setText("Player O");

            }
            cc3 = c3.getText().toString();
            if ((row3(cc3) == true) || (col3(cc3) == true) || (dialeftright(cc3) == true)) {
                getWinString(cc3);
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }

    }

    public void reset(View view) {
        a1.setText("");
        a2.setText("");
        a3.setText("");
        b1.setText("");
        b2.setText("");
        b3.setText("");
        c1.setText("");
        c2.setText("");
        c3.setText("");
        Player_indicator.setText("Player O");

    }
}








