package com.rea.higherorder

import org.specs2.mutable.Specification
import com.rea.higherorder.CurryingExercises._

class CurryingExercisesSpec extends Specification {

  "CurryingExercises" should {

    "subtract" in {
      subtract(3, 3) === 0
    }

    "subtractCurried" in {
      subtractCurried(12)(6) === 6
    }

    "subtractThree" in {
      subtractThree(2) === -1
    }

    "subtractThreeCurriedL" in {
      subtractThreeCurriedL(5) === 2
    }

    "addTwoMinusThree" in {
      addTwoMinusThree(10) === 9
    }

    "addTwoMinusThreeCurriedL" in {
      addTwoMinusThreeCurriedL(12) === 11
    }

    "multiply3Curried" in {
      multiply3Curried(1)(2)(3) === 6
    }

    "multiply3CurriedL" in {
      multiply3CurriedL(1)(2)(4) === 8
    }
  }
}
