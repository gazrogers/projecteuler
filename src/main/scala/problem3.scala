package euler

object Problem3 {
    lazy val primes: Stream[Int] = 2 #:: Stream.from(3).filter(i => primes.takeWhile(k => k * k <= i).forall(k => i % k > 0))
    def solution = {
        primes.view.takeWhile(_ < Math.sqrt(600851475143L)).filter(x => 600851475143L % x == 0)
    }
}