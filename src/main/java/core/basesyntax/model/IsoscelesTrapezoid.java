package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        String name = getClass().getSimpleName();
        double area = getArea();
        String color = getColor();

        System.out.println("Figure: " + name + ", area: " + area + " eq. units, color: " + color);
    }
}
