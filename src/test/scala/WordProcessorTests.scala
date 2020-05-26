package test.scala

import org.scalatest.FunSuite
import bsuir.vmsis.lab5.wprocessor.WordProcessor



class WordProcessorTest extends FunSuite{
    test("invertStringWithTailRecursion should return 'ierdna' if 'andrei' is provided"){
      val string = "andrei"
      val invertedString= WordProcessor.invertStringWithTailRecursion(string)
      assert(invertedString.equals("ierdna"))
    }
    
    test("invertString should return 'ierdna' if 'andrei' is provided"){
      val string = "andrei"
      val invertedString= WordProcessor.invertString(string)
      assert(invertedString.equals("ierdna"))
    }
}