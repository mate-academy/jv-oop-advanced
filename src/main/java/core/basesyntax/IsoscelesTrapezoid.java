package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    {
        setFigureName("IsoscelesTrapezoid");
    }

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * (firstBase * secondBase / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", area: " + String.valueOf(getArea())
                + " sq.units, first base " + String.valueOf(firstBase) + " units, second base: "
                + String.valueOf(secondBase) + " units, height: " + String.valueOf(height)
                + " units, color: " + getColor());
    }
}
