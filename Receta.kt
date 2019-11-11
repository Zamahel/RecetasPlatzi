fun main(args: Array<String>) {

    var recetas:MutableList<String> = mutableListOf<String>()
    var ingredientesLista:MutableList<String> = mutableListOf("Aguacate","Leche","Carne","Verduras","Frutas","Cereal"
        ,"Huevos","Aceite", "chorizo", "longaniza", "tortillas de maiz", "Masapan")

    exit@ while (true) {

        val mensajeInicial = """
        :: Bienvenido a Recipe Maker::
        
        Seleccione la opcion deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()

        println(mensajeInicial)


        try {
            val response = readLine()?.toInt()?:0
            if (response==4){
                println("Por favor elija una opcion")
                continue@exit
            }

            if (response==1){
                println("Ingresa el nombre de tu receta")
                val nombre_receta:String?= readLine()?.toString()?:"Mi Receta"
                println("Selecciona los ingredientes:")
                for ((index,ingredient) in ingredientesLista.withIndex()){
                    println("${index+1}.-${ingredient}")
                }
                println("\n 0.-Guardar receta\n -1.-Salir ")
                var receta_nueva:String = nombre_receta + ": "
                val desarrolloReseta: String = """
                    Aqui escribe el desarrollo de tu receta
                """.trimIndent()
                println(desarrolloReseta.trimIndent())

            }

            if (response==2) {
                println("aqui podras ver tus recetas")
                println("Estos son los ingredientes disponibles: $ingredientesLista \nTu receta se llama: $recetas  ")
                continue@exit
            }

            if (response==3){
                break@exit
            }



        } catch (e: NumberFormatException) {
            println("Ingresa un valor del 1 al tres")
        }
    }
}