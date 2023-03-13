package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private double area;
    private String name;

    public Rectangle(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[1];
        setColor(new ColorSupplier().getRandomColor());
        setName("rectangle");
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
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg
                + " units," + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }
}
