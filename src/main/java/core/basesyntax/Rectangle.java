package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color.toLowerCase());
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: rectangle, area ")
                .append(String.format("%.2f", calculateArea()))
                .append(" sq. units, firstLeg ").append(firstLeg)
                .append(" units, secondLeg ").append(secondLeg)
                .append(" units, color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
