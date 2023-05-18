package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + FigureType.RECTANGLE.getValue() + ", area: "
                + df.format(calculateArea()) + " sq.units, height: " + this.height
                + " units, width: " + this.width + " units, color: " + super.color);
    }

}
