import java.util.Scanner;

class circle {
    double radius;

    circle() { // This is deafult constructor built in the initialization time

    }

    circle(double new_Radius) // This is user defined constructor
    {
        radius = new_Radius;
    }

    void input(double r) {
        radius = r;
    }

    double area() {
        double area = 2 * Math.PI * (Math.pow(radius, 2));
        return area;
    }

    void display() {
        System.out.print(radius + " was the radius of the circle and the area is: " + area()); // print the value of
                                                                                               // area
    }

    boolean ChkRad(circle c2) {
        if (radius == c2.radius)
            return true;
        else
            return false;
    }

    boolean ChkArea(circle c2) {
        if (area() == c2.area())
            return true;
        else
            return false;
    }

}

public class Circle_Check_By_Naim {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        circle c;
        c = new circle(); // this statement initializes an object of the class
        /*
         * Here, c is an object of circle class. After the statement, a circle()
         * constructor
         * will be autometically created in circe class
         */

        double r = inp.nextDouble();
        c.input(r); // passing a value of radius to the input method og circle class
        /*
         * Passing the value of radius can also be done by using the circle(double
         * new_Radius) constructor.
         * Then, the statement should be look like:
         */
        c = new circle(r); /*
                            * If we use this statement, the value given in the parameter
                            * of circle() will autometically assing
                            * the value of radius in circle class. Then, the statement c = new circle();
                            * and c.input(r);
                            * will not be necessary
                            */

        c.display(); // This will display the calculated area.
        /* We can also have the area by the statemnt: */
        System.out.println(c.area());

        ///////////////////////////////////////////// ARRAY OF
        ///////////////////////////////////////////// OBJECT/////////////////////////////////////////////////////////////
        circle[] c1 = new circle[100];
        for (int i = 0; i < c1.length; i++) {
            c1[i] = new circle(); // this statement initializes an object of the class in every iteration
            double r1 = inp.nextDouble();
            c1[i].input(r1);
            c1[i].display();
            System.out.println(c1[i].area());// This will display the calculated area
        }

        check_radius(c1[5], c1[9]); /*
                                     * check_radius method is to determine the radius of
                                     * c1[5] and c1[9] object are same or not.
                                     * It is written in main method. We can also do the same by below statement
                                     */

        c1[5].ChkRad(c1[9]); /*
                              * Here, c1[5] is the caller object and c1[9] is the callee object
                              * When the statement will be executed, the radius of c1[9] object will be
                              * compared with
                              * the radius of c1[5] inside the c1[5] object.
                              */

        check_area(c1[0], c1[10]); /*
                                    * check_area method is to determine the area of c1[0] and c1[10] object are
                                    * same or not.
                                    * It is written in main method. We can also do the same by below statement
                                    */

        c1[0].ChkArea(c1[10]); /*
                                * Here, c1[0] is the caller object and c1[10] is the callee object
                                * When the statement will be executed, the area of c1[10] object will be
                                * compared with the
                                * radius of c1[5] will be compared inside the c1[5] object.
                                */

        inp.close();
    }

    public static boolean check_area(circle c1, circle c2) {
        if (c1.area() == c2.area())
            return true;
        else
            return false;
    }

    public static boolean check_radius(circle c1, circle c2) {
        if (c1.radius == c2.radius)
            return true;
        else
            return false;
    }
}
