package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double VALUE_WITH_FORMULA = 0.5;

    private double sideLength;

    private double heightOfTheTriangle;

    public RightTriangle(String color, double sideLength, double heightOfTheTriangle) {
        super(color);
        this.sideLength = sideLength;
        this.heightOfTheTriangle = heightOfTheTriangle;
    }

    @Override
    public double calculateArea() {
        return VALUE_WITH_FORMULA * sideLength * heightOfTheTriangle;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: right triangle, color: " + super.getColor()
                + ", size of the side: " + sideLength
                + ", size of the height: " + heightOfTheTriangle + ", area: " + calculateArea());
    }
}

