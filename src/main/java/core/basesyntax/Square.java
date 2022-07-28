package core.basesyntax;

public class Square extends Figure {
    int lengthSide;

    public Square(int lengthSide,String color) {
        this.lengthSide = lengthSide;
        super.setColor(color);
        setArea(calculateArea());
    }

    public double calculateArea() {
        return lengthSide * lengthSide;
    }
    @Override
    public void getPrintInfo() {
        System.out.println("Figure: Square, area: " + getArea() + " sq. units,  lengthSide: "+ lengthSide + ", color: " + getColor());
    }
}
