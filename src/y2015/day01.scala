package y2015

import scala.io.Source

object day01 extends App {

  //val test_input = "(()(()("
  //val test_input2 = "()())"

  println("Part 1: " + part1(get_input()))
  println("Part 2: " + part2(get_input()))

  def get_input() = Source.fromFile("inputs/2015_01.txt").mkString

  def part1(puzzle: String) = puzzle.count(_ == '(') - puzzle.count(_ == ')')

  def part2(puzzle: String): Int = {
    var floor = 0
    var index = 1
    for (c <- puzzle) {
      if (c == '(')
        floor += 1
      else
        floor -= 1

      if (floor < 0)
        return index

      index += 1
    }

    throw new Exception("No floor found")
  }

}