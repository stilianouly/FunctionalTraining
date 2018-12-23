package com.rea.recursion

/**
  *
  * A list is a data structure
  *
  * Lists are used to store other data structures
  *
  * Lists can also store nothing at all and can be `Nil` lists (empty list)
  *
  * All lists must end with a Nil (empty list) so that the data structure can end
  *
  * There are two base constructors for a List `::` and `Nil`
  *
  *   Nil                     // will make the list `List()`  //empty list
  *   1 :: (Nil)              // will make the list `List(1)`
  *   1 :: (2 :: (Nil))       // will make the list `List(1,2)`
  *   1 :: (2 :: (3 :: (Nil)) // will make the list `List(1,2,3)`
  *   ...
  *
  *   `::` pronounced `cons` is a constructor that takes 2 arguments and returns a List
  *   `Nil` returns an empty List
  *
  *   a value on the left (The `head` of the list)
  *   |
  *   |      a List on the right (The `tail` of the list)
  *   |      |
  *   10 :: Nil
  *
  * You could have a list of Int `List[Int]`
  *   List(1,2,3)   //The numbers 1, 2 & 3 are in this list
  *
  * Or a list of String `List[String]`
  *   List("I", "am", "happy")    //The strings I am happy are in the list
  *
  * Deconstructed our lists look like:
  *
  *     (1, _ )
  *         |
  *         |
  *        (2, _ )
  *            |
  *            |
  *           (3, _ )
  *               |
  *               |
  *               Nil
  *
  */

object ListExercises {

  //This function will return the head of the list
  def getHead(list: List[Int]): Int = {
    list.head
  }

  //Can you guess how to return the tail of a list?
  def getTail(list: List[Int]): List[Int] = ???

  //Given the examples above can you construct a list with cons? (hint a should be first, b second)
  def makeList(a: Int, b: Int): List[Int] = ???

  //Can you use pattern matching to identify whether a list is Nil or not?
  def isListNil(list: List[Int]): Boolean = ???

  //Can you use pattern matching to multiply the head of a list by 9000???
  //If there isn't a head you should return Nil
  def multHead9000(list: List[Int]): List[Int] = ???
}
