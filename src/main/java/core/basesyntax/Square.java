package core.basesyntax;

public class Square extends Figure {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.color = color;
        this.side = side;
    }

    public Square() {
        color = Color.values()[random.nextInt(Color.values().length)].name();
        side = random.nextDouble();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area + " sq.units, side: " + side
                + " units, color: " + color);
    }
}
