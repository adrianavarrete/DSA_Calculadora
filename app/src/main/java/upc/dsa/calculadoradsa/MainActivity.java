package upc.dsa.calculadoradsa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarBtns();

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "0");
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "1");
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "2");
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "3");
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "4");
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "5");
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "6");
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "7");
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "8");
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText().toString() + "9");
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

    }
}
