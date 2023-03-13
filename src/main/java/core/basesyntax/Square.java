package core.basesyntax;

public class Square extends Figure {
    private final int firstLeg;
    private double area;
    private String name;

    public Square(int[] legs) {
        firstLeg = legs[0];
        setColor(new ColorSupplier().getRandomColor());
        setName("square");
        setArea(getArea());
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
