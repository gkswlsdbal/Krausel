package SparkUtil

import org.apache.spark.sql.SparkSession

//SparkSession 사용
trait SparkSessionWrapper {
    lazy val spark: SparkSession = {
      SparkSession
        .builder()
        .master("local")
        .appName("spark app")
        .getOrCreate()
    }
  }
