package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        this.setName("square");
        this.setColor(color);
        this.side = side;
    }

    @Override
    public void draw() {
        String drawString = FIGURE + getName() + AREA
                + String.format("%.1f", getArea()) + SQ_UNITS
                + "side: " + side + UNITS
                + "color: " + getColor();
        System.out.println(drawString);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
