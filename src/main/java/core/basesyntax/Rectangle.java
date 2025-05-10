package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        super.setColor(color);
    }

    @Override
    public void drawArea() {
        System.out.println(length * width);
    }
}
