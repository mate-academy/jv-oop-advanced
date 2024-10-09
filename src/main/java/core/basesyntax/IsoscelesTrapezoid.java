package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lengthOne;
    private int lengthTwo;
    private int height;

    public IsoscelesTrapezoid(String color, int lengthOne, int lengthTwo, int height) {
        super(color);
        this.lengthOne = lengthOne;
        this.lengthTwo = lengthTwo;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, "
                + "lengthOne: " + lengthOne + "units, " + "lengthTwo: " + lengthTwo + "units, "
                + "height: " + height + "units, "
                + "color:" + getColor());
    }

    @Override
    public double getArea() {
        return (lengthOne + lengthTwo) * height / 2;
    }
}
