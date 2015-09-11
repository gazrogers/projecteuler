package euler

object Problem6 {
    val nums = 1 to 100 toList
    def square(x : Int) = x*x
    def solution = {
        square(nums.sum) - nums.map(square(_)).sum
    }
}