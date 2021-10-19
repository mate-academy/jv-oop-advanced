package core.basesyntax;

public class Square {
    private double side;

    public Square(int side, String color) {
        double area = side * side;
        Draw draw = new Draw();
        draw.draw("square", area, "side: " + side, color);
    }
}
