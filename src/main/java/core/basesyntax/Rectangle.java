package core.basesyntax;

public class Rectangle extends Figure implements Drawnable {
    private int width;
    private int height;

    public Rectangle(String color, int i, int i1) {
        super(color);
        this.width = i;
        this.height = i1;
    }

    @Override
    public void toDraw() {
        System.out.println("Rectangle: " + "\n width: " + width + " height: "
                + height + "\n area " + getArea());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
