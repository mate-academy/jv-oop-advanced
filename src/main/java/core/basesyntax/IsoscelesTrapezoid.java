package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements IAreaCalculator {
    private double highBase;
    private double lowBase;
    private double height;

    public IsoscelesTrapezoid(String name, String color, double highBase, double lowBase, double height) {
        super(name, color);
        this.highBase = highBase;
        this.lowBase = lowBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (highBase + lowBase) * height / 2;
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                            + "area: " + getArea() + " sq.units, "
                            + "highBase: " + highBase + " units, "
                            + "lowBase: " + lowBase + " units, "
                            + "height: " + height + " units, "
                            + "color: " + getColor() + ".");
    }
}
