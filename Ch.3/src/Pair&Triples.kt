fun main(args: Array<String>) {
    val coordinator: Pair<Int, Int> = Pair(2,3)
    val coordinatesWithTo = 2 to 3
    val coordinatorMix = Pair(2.1,3)
    val x1 = coordinator.first
    val y1 = coordinator.second
    println("X = ${x1} , y = ${y1}")
    val coordinator3D = Triple(2,3,1)
    val (x3,y3,z3) = coordinator3D
}