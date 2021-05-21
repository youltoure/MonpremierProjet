import Personne._
import java.util.Calendar
import java.text.DateFormat
import java.text.SimpleDateFormat
//import java.util.Calendar
import java.util.Date
import scala.collection.immutable._
//import scala.collection.immutable._
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
    println("Bonjour le monde")

    for(k <- z){println(k)}
   // println(somer)


  }
  def macollection(): Unit = {

    val maliste = List("salut","cool","ok","jvc","premier")
    val maliste2 : List[String] = List("salut","cool","ok")
    maliste.foreach(l=>println(l.toUpperCase))

  }
  def collection1(): Unit = {
    val maliste1:Seq[String] = Seq("issouf","yao","Akiss","Ada","robert","roland","mariam")
    val k1 = maliste1.map(l=>{l.length()})
    val k2_filter = maliste1.filter(l=>l.length>3)
    k1.foreach(l1=>println(l1))
    k2_filter.foreach(l2=>println(l2))
  }
  def collection2():Unit={
    val p1 = Personne("TOURE","ISSOUF",10,"IVOIRE",20000)
    val montuple = ("youl",10,p1)
    println(montuple._3.nom)


  }

  def  collection3():Unit={
    val  monMap : Map[String,String] =Map(
      "cc"->"cocody",
      "yy"-> "Poy",
      "Abd"->"Abidjan"
    )
    val montuple1 = monMap.toList
    montuple1.foreach(l=>println(l))
  }
  /**Les tableaux sont les seul elements qui respectent pas
  l'immutabilite. On peut donc utiliser var dans la declaration.
   */
  def collection4():Unit={
    val tab = new Array[Int](10)
    for(i<- 0 to tab.length-1){tab(i) = i*7}
    tab.foreach(l=>{println(l)})
  }
}
