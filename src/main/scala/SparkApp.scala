// Importer tous les module de spark et du sql
import org.apache.spark.sql._
import org.apache.spark._
object SparkApp {
  def main(args: Array[String]): Unit = {
    sessionSpark()
  }
  //Definition d'une session, on travail tjrs avec une session dans spark
    def sessionSpark() :Unit= {
      // ou remplacer winutils par hadoop.home.dir
      System.setProperty("winutils","C:\\Hadoop")
      val ss = SparkSession.builder()
        //Nom du noeud maitre pa defaut local[*]
        .master(master = "local[*]")
        // le nom de la session dans le cluster
        .appName(name = "Ma premiere application")
        /*Pour supporter les requete hive
       .enableHiveSupport()
        */
        // Creer le session
        .getOrCreate()
      //Creation d'un RDD
      val rdd1 = ss.sparkContext.parallelize(Seq("Ma premiere application Spark. Je suis une etudiant de l'INP HB heureux"))
      //Manipualtion du rdd avec foreach.
      rdd1.foreach(l=>println(l))
    //Ouvertur en lectuire
      val df_1 = ss.read
        .format(source = "csv")
        .option("inferShema","true")
        .option("header","true")
        .option("delimiter",";")
        .csv(path = "C:\\Users\\HP\\Desktop\\Installable\\Spark\\orders_csv.csv")
      df_1.show(numRows = 18)
      df_1.printSchema()

      df_1.createTempView(viewName = "orders") // Creer une bd virtuelle dans la base de spark
      ss.sql(sqlText = "SELECT * FROM orders WHERE city='NEWTON'").show()
      ss.sql(sqlText = "SELECT * FROM orders WHERE city='NEWTON'").explain() // voir le shema de la requete
    }
}
