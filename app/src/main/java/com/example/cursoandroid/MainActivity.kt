package com.example.cursoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hola Mundo desde Consola")

        //Llamo a funcion
        saldo()
        ingresarSaldo(2000)

        var resp = retirarDinero(2000);
        println("USTES TIENE $resp")

        var pin: Int = 1234
        var intentos: Int = 0

        do {
            println("Intentos  --> $intentos")
            intentos++
        }while (intentos < 3)


        //Array
        var recibos: Array<String> = arrayOf("Armando","Jose","Zabala","Gutierrez")

        println(recibos[0])
        println(recibos[1])



    }


    fun saldo(){
        println("FUNCION SALDO")
    }

    fun ingresarSaldo(saldo: Int){
        println("SE HA INGRESADO $saldo")
    }

    fun retirarDinero(saldo: Int): Int{
        var resultado: Int = saldo - 2000;
        if (resultado > 0)
            return resultado
        else
            return 0
    }
}