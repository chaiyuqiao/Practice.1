abstract class Shape{
    final double pi=3.1415926;
    protected double a,b;
    abstract public double getArea();
}
    class Circle extends Shape {
        public Circle(double r){ a=r; b=0;
        }
        public double getArea(){
            return pi*a*a; }
    }
    class Rectangle extends Shape {
        public Rectangle(double a,double b){
            this.a=a; this.b=b;
        }
        public double getArea(){
            return a*b;
        }
    }
    class Square extends Shape {
        public Square(double a){
            this.a=a;
        }
        public double getArea(){
            return a*a;
        }
    }


