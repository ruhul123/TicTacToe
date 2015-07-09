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


    public Button a1, a2,a3,b1,b2,b3,c1,c2,c3;
    public EditText enternameO,enternameX;
    public TextView Player_O,Player_X,Player_indicator;
    public Button A;

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


    public void a1(View view) {
        if (a1.getText() == "") {
            if (Player_indicator.getText() == "Player O") {
                a1.setText("O");
                if ((a2.getText() == "O") && (a3.getText() == "O")) {

                    String playerOname = enternameO.getText().toString();
                    Player_indicator.setText(playerOname + "WINS!!!");
                } else if ((b1.getText() == "O") && (c1.getText() == "O")) {
                    String playerOname = enternameO.getText().toString();
                    Player_indicator.setText(playerOname + "WINS!!!");
                } else if ((b2.getText() == "O") && (c3.getText() == "O")) {
                    String playerOname = enternameO.getText().toString();
                    Player_indicator.setText(playerOname + "WINS!!!");
                }


                Player_indicator.setText("Player X");

            }else if (Player_indicator.getText() == "Player X") {
                a1.setText("x");
                if ((a2.getText() == "x") && (a3.getText() == "x")) {

                    String playerXname = enternameX.getText().toString();
                    Player_indicator.setText(playerXname + "WINS!!!");
                }
            }

            Player_indicator.setText("Player O");

        }else{
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();

        }
    }




    public void a2(View view) {
        if (a2.getText() == "") {
            if (Player_indicator.getText() == "Player O") {
                a2.setText("O");
                Player_indicator.setText("Player X");
            }
            else if(Player_indicator.getText() == "Player X"){
                a2.setText("x");
                Player_indicator.setText("Player O");
            }
        }
        else{
            String illegal_move=("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }
    }

    public void a3(View view) {
        if (a3.getText() == "") {
            if (Player_indicator.getText() == "Player O") {
                a3.setText("O");
                Player_indicator.setText("Player X");
            }
            else if(Player_indicator.getText() == "Player X"){
                a3.setText("x");
                Player_indicator.setText("Player O");
            }
        }
        else{
            String illegal_move=("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
    }
    }

    public void b1(View view) {
        if (b1.getText() == "") {
            if (Player_indicator.getText() == "Player O") {
                b1.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                b1.setText("x");
                Player_indicator.setText("Player O");
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }
    }

    public void b2(View view) {
        if (b2.getText() == "") {
            if (Player_indicator.getText() == "Player O") {
                b2.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                b2.setText("x");
                Player_indicator.setText("Player O");
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }
    }


    public void b3(View view) {
        if (b3.getText() == "") {
            if (Player_indicator.getText() == "Player O") {
                b3.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                b3.setText("x");
                Player_indicator.setText("Player O");
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }
    }


    public void c1(View view) {
        if (c1.getText() == "") {
            if (Player_indicator.getText() == "Player O") {
                c1.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                c1.setText("x");
                Player_indicator.setText("Player O");
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }
    }


    public void c2(View view) {
        if (c2.getText() == "") {
            if (Player_indicator.getText() == "Player O") {
                c2.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                c2.setText("x");
                Player_indicator.setText("Player O");
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }
    }


    public void c3(View view) {
        if (c3.getText() == "") {
            if (Player_indicator.getText() == "Player O") {
                c3.setText("O");
                Player_indicator.setText("Player X");
            } else if (Player_indicator.getText() == "Player X") {
                c3.setText("x");
                Player_indicator.setText("Player O");
            }
        } else {
            String illegal_move = ("that is an illegal move!");
            Toast.makeText(this, illegal_move, Toast.LENGTH_SHORT).show();
        }
    }
    }

