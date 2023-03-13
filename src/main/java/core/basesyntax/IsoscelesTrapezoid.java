package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int thirdLeg;
    private int fourthLeg;
    private double area;
    private String name;

    public IsoscelesTrapezoid(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[1];
        fourthLeg = legs[2];
        setColor(new ColorSupplier().getRandomColor());
        setName("isoscelesTrapezoid");
        setArea(getArea());
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(firstLeg, 2)
                - Math.pow((secondLeg - fourthLeg) / 2.0, 2));
        return ((fourthLeg + secondLeg) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, side: "
                + firstLeg + " units," + " side: " + secondLeg + " units,"
                + " side: " + fourthLeg + " units, " + "color: " + getColor());

    }
}
