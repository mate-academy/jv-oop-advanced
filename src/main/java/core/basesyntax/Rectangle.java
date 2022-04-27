package core.basesyntax;

public class Rectangle extends Figure implements FigureArea {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getFigureArea() {
        return height * width;
    }

    @Override
    public String getFigureInfo() {
        return "rectangle, area: " + getFigureArea()
            + " sq.units, height: " + height + " units, width: "
            + width + " units, color: " + super.getColor();
    }
}
