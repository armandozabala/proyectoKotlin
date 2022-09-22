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


        recorrer_array(recibos)

        var matriz = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6),
            intArrayOf(7,8,9)

        )

        //Bucle for Anidados
        for (i in (0 until matriz.size)){
          println()
          for (j in (0 until matriz[i].size))
              print("Posicion[$i][$j]:${matriz[i][j]} ")

            println()
        }

        //Colecciones tipo Set
        var clientesVIP: Set<Int> = setOf(123,456,789,324)
        var datosMezclados = setOf(123,"Armando",789,"Zabala")

        println("Datos Mezclados $datosMezclados")
        println("Datos Mezclados Size ${datosMezclados.size}")


        println("Contiene ${datosMezclados.contains("Armando")}")

        //Version MutableSet
        var clientes: MutableSet<Int> = mutableSetOf(1234,566,765,65,36,5,35,3)

        println("CLientes Mutable $clientes")
        clientes.add(34)
        println("CLientes Mutable ADD $clientes")
        clientes.remove(1234)
        println("CLientes Mutable REMOVE $clientes")
        clientes.clear()
        println("CLientes Mutable CLEAR $clientes")


        //Listas
        var divisas: List<String> = listOf("Euros","Dolares","Pesos")

        println("Divisas: $divisas")

        println("Divisas GET: ${divisas.get(2)}")


        //Listas Mutables
        var divisasDos: MutableList<String> = mutableListOf("amazon","mercadolibre","otros")


        println("Divisas Dos: $divisasDos")
        divisasDos.add("alibaba")
        println("Divisas ADD: $divisasDos")
        println("Esta vacion ${divisasDos.none()}")
        println("Vaciando la Lista")
        divisasDos.clear()
        println("Esta vacion ${divisasDos.none()}")

        //Map
        var mapa: Map<Int, String> = mapOf(
            1 to "Espana",
            2 to "Mexico",
            3 to "Chile",
            4 to "Colombia"
        )

        println("Mapa $mapa")

        var mapaMut = mutableMapOf<String, String>(
            "Armando" to "Zabala"
        )

        //Mapas Mutables
        println("Mapa Mutable")
        println("MM $mapaMut")
        mapaMut.remove("Armando")
        println("MM $mapaMut")
        mapaMut.put("Jose","Gutierrez")

        println("MM $mapaMut")


        var empresa: String? = null
        //var nombre: String = null no se puede



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

    fun recorrer_array(arreglo: Array<String>){
        for ( i in arreglo){
            println(i)
        }

        for (i in arreglo.indices)
            println(arreglo.get(i))

    }


}