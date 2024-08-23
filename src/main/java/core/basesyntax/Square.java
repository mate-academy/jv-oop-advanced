package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculable {
    private double side;

    public Square(double side, String color) {
        super.setColor(color);
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:" + area() + "sq. units, side: "
                + side + " color: " + getColor());
    }
}
