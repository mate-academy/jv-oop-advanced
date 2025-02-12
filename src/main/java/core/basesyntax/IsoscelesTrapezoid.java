package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Interface {
    private final double smallBase;
    private final double bigBase;
    private final double height;
    private String name = "square";

    IsoscelesTrapezoid(double smallBase, double bigBase, double height, String color) {
        this.smallBase = smallBase;
        this.bigBase = bigBase;
        this.height = height;
        this.color = color;
    }

    public double getArea() {
        return smallBase * bigBase * height / 2;
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, small base: "
                + smallBase + " units, big base: " + bigBase + " units, height: " + height +
                " units, color: " + color);
    }
}
