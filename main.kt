import modelo.Camara
import modelo.Motor
import modelo.Movie
import modelo.Shoe

/********ESTO ES UN ERROR PUES HACER QUE NUESTRA FUNCIÓN SE PURA***********/
var malaPractica : Int = 4
/**********ES MALA PRACTICA DE PROGRAMACIÓN***********/
val n: Int = 3 /*Variable que debe ser local ejecución*/
const val primeraVariableNombre: String = "NAME" /*Variable constante en las N funciones que puedan existir y que
mantienen la funcion principal pura pues son inmutables*/
//Funciones puras
//Nada debe alterar a la función}

fun main (args: Array<String>) {
    println("hola mundo")
    println(1 + 1)
    println(3 - 1)
    println(2 * 2)
    println(4 / 2)
    println(7 % 3)

    val a = 4 /*Variable locales*/
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    /*****TIPOS DE VARIABLES*****/
    /*PALABRAS RESERVADAS
    * VAL -> NO SE PUEDE CAMBIAR
    * VAR  -> SE PUEDE CAMBIAR
    * CONST (ESTÁ DENTRO DE LAS "VAL") EL VALOR SE DETERMINA EN TIEMPO DE COMPILACIÓN
    * EL VALOR QUE TOMA "VAL" SE DA CUANDO EL PROGRAMA SE ESTÁ EJECUTANDO
    * LA LINEA DE CÓDIGO CORRCTA ES LA SEGUNDA PUES EL VALOR SE DETERMINA EN TIEMPO DE EJECUCIÓN */
    println(n)

    /*VAL ES MAS USADO A NIVEL LOCAL*/
    val name: String = args[0] //Se puede reasignar en tiempo de ejecución
    println(name)

    /*CONST SIEMPRE DEBE SER GLOBAL*/
    println(primeraVariableNombre)

    /**********STRINGS - CADENAS**********/

    val nombre: String = "Elon"
    val Apellido: String = "Musk"
    val edad: Int = 49
    val apodo: String = "Franzua"
    val nombreApellidos: String = "Francisco Motta $Apellido \n tengo: $edad años y me llaman: \"$apodo\" "
    println("Mi nombre es: $nombreApellidos")
    /*
    * \n da un salto de linea
    * \t separa el texto
    * \" poner comillas */
    println("Mi nombre es: $nombre $Apellido")

    /*******RAW STRING******/

    val parrafo: String = """
        ** applications and the like is intended through suggestion only
        and may be superseded by updates. It is your responsibility to
        ** ensure that your application meets with your specifications.
        ** No representation or warranty is given and no liability is
        assumed by Microchip Technology Incorporated with respect
        to the accuracy or use of such information, or infringement of
        patents or other intellectual property rights arising from such
        use or otherwise. Use of Microchip’s products as critical
        components in life support systems is not authorized except
        with express written approval by Microchip. No licenses are
        conveyed, implicitly or otherwise, under any intellectual
        property rights.
    """.trimIndent() /*Es funcion respeta el texto como se introduce*/
    println(parrafo.trimMargin("** ")) /*La función del trimMargin("basura") eliminará todo lo que tenga esa dentro de "comillas"*/
    /*La basura son patrones que se repiten en el texto*/

    /*******RANGOS*******/
    /*PERMITE IMPRIMIR UNA SECUENCIA DE CARACTERES*/

    val oneToHundred: IntRange = 1..100

    for (miVariableDeRecorrido: Int in oneToHundred) {
        println(miVariableDeRecorrido)
    }
    val letrasImprimir: CharRange = 'A'..'J'

    for (miSegudaVariableDeRecorrido: Char in letrasImprimir) {
        println(miSegudaVariableDeRecorrido)
    }

    println("\n")

    for (cincoPrimerLetras: Char in 'A'..'E') {
        println(cincoPrimerLetras)
    }
    /****Sentencia IF****/

    val condicional: Int = 2
    if (condicional.equals(2)) {
        println("Si son iguales: $condicional")
    } else {
        println("No son iguales")
    }
    /**when**/
    /*Evalua un dato*/

    val segundaCondicional: Int = 3

    when (segundaCondicional) {
        in 1..2 -> println("Si está en el rango de 1 y 2")
        in 3..5 -> println("No está en el rango de 3 y 5")
        else -> println("El numero es mas que 5")
    }

    //While se usa para contadores

    var variableWhile: Int = 1 /*Usar dentro de la metodo principal no afecta a la pureza del código*/

    while (variableWhile < 1) {
        println("Mensaje :$variableWhile")
        if (variableWhile.equals(5)) {
            println("Mitad del bucle")
        }
        variableWhile++
    }
    /**DO-WHILE**/
    /**lA DIFERENCIA ENTRE EL DO-WHILE Y EL WHILE ES EL ORDEN
     * DE EJECUCIÓN DE LAS ACCIONES**/

    do {
        println("Mensaje DO-WHILE: $variableWhile")
        variableWhile++
    } while (variableWhile < 1)

    var variableLimiteSuperior: Int = 0
    var variableRecorridoWhile: Int = 0

    /*****El operador ? define una variable como posible nula
     * para evitar los NULL POINTER EXCEPTION (NPE) y que nuestro código sea
     * vulnerable****/
    var compute: String? //Definimos como posible nulo
    compute = null
    /*El operador double bang (!!) ayuda a forzar el lanzamiento de
    * la excepción por NPE*/
    // var computeLongitud: Int = compute!!.length

    /*Bloque de try - catch*/

    /*try {
        var marcaPc: String?
        marcaPc = null
        var caracteresMarca = marcaPc!!.length
    } catch(e: NullPointerException) {
        println("Ingresa un valor, no nulos")
    }*/

    /*Llamada segura*/

    var llamadaSegura: String? = null
    var longLlamada: Int? = llamadaSegura?.length /*Esto se usa para que la variable
    tenga el valor del número de caracteres de la cadena que se vaya a introducir
    en la variable llamadaSegura*/
    println("long: $longLlamada")

    /*Operador Elvis*/

    var teclado: String? = null
    var longTeclado: Int? = teclado?.length ?: 0 /*El operador ELVIS sirve para
    devolver un valor cuando nuestro dato introducido sea null evitando el NULL POINTER EXCEPTION*/
    println("longitud del dato: $longTeclado")

    val listWithNulls: List<Int?> = listOf<Int?>(1, null, null, 4) /*Creamos una lista
    con valores nulos e instanciamos que la lista pueda tomar valores nulos*/
    println("Lista con nulos: $listWithNulls") /*Imprimimos la lista que contiene valores nulos*/

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull() /*Creamos una variable que
    tomará como datos el filtrado de los datos que no sean nulos de la variable anterior*/
    println("Lista sin nulos: $listWithoutNulls") /*Imprimimos la lista filtrada*/

    //ARREGLOS

    val countries: Array<String> = arrayOf("Peru", "Mexico", "Argentina")

    val days: Array<String> = arrayOf<String>("Lunes", "Martes", "Miercoles")
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

    for (num in numbers) {
        println(num)
    }

    //Promedio de los numeros dados

    val numerosPromedio: IntArray = intArrayOf(1, 5, 3, 6, 23, 54)
    var suma: Int = 0
    for (num: Int in numerosPromedio) {
        suma = suma + num
    }
    val promedio = suma / numbers.size

    println("promedio es: $promedio")

    var array1: IntArray = intArrayOf(4, 5, 6, 7, 8)
    var intPrimitive: IntArray = array1

    val suma1: Int = array1.sum()

    println(suma1)
    /* var interadorDatos: Int = 0
    val arrayDatos: ArrayList<Int> = arrayListOf<Int>()

    while (interadorDatos < 10){
        arrayDatos[interadorDatos] = interadorDatos
        interadorDatos++
    }
    for (recorrer1 in arrayDatos){
        println(recorrer1)
    }
    arrayDatos.reverse()

    for (recorrer2 in arrayDatos){
        println(recorrer2)
    }*/

    /*${EXPRESIÓN}*/
    var x = 5
    println("x es igual a 5? : ${
    x == 5
    }")

    var mensaje: String = "El valor de x es: $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")

    /*******FUNCIONES********/
    println("Raiz cuadrada de 4 es: ${Math.sqrt(4.0)}")

    println("El promedio de los numeros es: ${
    averageNumbers(array1, 4)
    }")
    println("${evaluate()}")

    val valorAleatorio1 = Math.random()
    val valorAleatoio2 = { Math.random() }
    println("El primer valor es: ${valorAleatorio1}")
    println("El segunfo valor es: ${valorAleatoio2}")

    /*********EXPRESIONES**********/
    //${evaluate()}" Tendran ese formato

    //LAMBDAS

    val saludo: () -> Unit = { println("HOLA MUNDO") }
    //Saludo es el nombre de la funcion lambda
    saludo()

    // var sumador = {instrucciones -> sentencias}
    val plus: (Int, Int, Int) -> Int = { a: Int, b: Int, c: Int -> a + b + c }
    val resultadoPlus = plus(3, 4, 5)
    println(resultadoPlus)
    println(plus(1, 4, 7))
    println({ primerNumero: Int, segundoNumero: Int, tercerNumero: Int -> primerNumero + segundoNumero + tercerNumero }(4, 5, 6))

    val calculateNumber = { numero: Int ->
        when (numero) {
            in 1..3 -> println("Tu numero está entre 1 y 3")
            in 4..7 -> println("Tu numero está entre 4 y 7")
            in 8..10 -> println("Tu numero está entre 8 y 10")
            else -> println("Tu numero está fuera de los rangos")
        }
    }
    println(calculateNumber(3))

    /***CLASES***/

    val camera = Camara()
    camera.trunOn()
    println("La camara está: ${camera.trunOn()}")

    //camera.isOn = false Error en programación pues puede modificar la clase de manera externa

    /**MODIFICADORES DE ACCESO**/
    /**
     * PUBLIC -> ACCESO A TODAS LAS PEERSONAS
     * PRIVATE -> ACCESO DENTRO DE LA CLASE
     * PROTECTED -> ACCESO DENTRO DE LA CLASE QUE SE HEREDEN
     * INTERNAL -> ACCESO ENTRE MÓDULOS
     *
     * ENCAPSULAMIENTO -> ESCONDER EL ACCESO DE LA VARIABLE
     * UNO DE LOS PILARES DEL PROGRAMACIÓN ORIENTADA A OBJETOS
     **/
    camera.turnOff()
    println(camera.getCameraStatus())

    val motorCarro = Motor()
    motorCarro.rotacionAntihoraria()
    println(motorCarro.checkMotorRotation())

    /**GETTERS Y SETERS**/
    //Se tienen que añadir métodos

    camera.setResolution(1080)
    println("La resolucion de la camara es: ${camera.getResolution()}")
    camera.setCameraFlash(true)
    println("El flash está activado: ${camera.getCameraFlash()}")
    camera.setCameraZoom("X10")
    println("El zoom de la cámara es: ${camera.getCamerazoom()}")

    /**GET Y SET PROPIOS DEL KOTLIN**/

    var shoe = Shoe()
    shoe.size = 23
    println(shoe.size)
    shoe.model = "Tenis"
    println(shoe.model)

    val movie = Movie("Coco", "Pixar", duration = 120)
    println(movie.creator)
}

/*****Unit se usa para no devolver nada***/
fun tokens (tokc: IntArray):Unit{
}
fun averageNumbers(numeros: IntArray, n: Int): Int{
    var suma = 0
    for (num in numeros){
        suma += num
    }
    return (suma / numeros.size ) + n
}
/***Funciones con parámetros por defecto***/
fun evaluate(character: Char = '=', number: Int = 2): String{
    return "${number} es ${character}"
}