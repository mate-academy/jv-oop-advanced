package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String name = "isoscelesTrapezoid";
    private int firstLeg;
    private int secondLeg;
    private int fourthLeg;
    private double area;

    public IsoscelesTrapezoid(int firstLeg, int secondLeg, int fourthLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.fourthLeg = fourthLeg;
        setColor(color);
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
