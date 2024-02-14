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

//sun at 0.0, 0.0, 0.0 with a radius of 43.26
//earth at 26.0, 42.0, 79.0 with a radius of 0.395
//planetX at 25.3, 43.1, 77.8 with a radius of 1.4
class Main {
    public static void main(String[] args) {
       System.out.println("Music of the Spheres");

       Sphere sun = new Sphere(0,0,0,43.26);
       Sphere earth = new Sphere(26,2,79,0.395);
       Sphere planetX = new Sphere(25.3,43.1,77.8,1.4);

       System.out.println("The Sun's area is" + sun.getArea() + "and it's volume is" + sun.getVolume());
       System.out.println("The Earth's area is" + earth.getArea() + "and it's volume is" + earth.getVolume());
       System.out.println("Planet X's area is" + planetX.getArea() + "and it's volume is" + planetX.getVolume());

    } //
}
