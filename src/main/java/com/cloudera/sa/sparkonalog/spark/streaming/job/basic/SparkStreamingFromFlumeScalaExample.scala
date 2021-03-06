package com.cloudera.sa.sparkonalog.spark.streaming.job.basic

import org.apache.spark.streaming.Milliseconds
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.flume.FlumeUtils
import org.apache.spark.storage.StorageLevel
import org.apache.spark.SparkContext
import org.apache.spark.scheduler.SplitInfo
import scala.collection.Map


object SparkStreamingFromFlumeScalaExample {
  def main(args: Array[String]) {
    if (args.length == 0) {
      System.err.println(
        "Usage: FlumeEventCount <master> <host> <port>")
      System.exit(1);
    }

    val Array(master, host, portStr) = args

    val port = portStr.toInt
    
    val batchInterval = Milliseconds(2000)
    
    /*
    var sc = new SparkContext("local", "Simple App", master, List("./SparkOnALog.jar"), null, null)
    
    // Create the context and set the batch size
    val ssc = new StreamingContext(sc, batchInterval)

    // Create a flume stream
    //val stream = ssc.flumeStream(host, port, StorageLevel.MEMORY_ONLY)
    
    val stream = FlumeUtils.createStream(ssc, host, port, StorageLevel.MEMORY_ONLY);

    // Print out the count of events received from this server in each batch
    stream.count().print()

    ssc.start()
    * */
    
  }
}