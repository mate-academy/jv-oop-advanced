package core.basesyntax;

public class Square extends Figure {
    private double sideLength;
    
    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, sideLength: "
                + getSideLength() + " units, color: " + color);
    }

    @Override
    public Double getArea() {
        return getSideLength() * getSideLength();
    }

    public double getSideLength() {
        return sideLength;
    }
}
