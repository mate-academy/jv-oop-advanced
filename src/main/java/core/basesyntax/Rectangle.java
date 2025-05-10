package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void toDraw() {
        StringBuilder str = new StringBuilder();
        System.out.println(str
                .append("Figure: rectangle, area: ")
                .append(getArea())
                .append("sq. units, side 1 : ")
                .append(width)
                .append("units ,side 2 : ")
                .append(height)
                .append("units, color: ")
                .append(color));
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
