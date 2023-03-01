package core.basesyntax.model;

public class Rectangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        super.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return  0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append("Figure: triangle, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, firstLeg: ").append(firstLeg)
                .append(" units, secondLeg: ").append(secondLeg)
                .append(" units, color: ")
                .append(super.getColor().toLowerCase()));
    }
}
