package ru.stqa.pft.sandbox;

public class Distance {


  public static void main(String[] args) {

    Point p1 = new Point(10, -16);
    Point p2 = new Point(0,6);
    System.out.println("Distance between a point with coordinates x = " + p1.x + ", y = " + p1.y +
            " and a point with coordinates x = " + p2.x + ", y = " + p2.y + " is " + distance(p1, p2));

    System.out.println("Distance between p1 and p2 using method: " + p1.distanceMethod(p1,p2));

  }


  public static double distance(Point p3, Point p4) {
    double distanceX = p3.x - p4.x;
    double distanceY = p3.y - p4.y;
    double sqrDistance = ((distanceX*distanceX)+(distanceY*distanceY));
    return Math.sqrt(sqrDistance);

  }





}