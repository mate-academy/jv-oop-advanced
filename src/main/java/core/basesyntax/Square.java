package core.basesyntax;

public class Square extends Figure {
    private final ColorSupplier cs = new ColorSupplier();
    private String color;
    private double side;

    public Square() {
    }

    public Square(double side, String color) {
        this.side = side;
        this.color = cs.getRandomColor();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void getInfoAboutFigure() {
        System.out.println("Figure: square, area: " + (side * side)
                + ", side: " + side
                + " color: " + color);
    }

}
