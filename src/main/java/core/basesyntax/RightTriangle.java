package core.basesyntax;

public class RightTriangle extends Figure {
    private float firstLeg = getSomething();

    private float secondLeg = new FigureSupplier().getRandomFigure();

    @Override
    public float getArea() {
        return (float) (firstLeg * secondLeg * 0.5);
    }

    @Override
    public String printInfo() {
        setName("right triangle");
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " rg.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor() + "\n");
        return null;
    }
}
