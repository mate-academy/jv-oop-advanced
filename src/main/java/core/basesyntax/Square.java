package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(Color color, double sideLength) {
        setColor(color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    
    @Override
    public double getArea() {
        return getSideLength() * getSideLength();
    }

    @Override
    public String toString() {
        return "Figure: square, area = " + getArea()
                + ", sideLength = " + getSideLength()
                + ", color = " + getColor();
    }
}
