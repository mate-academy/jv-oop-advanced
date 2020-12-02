package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;
    private double hypotenuse;

    public RightTriangle(Colour colour, int sideA, int sideB) {
        super(colour);
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
        this.perimeter = sideA + sideB + hypotenuse;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double calculateArea() {
        return 0.5 * sideB * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + calculateArea()
                + " sq.units, side a: " + getSideA() + ", side b: " + getSideB()
                + ", perimeter: " + getPerimeter() + ", hypotenuse: " + hypotenuse
                + ", colour: " + getColour());
    }
}
