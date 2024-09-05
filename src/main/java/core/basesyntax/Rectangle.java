package core.basesyntax;

public class Rectangle extends Figure {
    private double leftSide;
    private double downSide;

    public Rectangle(String color, double leftSide, double downSide) {
        super(color);
        this.leftSide = leftSide;
        this.downSide = downSide;
    }

    @Override
    public double calculateArea() {
        return leftSide * downSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + decimalFormat.format(calculateArea()) + " sq. units, left side: "
                + decimalFormat.format(leftSide) + " units, down side: "
                + decimalFormat.format(downSide) + " units, color: " + color);
    }
}
