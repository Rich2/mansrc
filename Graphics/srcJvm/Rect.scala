/* This is a comment. */

trait Level extends Any
{
	def lev = 5
}

class Rect(val array: Array[Double]) extends AnyVal with Level
{
	def greet = "Welcome"
}

object Rect
{
	def apply(): Rect = new Rect(Array(4.0, 2.0))
}