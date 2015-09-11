package euler

object Problem2 {
    val fibs: Stream[Int] = 0 #:: fibs.scanLeft(1)(_ + _)
    def solution = {
        fibs.view.takeWhile(_ < 4000000).filter(_%2==0).sum
    }
}