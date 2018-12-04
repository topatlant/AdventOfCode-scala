package y2018

import scala.io.Source

object day01 extends App {

  //val test_input = "+1, +1, +1"
  //val test_input="+1, +1, -2"
  //val test_input="-1, -2, -3"
  //val test_input2 = "()())"

  //println(part1(test_input))
  println("Part 1: " + part1(get_input()))
//  println("Part 2: " + part2(get_input()))

  def get_input() = Source.fromFile("inputs/2018_01.txt").getLines()

  def part1(puzzle: Iterator[String]) = puzzle.map(_.toInt).sum

  def part2(puzzle: String): Int = {
    throw new  NotImplementedError()
  }

}