object Test1 extends App {
    // question 1 - area of a disk
    def areaOfDisk(r:Int):Double = 3.14 * r * r

    val area = areaOfDisk(5)
    println(s"Area of a disk is: $area")

    // question 2 - temperature conversion into fahrenheit
    def tempConversion(t:Int):Double = t * 1.8 + 32

    val temp = tempConversion(35)
    println(s"Temperature in Fahrenheit: $temp")

    // question 3 - volume of the sphere
    def volumeOfSphere(r:Int):Double = 4/3 * 3.14 * r * r * r

    val volume = volumeOfSphere(5)
    println(s"Value of the sphere is: $volume")

    // question 4 - whole sale cost
    def shippingCost(c:Int):Double = if(c <= 50) 3 * c else 150 + (c - 50) * 0.75
    def coverPrice(c:Int):Double = 24.95 * c

    val totalPrice = shippingCost(60) + coverPrice(60)
    println(s"Total wholesale cost: Rs.$totalPrice")

    // question 5 - total running time
    def totalRunningTime(e:Int, t:Int): Double = e * 8 + t * 7

    val time = totalRunningTime(4, 3)
    println(s"Total running time: $time minutes") 
}