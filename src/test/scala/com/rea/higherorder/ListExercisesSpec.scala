package com.rea.higherorder

import org.specs2.mutable.Specification
import com.rea.recursion.ListExercises._


class ListExercisesSpec extends Specification{

  "ListExercises" should {

    "getTail" in {
      getTail(List(1,2)) === List(2)
    }

    "makeList" in {
      makeList(1, 2) === List(1, 2)
    }

    "isListNil true" in {
      isListNil(Nil) === true
    }

    "isListNil false" in {
      isListNil(List(1)) === false
    }

    "multHead9000 has head" in {
      multHead9000(List(1,2)) === List(9000,2)
    }

    "multHead9000 Nil" in {
      multHead9000(Nil) === Nil
    }
  }
}
