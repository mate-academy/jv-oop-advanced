package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int firstSide;
    private final int secondSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        name = "trapezoid";
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public void getArea() {
        area = (firstSide * secondSide) * (double) height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + area + " sq. units, " + "firstSide: "
                + firstSide + " units, " + "secondSide: " + secondSide + " units, " + "height: "
                + height + " units, " + "color: " + color);
    }
}
