

object Series {
    fun slices(slice: Int, str: String): List<List<Int>> {
        require(str != "")
        require(str.length >= slice)
        return str.windowed(slice) { it.map { x -> x.toString().toInt() } }
    }
}