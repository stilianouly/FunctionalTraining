package com.rea.higherorder

/**
  * Before you start playing with functions
  * you're going to need to know the different ways you can write them!
  *
  * The following are 4 different ways to write the same function in Scala
  *
  *   def addOne(a: Int): Int   =   a + 1
  *   val addOne(a: Int): Int   =   a + 1
  *   def addOne: Int => Int    =   a => a + 1
  *   val addOne: Int => Int    =   a => a + 1
  *
  * Everything to the left of the `=` is the function signature
  *
  * Everything to the right of the `=` is the function
  *
  *     (Don't worry about the difference between `val` and `def` for now)
  *
  *   You would call all functions in the same way:
  *
  *   addOne(2) = 3
  *
  *   All of the above functions do more or less the same thing
  *   They take an Int and they add 1 to that Int
  *
  *
  * The more interesting functions are the ones that use arrow notation
  * They are called Lambda `λ` functions
  *
  * The assumption when working with lambda functions is that because the function
  * signature has no variable names to bind to the inputs, we have to represent them
  * in the lambda
  *
  *   Everything to the left of the arrow are the inputs
  *     |
  *     |   Everything to the right of the arrow is the output
  *     |      |
  *     |      |
  *     a => a + 1
  *
  *   You can even play with MULTIPLE arguments (when you use parenthesis)!!!
  *
  *     (a, b) => *** do something with a and b ***
  *
  *   The letters don't matter!!! (Just as long as they are unique)
  *
  *     (x, y, z) => z / y / x
  *
  * The goal of these exercises is to get you familiar with Lambda functions
  *
  * Good luck!
  */

object LambdaExercises {

  // A boring addTen function takes an Int and adds 10 to it
  def addTen(a: Int): Int = a + 10

  // Write the fancier lambda version!
  // How can you write this without a letter bound to the first argument?
  def addTenL: Int => Int = ???

  // Now write minus 30!
  def minusThirty(x: Int): Int = ???

  // And the fancy lambda version!
  def minusThirtyL: Int => Int = ???

  // Let's play with multiple arguments
  // Write multiply3Things that takes 3 arguments (Hint: use *)
  def multiply3Things(x: Int, y: Int, z: Int): Int = ???

  // lambda
  def multiply3ThingsL: (Int, Int, Int) => Int = ???
}
