package ru.nsamartsev.scala

import org.apache.flink.streaming.api.datastream.DataStreamSource
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment

object Simple extends App {

  val env = StreamExecutionEnvironment.getExecutionEnvironment

  val data: DataStreamSource[String] = env.fromElements(
    "Hello,",
    "Flink!")

  data.print()

  env.execute()

}
