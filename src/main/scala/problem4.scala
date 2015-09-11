package euler

object Problem4 {
    val nums = 100 until 1000
    val products = for {x <- nums; y <- nums} yield (x*y)
    def isPalindrome(n: Int) = n.toString.reverse == n.toString
    def solution = {
        products.view.filter(isPalindrome(_)).max
    }
}