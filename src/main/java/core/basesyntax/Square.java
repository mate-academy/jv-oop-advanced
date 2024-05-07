package core.basesyntax;

public class Square extends Figure {
    double sideLength;

    public Square(String color, double SideLength){
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    double getArea() {
        return sideLength * sideLength;
    }
    @Override
    void draw() {
        System.out.println("Square color: " + color +
            ", Side length = " + sideLength +
            "Area = " + getArea());
    }
}
