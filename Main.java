/** Programmers:  Alejandro & AJ
* Course:  CS 212
* Due Date: 2/18/2024
* Lab Assignment: 4
* Problem Statement: Create a new class named Sphere and use it to create sphere objects and to detect sphere collisions
* Data In:
* Data Out:
* Credits: [Is your code based on an example in the book, in class, or something else?
*            Reminder: you should never take code from the Internet or another person]
*/

import java.util.Scanner;

//sun at 0.0, 0.0, 0.0 with a radius of 43.26
//earth at 26.0, 42.0, 79.0 with a radius of 0.395
//planetX at 25.3, 43.1, 77.8 with a radius of 1.4
class Main {

    public static double getDouble(String prompt) {
        Scanner input = new Scanner(System.in);

        double d = 0.0;
        System.out.println(prompt);
        String dStr = input.nextLine();
        boolean inputRejected = true;

        while(inputRejected) {
            try {
                d = Double.parseDouble(dStr);
                inputRejected = false;
            } catch (Exception InvalidInput) {
                System.out.println(prompt);
                dStr = input.nextLine();
            }
        }

        return d;
    }

    public static void main(String[] args) {
       System.out.println("Music of the Spheres");

       Sphere sun = new Sphere(0,0,0,43.26);
       Sphere earth = new Sphere(26,2,79,0.395);
       Sphere planetX = new Sphere(25.3,43.1,77.8,1.4);

       System.out.println("The Sun's area is " + sun.getArea() + " and it's volume is " + sun.getVolume());
       System.out.println("The Earth's area is " + earth.getArea() + " and it's volume is " + earth.getVolume());
       System.out.println("Planet X's area is " + planetX.getArea() + " and it's volume is " + planetX.getVolume());

       if(earth.intersectsWith(sun)){
           System.out.println("Earth is crashing into the sun.");
       }
       if(sun.intersectsWith(planetX)){
            System.out.println("The sun is crashing into planet X.");
        }
        if(planetX.intersectsWith(earth)){
            System.out.println("Planet X is crashing into the Earth.");
        }

        System.out.println("\nUser's position:");
        double x = Main.getDouble("What is the x coordinate? ");
        double y = Main.getDouble("What is the y coordinate? ");
        double z = Main.getDouble("What is the z coordinate? ");

        Sphere userObject = new Sphere(x, y, z, 0);

        if (userObject.distanceTo(sun) <= userObject.distanceTo(earth) && userObject.distanceTo(sun) <= userObject.distanceTo(planetX)) {System.out.println("The sun is the closest planet.");} // The sun is not a planet but that is besides the point.
        else if (userObject.distanceTo(earth) <= userObject.distanceTo(sun) && userObject.distanceTo(earth) <= userObject.distanceTo(planetX)) {System.out.println("The Earth is the closest planet.");}
        else {System.out.println("Planet X is the closest planet.");}
    }
}
