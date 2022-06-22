package core.basesyntax;

public class Rectangle {
    private String color;
    private double height;
    private double width;
    private final double area = height * width;
    public Rectangle() {
    }

    public Rectangle(String color, double height, double width) {
       this.color = color;
       this.width = width;
       this.height = height;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + area + " sq.units," +
                " height: " + height + " units," +
                " width: " + width + " units," +
                " color: " + color);
    }
}
