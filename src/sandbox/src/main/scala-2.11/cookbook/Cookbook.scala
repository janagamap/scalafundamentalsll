/**
 * @author pjanagama
 */
package cookbook

class Recipe(
    val ingredients: List[String] = List.empty,
    val directions: List[String] = List.empty){
  println("Ingredients: "+ingredients)
  println("Directions: "+ directions)
} 


class Cookbook(val recipes: Map[String, Recipe]) {
  println("Recipes: "+recipes)
  //auxillary constuctor
  def this() = this(Map.empty)
}