package euler

object Problem5 {
    val factors: List[Int] = 1 to 20 toList
    def modfactors(num: Int, f: List[Int]) = f.map(num % _ == 0).reduce(_ && _)
    def solution = {
        var num: Int = 1
        while(!modfactors(num, factors))
        {
            num += 1
        }
        num
    }
}