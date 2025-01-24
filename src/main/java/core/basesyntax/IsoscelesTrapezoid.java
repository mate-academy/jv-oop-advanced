package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topBase + bottomBase) * height;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: рівнобедрена трапеція, площа: " + getArea() + " кв. одиниць, верхня основа: " + topBase + " одиниць, нижня основа: " + bottomBase + " одиниць, висота: " + height + " одиниць, колір: " + getColor());
    }
}