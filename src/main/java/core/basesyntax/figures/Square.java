package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("square, area: " + this.getArea()
                + " sq. units, side: " + this.side + " units, color: "
                + super.getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
