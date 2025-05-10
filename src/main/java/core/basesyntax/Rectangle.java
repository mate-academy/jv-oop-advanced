package core.basesyntax;

public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.getName()).append(" , area: ")
                .append(this.calculateArea())
                .append(" , color: ").append(this.getColor());
        return sb.toString();
    }
}
