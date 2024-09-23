package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public RightTriangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: прямокутний трикутник, площа: " + getArea()
               + " кв. одиниць, перший катет: " + base + " одиниць, другий катет: "
                + height + " одиниць, колір: " + getColor());
    }
}
