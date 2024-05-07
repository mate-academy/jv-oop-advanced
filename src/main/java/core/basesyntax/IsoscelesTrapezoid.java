package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    double firstBase;
    double secondBase;
    double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height){
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    double getArea() {
        return ((firstBase + secondBase) * height) / 2;
    }
    @Override
    void draw() {
        System.out.println("Isosceles Trapezoid - Color: " + color +
            ", Base 1: " + firstBase + ", Base 2: " + secondBase
            + ", Height: " + height + ", Area: " + getArea());
    }
}
