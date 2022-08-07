import SparkUtil.SparkSessionWrapper

object Main extends SparkSessionWrapper {
  def main(args: Array[String]): Unit = {
    import spark.implicits._

    val textFile = spark.read.textFile("/home/hanjin/git/Krausel/DataSet/words.txt")
    val text =spark.read.csv("/home/hanjin/git/Krausel/DataSet/bigeastncaabasketball.csv")
    val wordCounts = textFile.flatMap(line => line.split(" "))
      .groupByKey(identity)
      .count()

    text.show()
  }
}