package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super.setColor(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square was drawn");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString() + "square, area: " + this.getArea()
                + " sq. units, side: " + this.side + " units, color: "
                + super.getColor();
    }

}
