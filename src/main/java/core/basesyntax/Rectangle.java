package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;
    private String color;

    public Rectangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    public Rectangle() {
        firstSide = random.nextDouble();
        secondSide = random.nextDouble();
        color = Color.values()[random.nextInt(Color.values().length)].name();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide + " units, color: " + color);
    }
}
