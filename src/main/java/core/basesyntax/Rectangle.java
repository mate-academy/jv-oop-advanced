package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure : " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + String.format("%.2f", getArea())
                + " sq.units, first side: " + firstSide
                + " second side: " + secondSide + " units, color: "
                + getColor());
    }
}
