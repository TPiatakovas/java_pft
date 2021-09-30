package ru.stqa.pft.sandbox;

public class Point {
  public double x;
  public double y;

  public Point (double x, double y){
    this.x=x;
    this.y=y;
  }

  public double distanceMethod(Point p1, Point p2) {

    double distanceX = p1.x - p2.x;
    double distanceY = p1.y - p2.y;
    double sqrDistance = ((distanceX*distanceX)+(distanceY*distanceY));
    return Math.sqrt(sqrDistance);
  }



}
