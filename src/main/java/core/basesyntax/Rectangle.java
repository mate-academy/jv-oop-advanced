package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        setColor(color);
        setName(Figures.RECTANGLE.name());
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSides(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea() {
        return sideA * sideB;
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
                .append("color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
