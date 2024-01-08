package core.basesyntax;

import java.text.DecimalFormat;

public class Square implements Figure, Draw {
    private int side;
    private String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: square, " + "side: " + side + ", area: "
                + getArea() + ", color: " + color);
    }
}
