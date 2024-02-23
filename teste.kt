fun main() {
    val str: String? = null
    // verefificação padrão
    if(str==null){
        println("NULO TEXTO INFORMATIVO")    
    }else{
        println(str)
    }
   println(str ?: "NULO TEXTO INFORMATIVO")
}