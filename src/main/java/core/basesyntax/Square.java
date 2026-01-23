package core.basesyntax;

public class Square implements Behavior {
    private String color =  "color";
    private int side;

    public Square(String color,  int side) {
        this.color = color;
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: " + side + " units, color: " + color);
    }
}
