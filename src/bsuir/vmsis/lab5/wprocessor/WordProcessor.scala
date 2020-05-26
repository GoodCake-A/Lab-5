package bsuir.vmsis.lab5.wprocessor

import scala.annotation.tailrec

object WordProcessor {
    def invertString(string: String): String = {
      var mutableString= new StringBuilder(string)
      def recursion(index: Int): StringBuilder ={
        if(mutableString.size>index)
          recursion(index+1)+=mutableString.charAt(index)
        else
          new StringBuilder(mutableString.size)
      }
      recursion(0).toString()
    }
    
    def invertStringWithTailRecursion(string: String): String = {
      var mutableString= new StringBuilder(string)
      @tailrec
      def tailRecursion(beginIndex: Int, endIndex: Int){
        if(endIndex-beginIndex>1){
          val charBuffer=mutableString.charAt(beginIndex)
          mutableString.setCharAt(beginIndex, mutableString.charAt(endIndex))
          mutableString.setCharAt(endIndex, charBuffer)
          tailRecursion(beginIndex+1, endIndex-1)
        }
      }
      tailRecursion(0, mutableString.size-1)
      mutableString.toString()
    }
}