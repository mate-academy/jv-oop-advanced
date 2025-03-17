package core.basesyntax.figures;

public class Square extends Rectangle {
    public Square(String color, double wall) {
        super(color, wall, wall);
    }

    @Override
    public void draw() {
        String sb = "Figure: Square, " +
                "Color: " + getColor() +
                ", Wall: " + getFirstWall() +
                ", Area: " + getArea();

        System.out.println(sb);
    }
}
