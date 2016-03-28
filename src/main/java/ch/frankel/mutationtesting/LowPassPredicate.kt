package ch.frankel.mutationtesting

class LowPassPredicate(private val limit: Int) {

    fun filter(i: Int) = i < limit
}
