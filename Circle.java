import java.util.Scanner;

//for Week 1.15
public class Circle {

    private double radius;
    private String color;

    private Circle(double d, String colour){
        radius = d;
        color = colour;
    }


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please specify colour code: ");
        /*
        Question 2 specifies that the setColour() method takes an argument of double,
        an instruction that I followed.
        If I were making this myself however, I'd not pass the variable in - I'd ask
        for it inside the method.
         */
        double colourCode = scanner.nextDouble();
        String colour = setColour(colourCode);
        Circle circle = new Circle(setRadius(), colour);

        //question 5
        System.out.println(circle.getColor(circle));
        System.out.println(circle.getRadius(circle));
        System.out.println(circle.getArea(circle));

    }


    private double getRadius(Circle circle){
        return circle.radius;
    }

    private double getArea(Circle circle){
        return Math.PI * Math.pow(circle.radius, 2);
    }

    private String getColor(Circle circle){
        return circle.color;
    }

    //question 1
    private static double setRadius(){
        System.out.print("What is the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        double userSpec = scanner.nextDouble();
        return userSpec;
    }

    /*
    //question 2
    private String setColour(double colorCode){
        if (colorCode < 10){
            return "red";
        } else if (colorCode >= 10 && colorCode < 50){
            return "amber";
        } else if (colorCode >= 50){
            return "green";
        } else return null;
    }
    */


    //question 3
    private static String setColour(double colorCode) {

            if (colorCode >= 0 && colorCode <= 5) {
                return "red";
            } else if (colorCode >= 6 && colorCode <= 10) {
                return "amber";
            } else if (colorCode >= 11 && colorCode <= 15){
                return "black";
            } else if (colorCode >= 16 && colorCode <= 20) {
                return "blue";
            } else if (colorCode >= 21 && colorCode <= 25){
                return "beige";
            } else if (colorCode > 25){
                return "maroon";
            } else return null;
        }

}
