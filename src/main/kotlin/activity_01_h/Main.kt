package activity_01_h

fun main() {
    println("Enter a Number: ")
    var firstInput: Int = Integer.valueOf(readLine())
    println("Enter a Number: ")
    var secondInput: Int = Integer.valueOf(readLine())

    var larger: Int
    var smaller: Int

    if (firstInput > secondInput){
        smaller = secondInput
        larger = firstInput
    }else {
        smaller = firstInput
        larger = secondInput
    }

            while (smaller < larger) {
                if (primeNumber(smaller))
                    print(smaller.toString() + " ")
                ++smaller
            }
        }

        fun primeNumber(num: Int): Boolean {
            var flag = true
            for (i in 2..num / 2) {
                if (num % i == 0) {
                    flag = false
                    break
                }
            }
            return flag
        }
