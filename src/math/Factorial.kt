package math

/**
 * Created by mrahman on 04/02/18.
 */
object Factorial {

    fun main(args: Array<String>) {
        System.out.println(fact(7))

    }

    internal fun fact(n: Int): Int {
        val x: Int
        if (n == 1) {
            return 1
        } else {
            x = n * fact(n - 1)
            return x
        }
    }
}


/*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */




