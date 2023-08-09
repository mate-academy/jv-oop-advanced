package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String type, String color, int firstSide, int secondSide) {
        super(type, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;

    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String getDrawing() {
        return "Figure : " + getType() + ", area: " + getArea()
                 + " sq.units, first side: " + firstSide + " second side: "
                 + secondSide + " units, color: " + getColor();
    }
}
