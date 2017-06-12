package main.scala


/**
  * Created by stephanie on 12/06/17.
  */
object Hello extends App {
//println ("The World")
//  println (2+2)
//  println("some maths is " + 43*22)
//  val a = Console.readInt()
//  val b = 20
//  println(a)
//  println (a+b)
//
//  if (a>2) {
//    println ("No")
//  }
//
//  else {
//   println ("Yes")
//  }

  println  ("what is your name?")
  val name = Console.readLine()
  println ("Hello " + name)
  println ("what is your age?")
  val age = Console.readInt()
  if (age > 18) {
    println ("Welcome")
  }

  else {
    println ("No access")
  }
}

