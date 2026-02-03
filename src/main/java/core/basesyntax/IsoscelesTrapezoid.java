package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        setColor(color);
        setName(Figures.ISOSCELES_TRAPEZOID.name());
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getHeight() {
        return height;
    }

    public void setSides(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getArea() {
        return ((sideA + sideB) / 2.0) * height;
    }

    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append(getName())
                .append(", ")
                .append("area: ")
                .append(getArea())
                .append("sq. units, ")
                .append("sideA: ")
                .append(sideA)
                .append(" units, ")
                .append("sideB: ")
                .append(sideB)
                .append(" units, ")
                .append("height: ")
                .append(height)
                .append(" units, ")
                .append("color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
