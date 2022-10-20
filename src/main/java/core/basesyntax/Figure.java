package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String color;
    private String name;

    public Figure() {
    }

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String printInfo() {
        return "Figure: "
                + name
                + " area: "
                + getArea()
                + " sq.units"
                + " color: "
                + color;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
