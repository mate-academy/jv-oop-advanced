package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("This is a "
                + this.getColor()
                + " square with four sides with " + side + " cm "
                + " and area " + this.getArea() + " square cm"
        );
    }
}
