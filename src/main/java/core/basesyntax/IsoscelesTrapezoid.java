package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float height = getSomething();

    private float side = new FigureSupplier().getRandomFigure();

    private float secondside = new FigureSupplier().getRandomFigure();

    @Override
    public float getArea() {
        return (side + secondside) / 2 * height;
    }

    @Override
    public String printInfo() {
        setName("isosceles trapezoid");
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " tr.units, first side: " + side
                + " units, second side: " + secondside
                + "units, height: " + height
                + " units, color: " + getColor());
        return null;
    }
}
