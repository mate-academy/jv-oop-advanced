package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.setColor(color);
        this.setFigure("square");
    }

    @Override
    public double countArea() {
        return Math.ceil(this.side * this.side * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: " + this.getFigure()
                + ", area: " + this.countArea()
                + " sq.units, side: " + this.side
                + " units, color: " + this.getColor());
    }

}
