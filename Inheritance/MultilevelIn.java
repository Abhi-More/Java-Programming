
class Shape{
    double base, height, result;
    public void area(double base, double height){
        this.base = base;
        this.height = height;
    }
}

class Triangle extends Shape{
    public void area()
    {
        result = (0.5)*base*height;
    }
}

class Equivalent extends Triangle{
    public void area(){
        super.area();
        System.out.println("Area of triangle: " + result + " cublic meter");
    }
}

public class MultilevelIn {
    public static void main(String[] args) {
        Equivalent Shape1 = new Equivalent();
        Shape1.area(20.0, 10.0);
        Shape1.area();
    }
}