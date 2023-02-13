package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        String stringBuilder = "Figure: " + "rectangle, area: "
                + calculateArea() + " sq.units, width: " + width
                + " height: " + height
                + " color: " + color;
        System.out.println(stringBuilder);
    }
}
