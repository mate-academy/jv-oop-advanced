package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    double firstBase;
    double secondBase;
    double height;
    String color;

    public IsoscelesTrapezoid(double firstBase,double secondBase,double height,String color){
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.color = color;
    }
    @Override
    public double getArea(){
        return ((firstBase * secondBase) / 2) * height;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a square...");
        System.out.println("firstBase: " + firstBase);
        System.out.println("secondBase: " + secondBase);
        System.out.println("height: " + height);
        System.out.println("Area: " + getArea());
    }
    //Formula (a*b)/2 * h


}
