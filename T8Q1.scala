object T8Q1 {

  case class Point( x:Int, y:Int){
    def add(point:Point):Point={
      return new Point(this.x+point.x, this.y+point.y)
    }

    def move(dx:Int, dy:Int):Point={
      return this.copy(x=x+dx, y=y+dy)
    }

    def distance(point:Point):Double={
      val distance:Double = scala.math.sqrt(scala.math.pow((this.x-point.x),2) + scala.math.pow((this.y-point.y),2)).toDouble
      return distance
    }

    def invert():Point={
      return this.copy(x=this.y, y=this.x)
    }
  }

  def main(args: Array[String])={
    var p1 = new Point(2,7)
    var p2 = new Point(10,2)
    var p3 = p1.add(p2)
    var p4 = p1.move(2,3)
    var p5 = p1.distance(p2)
    var p6 = p2.invert()

    println("Point P1 = ", p1)
    println("Point P2 = ", p2)
    println("Addition of points P1 and P2 = ", p3)
    println("Point after moving P1 by (dx,dy) distance = " ,p4)
    println("Distance between P1 and P2 = ", p5)
    println("Switch coordinates of P2 = ",p6)
  }

}
