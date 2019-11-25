package io.turntabl.scalagettingstarted

object MyApp extends App {
    print("Hello, World!")

   val name: String = "Christiana"
    val town: String = "Accra"
    print( s"$name was born in $town")

    def threeTimes(i:String)=i*3
    threeTimes("hello")

    def even(i:Int)=i%2==0

    def isWeekendDay(i:String)=i=="Saturday" | i=="Sunday"

    def areWeekendDays(i:String*)=isWeekendDay("Saturday") | isWeekendDay("Sunday")


}
