public class Circle {   //question 3

    private double radius;
    private String color;

    public Circle(){
        radius = 1.8;
        color = "red";
    }

    public Circle(double d){    //question 4
        radius = d;
        color = "red";
    }

    //question 5
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println(circle.getColor(circle));
        System.out.println(circle.getRadius(circle));
        System.out.println(circle.getArea(circle));
    }

    //question 6
    public double getRadius(Circle circle){
        return circle.radius;
    }

    //question 6
    public double getArea(Circle circle){
        return Math.PI * Math.pow(circle.radius, 2);
    }

    //bonus because I felt like it
    public String getColor(Circle circle){
        return circle.color;
    }

}
