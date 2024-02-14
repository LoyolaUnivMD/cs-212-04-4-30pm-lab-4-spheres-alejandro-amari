
/** Programmers:  [your names here]
* Course:  CS 212
* Due Date:
* Lab Assignment:
* Problem Statement:
* Data In:
* Data Out:
* Credits: [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person
*/

import java.lang.*;

public class Sphere {
    private double xValue;
    private double yValue;
    private double zValue;
    private double radius;

    public Sphere(){
        this.xValue = 0;
        this.yValue = 0;
        this.zValue = 0;
        this.radius = 0;
    }

    public Sphere(double xValue, double yValue, double zValue, double radius){
        this.xValue = xValue;
        this.yValue = yValue;
        this.zValue = zValue;
        this.radius = radius;
    }

    public double getArea(){
        return (double) 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume(){
        return (double) 4 /3 * Math.PI * Math.pow(radius, 3);
    }


}