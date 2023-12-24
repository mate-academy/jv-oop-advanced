package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        this.name = "square";
        this.color = color;
        this.side = side;
    }

    @Override
    public void draw() {
        String drawString = FIGURE + name + AREA
                + String.format("%.1f", getArea()) + SQ_UNITS
                + "side: " + side + UNITS
                + "color: " + color;
        System.out.println(drawString);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
