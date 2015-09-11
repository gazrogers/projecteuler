package euler

object Problem1 {
    def solution = {
        val nums=0 until 1000
        nums.filter(x => x % 3 == 0 || x % 5 == 0).sum
    }
}