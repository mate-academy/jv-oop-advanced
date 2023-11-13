package core.basesyntax;

public class Rectangle extends Quadrangle {
    public Rectangle(String color, int width, int height) {
        super(color, width, height);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public void draw() {
        System.out.print("Figure: rectangle ,");
        super.draw();
    }
}
