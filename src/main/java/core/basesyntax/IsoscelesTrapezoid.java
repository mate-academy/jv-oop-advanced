package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBaseLength;
    private int secondBaseLength;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBaseLength, int secondBaseLength, int height) {
        super(color);
        this.firstBaseLength = firstBaseLength;
        this.secondBaseLength = secondBaseLength;
        this.height = height;
    }

    public int getFirstBaseLength() {
        return firstBaseLength;
    }

    public void setFirstBaseLength(int firstBaseLength) {
        this.firstBaseLength = firstBaseLength;
    }

    public int getSecondBaseLength() {
        return secondBaseLength;
    }

    public void setSecondBaseLength(int secondBaseLength) {
        this.secondBaseLength = secondBaseLength;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (firstBaseLength + secondBaseLength) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, firstBaseLength: " + getFirstBaseLength()
                + " units, secondBaseLength: " + getSecondBaseLength()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
