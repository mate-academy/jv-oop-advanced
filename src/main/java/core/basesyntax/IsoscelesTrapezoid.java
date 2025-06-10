package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase; // Верхнее основание
    private double bottomBase; // Нижнее основание
    private double height; // Высота

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq. units, topBase: " + topBase + " units, bottomBase: "
                + bottomBase + " units, height: " + height + " units, color: " + color);
    }
}
