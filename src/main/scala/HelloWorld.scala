import Personne._
import java.util.Calendar
import java.text.DateFormat
import java.text.SimpleDateFormat
//import java.util.Calendar
import java.util.Date
import scala.collection.immutable._
import scala.collection.immutable._
object HelloWorld {
  val variable2 : String= ""
  def calculsome(a:Int,b:Int):Int={
    val result = a+b
    return  result
  }
  /*def renvooie(nom:String,prenom:String,nationalite:String,date:String):Personne= {

  }*/
  def main(args: Array[String]): Unit = {
    //utilisation des variables

    val  text : String = ""
    println("Hello world, mon premier programme en scala")
    val youl = Personne("toure","Issouf",24,"Ivoirienne",2000000.0)
    val age_personne = youl.age
    println("L'age de la personne est de : "+age_personne)
    val somer = calculsome(14,23)
   /* val nouv =  Calendar.getInstance()
    print(nouv)*/
    import java.text.DateFormat
    import java.text.SimpleDateFormat
    import java.util.Calendar
    val format = new SimpleDateFormat("dd/MM/yyyy")
    // recuperation de la date du jour
    val calendar = Calendar.getInstance()
    // conversion en type date
    val jj = calendar.getTime

    //Conversion d'une chaine en date
    val nombre = "12/06/1996"
    val annee = format.parse(nombre)
    //Difference de date en milli seconde
    val diff = jj.getTime() - annee.getTime()
    // calcul en jour
    val  rest =  (diff/(1000*60*60*24))
    // affichage resultat
    print("Vous avez "+rest/365+ " ans")
    //Manipulation des boucles et des tableaux
    var z = new Array[Int](6)
    for(i<-0 to 5){z(i)=i}
    for(j<- 0  to  (z.length-1)){println(z(j))}
    for(k <- z){println(k)}
   // println(somer)


  }
}
