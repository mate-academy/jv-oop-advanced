package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public double getSideA() {
        sideA = Math.random() * 100;
        return sideA;
    }

    public double getSideB() {
        sideB = Math.random() * 99;
        return sideB;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        String draw = new String();
        draw = "Figure: rectangle, area: "
                + getArea()
                + " sq.units, sideA: "
                + sideA
                + " units,  sideB:  "
                + sideB
                + "  units, color: "
                + getRandomColor();
        System.out.println(draw);
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "sideA="
                + sideA
                + ", sideB="
                + sideB
                + '}';
    }
}