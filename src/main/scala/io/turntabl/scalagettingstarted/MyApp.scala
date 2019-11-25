package io.turntabl.scalagettingstarted

object MyApp extends App {
    print("Hello, World!")

   val name: String = "Christiana"
    val town: String = "Accra"
    print( s"$name was born in $town")

    def threeTimes(i:String)=i*3
    threeTimes("hello")

  def even(i:Int)= if (i%2==0)  true else false

  def even2(i:Int)=i%2==0

  def odd2(i:Int) = !even(i)
  def odd(i:Int) = if (!even(i)) true else false

  def wordsToLower(words: String*)=
    words map(_.toLowerCase)

  def isWeekendDay(i:String)= i match{
      case "saturday"|"sunday"=> true
      case _ => false
    }

    def areWeekendDays(i:String*)= i map(isWeekendDay)
  print(areWeekendDays("friday"))

  def randomMethod(a:String, b:Int)=a*b

  val result=areWeekendDays("monday","tuesday","wednesday","thursday", "friday")
  result.foreach(println)


}
