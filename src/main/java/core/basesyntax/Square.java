package core.basesyntax;

public class Square extends Quadrangle {

    public Square(String color, int width, int height) {
        super(color, width, height);
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public void draw() {
        System.out.print("Figure: square,");
        super.draw();
    }
}
