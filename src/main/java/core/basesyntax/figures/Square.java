package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double areaCalc() {
        double area = Math.pow(side, 2);
        return getRound(area);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + areaCalc()
                + " sq. units, side: " + side + " units, "
                + "color: " + getColor());
    }
}
