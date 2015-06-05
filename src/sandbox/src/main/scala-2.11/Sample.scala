import collection.mutable.MutableList

/**
 * @author pjanagama
 */
object Sample {
  
  
 /* def monthName(n:Int): String = 
    if(n==1){
      "January"
    }else if (n==2){
      "February"
    } else {
      "Unknown"
    }
  */
  
 def monthName(n:Int):String = n match {
   case 1 => "January"
   case 2 => "February"
   case _ => "Unknown"  
 } 
 
 
 def daysInMonth(n:Int): Int =  n match {
   case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
   case 4 | 6 | 9 | 11 => 30
   case 2 => 28
  // case _ => -1
 }
 
 
 def whatIsIt(something:Any):String = something match {
   case 1 => "the number one"
   case "hello" => "a greeting"
   case List(_,_,_) => "a list of three values"
   case List(_, _) => "a list of two values"
 }
 
 
 def whatsIt(something:Any):String = something match {
   case n: Int => "the number "+ n
   case s: String => "the string " + s
   case _ => "Something else"
 }

 
 
 def whatsit(something:Any):String = something match{
   case List(a, b, c) => "a list of three elemetns: "+ a +", " + b + ", "+c
   case _ => "Something else"
 }
 
 
 def dumb(n:Int) = n match {
   case 1 => "successs!"
 }
 
 
 /*def parseInt(s: String): Int = try {
   s.toInt
 } catch{
   case e: NumberFormatException => 0
 }*/
 
 def parseInt(s: String): Option[Int] = try{
   Some(s.toInt)
 }catch {
   case e: NumberFormatException => None
 }
 
 for (i: Int <- 1 to 10) println("I'M AWESOME!!!")
 
  val original = List(1,2,3)
  
  val transformed = new MutableList[Int]
 
 for(i:Int <-0 until original.size) transformed += original(i)*2
 
 for(i <- original) transformed += i*2
 
 for (i <- original) yield i*2
  
 for (i <-  List(1,2,3); j <- List(4, 5,6)) yield i*j   //cartesian product
 
 
 for {
   i <- List(1,2,3)
   j <- List(4,5,6)   
 } yield i * j
 
 
 for {
   i <- List(1,2,3)
   j <- List(4,5,6)
   product = i * j
   if product %2 == 0  //gaurd, its not regular if
 } yield product
 
 
 
 
}