package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int thirdLeg;
    private double area;
    private String name;

    public RightTriangle(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[1];
        thirdLeg = legs[2];
        setArea(getArea());
        setColor(new ColorSupplier().getRandomColor());
        setName("rightTriangle");
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
                + " units," + " side: " + thirdLeg + " units," + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg * thirdLeg);
    }
}
