package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: прямокутник, площа: " + getArea()
                + " кв. одиниць, ширина: " + width + " одиниць, висота: "
                + height + " одиниць, колір: " + getColor());
    }
}
