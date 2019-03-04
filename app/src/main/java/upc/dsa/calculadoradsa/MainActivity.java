package upc.dsa.calculadoradsa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button cero;
    Button uno;
    Button dos;
    Button tres;
    Button cuatro;
    Button cinco;
    Button seis;
    Button siete;
    Button ocho;
    Button nueve;
    Button suma;
    Button resta;
    Button multiplicacion;
    Button division;
    Button sin;
    Button tan;
    Button cos;
    TextView pantalla;
    Button resultado;
    Button clear;
    private double val1 = -1;
    private double val2 = -1;
    private boolean reoperator = false;
    private int operator;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarBtns();

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "0");
                }else{

                    pantalla.setText("" + "0");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "1");
                }else{

                    pantalla.setText("" + "1");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "2");
                }else{

                    pantalla.setText("" + "2");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "3");
                }else{

                    pantalla.setText("" + "3");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "4");
                }else{

                    pantalla.setText("" + "4");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "5");
                }else{

                    pantalla.setText("" + "5");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "6");
                }else{

                    pantalla.setText("" + "6");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "7");
                }else{

                    pantalla.setText("" + "7");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "8");
                }else{

                    pantalla.setText("" + "8");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(esOperacion(pantalla.getText().toString()) == false) {

                    pantalla.setText(pantalla.getText().toString() + "9");
                }else{
                    pantalla.setText("" + "9");
                    val2 = Double.parseDouble(pantalla.getText().toString());
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText("");
                val1 = -1;
                val2 = -1;

                operator = -1;
            }
        });

        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (pantalla.getText().toString().trim().length() == 0){

                    Toast.makeText(getApplicationContext(),"No hay número en pantalla",Toast.LENGTH_SHORT).show();

                }else{

                    if(val1 == -1){
                        Toast.makeText(getApplicationContext(),"No ha seleccionado una operación",Toast.LENGTH_SHORT).show();

                    }else if(esOperacion(pantalla.getText().toString()) == true){

                        Toast.makeText(getApplicationContext(),"Selecciona un segundo valor",Toast.LENGTH_SHORT).show();


                    }else{
                        val2 = Double.parseDouble(pantalla.getText().toString());
                        pantalla.setText("" + hacerOperacion(operator));
                        val1 = -1;
                        val2 = -1;
                        operator = -1;


                    }

                }

            }
        });

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (pantalla.getText().toString().trim().length() == 0 && val1 == -1){

                    Toast.makeText(getApplicationContext(),"No hay número en pantalla",Toast.LENGTH_SHORT).show();

                }else if(val2 != -1){

                    Toast.makeText(getApplicationContext(),"Debes presionar el boton = antes",Toast.LENGTH_SHORT).show();

                }else{
                    val1 = Double.parseDouble(pantalla.getText().toString());
                    operator = 1;
                    pantalla.setText("+");

                }

            }
        });


    }



    public void inicializarBtns(){

        cero = (Button)findViewById(R.id.ceroBtn);
        uno = (Button)findViewById(R.id.unoBtn);
        dos = (Button)findViewById(R.id.dosBtn);
        tres = (Button)findViewById(R.id.tresBtn);
        cuatro = (Button)findViewById(R.id.cuatroBtn);
        cinco = (Button)findViewById(R.id.cincoBtn);
        seis = (Button)findViewById(R.id.seisBtn);
        siete = (Button)findViewById(R.id.sieteBtn);
        ocho = (Button)findViewById(R.id.ochoBtn);
        nueve = (Button)findViewById(R.id.nueveBtn);
        suma = (Button)findViewById(R.id.sumaBtn);
        resta = (Button)findViewById(R.id.restaBtn);
        multiplicacion = (Button)findViewById(R.id.multiplicacionBtn);
        division = (Button)findViewById(R.id.divisionBtn);
        sin = (Button)findViewById(R.id.sinBtn);
        cos = (Button)findViewById(R.id.cosBtn);
        tan = (Button)findViewById(R.id.tanBtn);
        resultado = (Button)findViewById(R.id.igualBtn);
        pantalla = (TextView)findViewById((R.id.resultadoText));
        clear = (Button)findViewById(R.id.clearBtn);

    }

    public boolean esOperacion(String pantalla){
        boolean res;
        switch(pantalla){
            case "+":
                res = true;
                break;
            case "-":
                res = true;
                break;
            case "/":
                res = true;
                break;
            case "*":
                res = true;
                break;
            default:
                res = false;
        }
        return res;
    }

    public double hacerOperacion(int operacion){
        double ope = 0;
        String res;

        switch(operacion){
            case 1:
                ope = val1 + val2;
                break;
            case 2:
                ope = val1 - val2;
                break;
            case 3:
                ope = val1 * val2;
                break;
            case 4:
                ope = val1 / val2;
                break;
            default:
                ope = -10;
        }



        return ope;


    }
}
