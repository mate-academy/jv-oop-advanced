package core.basesyntax;

class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double obtain() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + obtain() + " sq. units, length: " + length
                + " units, width: " + width + " units, color: " + color);
    }
}
