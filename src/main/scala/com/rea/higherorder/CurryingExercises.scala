package com.rea.higherorder

/**
  * Currying refers to the ability of functions to be partially applied
  *
  * This is a boring function:
  *   def add(a: Int, b: Int): Int
  *
  * But this is a little more exciting:
  *   def addCurried(a: Int)(b: Int): Int
  *
  * Function currying can be best described by negative and positive type positions
  *
  *  The only way we can use our add function is to provide its 2 arguments
  *
  *              -          +
  *              |          |
  *   add(a: Int, b: Int): Int
  *           |       |     |
  *           |       |     |
  *           2       2     4
  *
  *
  *                -           +
  *                |           |
  *   addCurried(a: Int)(b: Int): Int
  *                |           |
  *                |           |
  *                |        -         +
  *                |        |         |
  *                2     (b: Int) => Int
  *                         |         |
  *                         |         |
  *                         2         4
  *
  *   Our addCurried function only needs the first argument to be supplied.
  *   Once it is supplied addCurried returns a function from Int => Int.
  *   Once we supply an Int to that function we will be given our final Int.
  *
  * This syntax will look familiar:
  *   add(2,2) = 4
  *
  * But this syntax looks a little goofy
  *   addCurried(2) = Int => Int
  *   addCurried(2)(2) = 4
  *
  */

object CurryingExercises {

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def addCurried(a: Int)(b: Int): Int = {
    a + b
  }

  //This is a function that calls addCurried with a partially applied Int 2
  //we hard code 2 and add x when we call addTwo
  def addTwo(x: Int): Int = {
    addCurried(2)(x)
  }

  //This is a function that calls addCurried with a partially applied Int 2
  //addTwoCurried expects a function from Int => Int
  //addCurried(2) is a function from Int => Int
  def addTwoCurriedL: Int => Int = {
    addCurried(2)
  }

  def subtract(a: Int, b: Int): Int = ???

  def subtractCurried(a: Int)(b: Int): Int = ???

  def subtractThree(x: Int): Int = ???

  def subtractThreeCurriedL: Int => Int = ???

  def addTwoMinusThree(x: Int): Int = ???

  def addTwoMinusThreeCurriedL: Int => Int = ???

  def multiply3Curried(x: Int)(y: Int)(z: Int): Int = ???

  def multiply3CurriedL: Int => Int => Int => Int = ???
}
