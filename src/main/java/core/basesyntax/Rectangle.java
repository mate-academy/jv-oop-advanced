package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ----Figure: rectangle----")
                .append("\n area: " + calculateArea() + " sq. units")
                .append("\n length: " + length + " units")
                .append("\n width: " + width + " units")
                .append("\n color: " + getColor());
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
