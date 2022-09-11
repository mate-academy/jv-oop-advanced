package core.basesyntax;

public class Rectangle extends Figure {
    private float side = getSomething();

    private float secondSide = new FigureSupplier().getRandomFigure();

    @Override
    public float getArea() {
        return side * secondSide;
    }

    @Override
    public String printInfo() {
        setName("rectangle");
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " rc.units, "
                + "first side: " + side
                + ", second side: " + secondSide
                + " units, color: " + getColor() + "\n");
        return null;
    }
}
