package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        this.setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.setFigure("rectangle");
    }

    @Override
    public double countArea() {
        return Math.ceil(this.sideA * this.sideB * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.countArea()
                + " sq.units, sideA: " + this.sideA
                + " units, sideB: " + this.sideB
                + " units, color: " + this.getColor());
    }

}
