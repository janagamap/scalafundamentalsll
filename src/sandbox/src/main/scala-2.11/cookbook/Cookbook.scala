/**
 * @author pjanagama
 */
package cookbook

class Recipe private( //constructor is private
    val ingredients: List[String] = List.empty,
    val directions: List[String] = List.empty){
  println("Ingredients: "+ingredients)
  println("Directions: "+ directions)
} 

object Recipe {
  def make(ingredients: List[String], directions: List[String]):Recipe = 
    new Recipe(ingredients, directions)
}

/*
class Cookbook(val recipes: Map[String, Recipe]) {
  println("Recipes: "+recipes)
  //auxillary constuctor
  def this() = this(Map.empty)
}*/


object Cookbook{
  val pbj =  Recipe.make(
     List("peanut butter", "jelly", "bread"),
     List("put the peanut butter and jelly on the bread"))
  
  val baconPancakes = Recipe.make(
     List("backon", "pancackes"),
     List("take some bacon and put it in a pancake"))
  
  
  
}