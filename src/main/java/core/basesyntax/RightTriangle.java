package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstCathetus;
    private final double secondCathetus;

    public RightTriangle(String color, double firstCathetus, double secondCathetus) {
        super(color);
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
    }

    public double getFirstCathetus() {
        return firstCathetus;
    }

    public double getSecondCathetus() {
        return secondCathetus;
    }

    @Override
    public double getArea() {
        return (firstCathetus * secondCathetus) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("This is " + super.getColor().toLowerCase() + " right triangle "
                + "with legs of " + firstCathetus + ", " + secondCathetus + ", and area of "
                + getArea());
    }
}
