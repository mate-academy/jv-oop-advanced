package core.basesyntax;

public class Square {
    private double side;
    private String color;
    private final double area = side*side;
    public Square() {
    }

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + area + " sq. units," +
                " side: " + side + " units," +
                " color: " + color);
    }
}
