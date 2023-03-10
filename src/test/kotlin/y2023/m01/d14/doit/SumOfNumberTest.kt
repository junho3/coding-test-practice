package y2023.m01.d14.doit

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf

class SumOfNumberTest : DescribeSpec({

    lateinit var sumOfNumber: SumOfNumber

    beforeSpec {
        sumOfNumber = SumOfNumber()
    }

    describe("sumOfNumber 메소드는") {
        val input = "123456"
        context("String 형식의 숫자 문자열 ${input}이 주어졌을 때") {
            it("숫자의 합을 구하여 Int형으로 리턴한다.") {
                val result = sumOfNumber.sumOfNumber(input)

                result.shouldBeInstanceOf<Int>()
                result shouldBe 21
            }
        }
    }
})
