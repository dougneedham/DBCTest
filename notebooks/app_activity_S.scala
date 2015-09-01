// Databricks notebook source exported at Tue, 1 Sep 2015 16:15:04 UTC
import org.apache.spark.sql.SQLContext

val sqlContext = new SQLContext(sc)
val df = sqlContext.load("com.databricks.spark.csv", Map("path" -> "/mnt/cengage/processed/MindTap/mt_nb_APP_ACTIVITY_20150708072522.gz", "header" -> "true"))

// COMMAND ----------

import org.apache.spark.sql.SQLContext

val sqlContext = new SQLContext(sc)
val df = sqlContext.read.format("com.databricks.spark.csv").option("header","true").load("/mnt/cengage/processed/MindTap/mt_nb_APP_ACTIVITY_20150708072522.gz")



// COMMAND ----------

df.select("*").show()

// COMMAND ----------

