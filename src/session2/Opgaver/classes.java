//
//
////Problem 1. Write three classes to represent circles, squares, and rectangles.
//// A circle has a radius, a square has a width, and a rectangle has both a
////width and height. Ensure that each class has a constructor that takes these arguments.
//// Add a method to each class to compute its circumference and area
//
//
//abstract class Figure{
//
//    private String name;
//
//    public Figure(String name){
//        this.name = name;
//    }
//
//    public abstract double circumference();
//
//    public abstract double area();
//}
//
//class Circle extends Figure{
//    private double radius;
//
//    public Circle(String name, double radius){
//        super(name);
//        this.radius = radius;
//    }
//
//    @Override
//    public double area(){
//        return radius * radius * 3.14;
//    }
//
//    @Override
//    public double circumference(){
//        return 2 * Math.PI * radius;
//    }
//}
//
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Circle circle = new Circle("My Circle", 5);
//
//        System.out.println("Area: " + circle.area());
//        System.out.println("Circumference: " + circle.circumference());
//    }
//}