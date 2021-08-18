package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBaseLength;
    private int secondBaseLength;
    private int height;

    public IsoscelesTrapezoid(int firstBaseLength, int secondBaseLength, int height, String color) {
        this.firstBaseLength = firstBaseLength;
        this.secondBaseLength = secondBaseLength;
        this.height = height;
        super.setFigureColor(color);
    }

    public void setFirstBaseLength(int firstBaseLength) {
        this.firstBaseLength = firstBaseLength;
    }

    public void setSecondBaseLength(int secondBaseLength) {
        this.secondBaseLength = secondBaseLength;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFirstBaseLength() {
        return firstBaseLength;
    }

    public int getSecondBaseLength() {
        return secondBaseLength;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return ((firstBaseLength + secondBaseLength) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid"
                + ", area: " + getArea() + " sq.units"
                + ", first base length: " + firstBaseLength
                + ", second base length: " + secondBaseLength
                + ", height: " + height
                + ", color: " + super.getFigureColor());
    }
}
