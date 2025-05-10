package core.basesyntax;

public class Square extends Figure {
    private static final String name = "square";
    private final int firstLeg;
    private double area;

    public Square(int firstLeg, String color) {
        this.firstLeg = firstLeg;
        setColor(color);
    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return firstLeg * firstLeg;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, side: " + firstLeg + " units," + " color: " + getColor());
    }
}
