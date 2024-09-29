package core.basesyntax;

public class Rectangle extends Quadrangle {
    public Rectangle(String color, int width, int height) {
        super(color, width, height);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String draw() {
        return "Figure: rectangle ," + super.draw();
    }
}
