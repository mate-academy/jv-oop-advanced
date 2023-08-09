package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstMainPart;
    private int secondMainPart;

    public IsoscelesTrapezoid(String color, int height, int firstMainPart, int secondMainPart) {
        super(color);
        this.firstMainPart = firstMainPart;
        this.secondMainPart = secondMainPart;
        this.height = height;
    }

    @Override
    public int getArea() {
        return ((firstMainPart + secondMainPart) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, upper base: " + firstMainPart
                + " units, lower base: " + secondMainPart
                + " units, height: " + height + " units, color: " + color);
    }
}
