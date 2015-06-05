object example {
  println("Welcome to the Scala worksheet")
  
  
  def add(a:Int, b:Int) = a + b
  
  
  add(4, 6)
  
  
  def fib(n:Int):Int = if(n==1 || n==2) 1 else fib(n-1) + fib(n-2)

  
  
}