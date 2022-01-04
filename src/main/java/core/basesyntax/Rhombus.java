package core.basesyntax;

public class Rhombus extends Figure {
    private double angle;
    private double side;

    public Rhombus(double angle, double side, String color) {
        this.setColor(color);
        this.angle = angle;
        this.side = side;
        this.setFigure("rhombus");
    }

    @Override
    public double countArea() {
        return Math.ceil(this.side * this.side
                * Math.sin(Math.toRadians(this.angle)) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.countArea()
                + " sq.units, side: " + this.side
                + " units, angle: " + this.angle
                + " units, color: " + this.getColor());
    }

}
