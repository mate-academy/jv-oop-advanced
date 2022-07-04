package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public double getSideA() {
        sideA = Math.random() * 100;
        return sideA;
    }

    public double getSideB() {
        sideB = Math.random() * 150;
        return sideB;
    }

    public double getHeight() {
        height = Math.random() * 80;
        return height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        String draw = new String();
        draw = "Figure: IsoscelesTrapezoid, area: "
                + getArea()
                + " sq.units, sideA: "
                + sideA
                + " units,  sideB:  "
                + sideB
                + "  units,"
                + " height: "
                + getHeight()
                + ", color: "
                + getRandomColor();
        System.out.println(draw);
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{"
                + "sideA="
                + sideA
                + ", sideB="
                + sideB
                + ", height="
                + height
                + '}';
    }
}