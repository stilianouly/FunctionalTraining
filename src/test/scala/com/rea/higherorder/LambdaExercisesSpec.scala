package com.rea.higherorder

import org.specs2.mutable.Specification
import com.rea.higherorder.LambdaExercises._


class LambdaExercisesSpec extends Specification {

  "LambdaExercises" should {

    "addTenL" in {
      addTenL(1) === 11
    }

    "minusThirty" in {
      minusThirty(60) === 30
    }

    "minusThirtyL" in {
      minusThirtyL(100) === 70
    }

    "multiply3Things" in {
      multiply3Things(2, 4, 6) === 64
    }

    "multiply3ThingsL" in {
      multiply3ThingsL(1, 3, 4) === 12
    }
  }
}
