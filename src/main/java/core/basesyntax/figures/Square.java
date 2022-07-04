package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public double getSide() {
        side = Math.random() * 100;
        return side;
    }

    @Override
    public double getArea() {

        return side * side;
    }

    @Override
    public void draw() {
        String draw = new String();
        draw = "Figure: square, area: "
                + getArea() + " sq.units, side: "
                + side + " units, color: "
                + getRandomColor();
        System.out.println(draw);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String toString() {
        return "Square{"
                + "side="
                + side
                + '}';
    }
}