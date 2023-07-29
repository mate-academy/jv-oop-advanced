package core.basesyntax;

public class Square extends Shape {
    private int side;

    public Square(String color,int side) {
        super(color);
        this.color = color;
    }

    @Override
    public int figureArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + figureArea() + " sq. units, side: " + side
                + " units, color: " + color);
    }
}
