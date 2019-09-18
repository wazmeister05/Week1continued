//for Week 1.8
public class Circle {   //question 3

    private double radius;
    private String color;

    private Circle(){
        radius = 1.8;
        color = "red";
    }

    private Circle(double d){    //question 4
        radius = d;
        color = "red";
    }

    //question 5
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println(circle.getColor(circle));    //red
        System.out.println(circle.getRadius(circle));   //1.8
        System.out.println(circle.getArea(circle));     //10.17....

        Circle circleOverload = new Circle(22);
        System.out.println(circleOverload.getColor(circleOverload));    //red
        System.out.println(circleOverload.getRadius(circleOverload));   //22
        System.out.println(circleOverload.getArea(circleOverload));     //1520.53...
    }

    //question 6
    private double getRadius(Circle circle){
        return circle.radius;
    }

    //question 6
    private double getArea(Circle circle){
        return Math.PI * Math.pow(circle.radius, 2);
    }

    //bonus because I felt like it
    private String getColor(Circle circle){
        return circle.color;
    }

}
