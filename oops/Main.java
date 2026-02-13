import  .JCF.List;   
// class Car {



//     String color;
//     int price;
//     String brand;
//     Car(){}
//     Car(String _color, int _price, String _brand) {
//         this.color = _color;
//         this.price = _price;
//         this.brand = _brand;
//     }
//     Object[] gettter(){
//         return new Object[]{this.color, this.price, this.brand};
//     }

//     void start() {
//         System.out.println("Car is starting...");
//     }

//     void stop() {
//         System.out.println("Car is stopping...");
//     }
// }
class Shape{
    void area(){
        System.out.println("Area of shape");
    }
 
}
class Circle extends Shape{
    void area(){
        System.out.println("Area of circle");
    }
    void perimeter(){
        System.out.println("Perimeter of shape");
    }
}
class Rectangle extends Shape{
    void area(){
        System.out.println("Area of rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        // System.out.println("hi, I am Chirag!");
        // Car car1 = new Car("Red", 50000, "Toyota");
        // Car car2 = new Car("Blue", 60000, "Honda"); 
        // car1.start();
        // car2.start();
        // Object[] car1Details = car1.gettter();
        // System.out.println(car1Details[0] + " " + car1Details[1] + " " + car1Details[2]);
        // Car car3 =  new  Car();
        // System.out.println(car3.price);
        // System.out.println(car1);

        Shape shape1 = new Shape();
        System.out.println(shape1);
        shape1.area();
        // shape1.perimeter();
        Circle circle1 = new Circle();
        System.out.println(circle1);

        circle1.area();
        circle1.perimeter();
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);


        rectangle1.area();
        // rectangle1.perimeter();
        Shape shape2 = new Circle();
        System.out.println(shape2);
        shape2.area();
        // shape2.perimeter();
        // Shape shape3 = new Rectangle();
        // System.out.println(shape3);
        // shape3.area();
        List list1 = new List();
        list1.main(null);
    }

}
