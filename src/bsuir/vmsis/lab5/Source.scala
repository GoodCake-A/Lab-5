
package bsuir.vmsis.lab5

import bsuir.vmsis.lab5.wprocessor.WordProcessor

object Source {
  def main(args: Array[String]){
    println("Enter a string to reverse")
    val input = scala.io.StdIn.readLine()
    println("Tail recursion; reversed string:")
    println(WordProcessor.invertStringWithTailRecursion(input))
    println("Recursion without tail call; reversed string:")
    println(WordProcessor.invertString(input))
  }
}