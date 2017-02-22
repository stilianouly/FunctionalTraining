package com.rea.recursion

import scala.annotation.tailrec

// Taken from http://tmorris.net/posts/scala-exercises-for-beginners/index.html

/**
 * Ok here are the rules.
 *
 * You can't use any of the standard list functions, like `map`, `filter`, `flatMap`, `append`, `:::`, `:+`, etc.
 * 
 * But you can always use `::` to construct a new list by prepending an element to another list.
 *
 * You CAN and are encouraged to use the solutions from the exercises below to solve the harder
 * ones towards the end.
 *
 * Keep an eye out for repetition and similarities between your answers.
 *
 * REMEMBER: Follow the types, they almost always guide you to the solution.  If it compiles and looks a little
 * too simple, it's probably correct.  As Sherlock Holmes once said, "Each one is suggestive, together they are
 * most certainly conclusive."
 *
 * See if you can make your solution tail recursive, where possible.
 *
 */

object RecursionExercises {

  def plusOne(n: Int) = n + 1

  def minusOne(n: Int) = n - 1

  // Add two non-negative Integers together.  You are only allowed to use plusOne and minusOne above
  @tailrec
  def add(a: Int, b: Int): Int = if (a == 0) b else add(minusOne(a), plusOne(b))

  // You are not permitted to use any list functions such as map, flatMap, ++, flatten etc
  def sum(l: List[Int]): Int = {
    @tailrec
    def sum0(acc: Int, l1: List[Int]): Int = l1 match {
      case Nil => acc
      case (x: Int) :: xs => sum0(add(x, acc), xs)
    }

    sum0(0, l)
  }

  //Again no list functions are permitted for the following
  def length[A](x: List[A]): Int = {
    @tailrec
    def length0(acc: Int, l: List[A]): Int = l match {
      case Nil => acc
      case h :: tail => length0(plusOne(acc), tail)
    }
    length0(0, x)
  }

  // Do you notice anything similar between sum and length? Hmm...

  // Mapping over a list.  You are given a List of type A and a function converting an A to a B
  // and you give back a list of type B.  No list functions allowed!
  def map[A, B](x: List[A], f: A => B): List[B] = x match {
    case Nil => Nil
    case h :: t => f(h) :: map(t, f)
  }

  // Given a function from A => Boolean, return a list with only those item where the function returned true.
  def filter[A](x: List[A], f: A => Boolean): List[A] = x match {
    case Nil => Nil
    case h :: t => {
      val filter1: List[A] = filter(t, f)
      if (f(h))
        h :: filter1
      else
        filter1
    }
  }

  // This pattern should be familiar by now... psst... look at add.
  def append[A](x: List[A], y: List[A]): List[A] = x match {
    case Nil => y
    case h :: t => h :: append(t, y)
  }

  // Flatten a list of lists to a single list.  Remember you can't use list.flatten.  Can you use a previous
  // solution to solve this one?
  def flatten[A](x: List[List[A]]): List[A] = {
    @tailrec
    def flatten0(acc: List[A], l: List[List[A]]): List[A] = l match {
      case Nil => acc
      case h :: t => flatten0(append(acc, h), t)
    }

    flatten0(Nil, x)
  }

  // Follow the types.  You've done a great job getting here. Follow the types.
  def flatMap[A, B](x: List[A], f: A => List[B]): List[B] = flatten(map(x, f))

  // Maximum of the empty list is 0
  def maximum(x: List[Int]): Int = {
    @tailrec
    def max(currentMax: Int, a: List[Int]): Int = a match {
      case Nil => currentMax
      case h :: t => if (h > currentMax) max(h, t) else max(currentMax, t)
    }

    max(0,x)
  }


  // Reverse a list
  def reverse[A](x: List[A]): List[A] = {
    @tailrec
    def rev(acc:List[A], l:List[A]):List[A] =l match {
      case Nil => acc
      case h :: t => rev(h :: acc, t)
    }

    rev(Nil, x)
  }
}
