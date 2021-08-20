package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstIsoscelesTrapezoid;
    private int secondIsoscelesTrapezoid;

    public IsoscelesTrapezoid(String color, int height, int firstIsoscelesTrapezoid,
                              int secondIsoscelesTrapezoid) {
        super(color);
        this.height = height;
        this.firstIsoscelesTrapezoid = firstIsoscelesTrapezoid;
        this.secondIsoscelesTrapezoid = secondIsoscelesTrapezoid;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFirstIsoscelesTrapezoid() {
        return firstIsoscelesTrapezoid;
    }

    public void setFirstIsoscelesTrapezoid(int firstIsoscelesTrapezoid) {
        this.firstIsoscelesTrapezoid = firstIsoscelesTrapezoid;
    }

    public int getSecondIsoscelesTrapezoid() {
        return secondIsoscelesTrapezoid;
    }

    public void setSecondIsoscelesTrapezoid(int secondIsoscelesTrapezoid) {
        this.secondIsoscelesTrapezoid = secondIsoscelesTrapezoid;
    }

    @Override
    public double getArea() {
        return (double) (firstIsoscelesTrapezoid + secondIsoscelesTrapezoid) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, height: " + height + " units, firstIsoscelesTrapezoid: "
                + firstIsoscelesTrapezoid + " units, secondIsoscelesTrapezoid: "
                + secondIsoscelesTrapezoid + " units, color: " + getColor();
    }
}
