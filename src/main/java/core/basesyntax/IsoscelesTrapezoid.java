package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {

    private double height;
    private double sideB;

    public IsoscelesTrapezoid(String name, String color, double sideA,
                              double heigth, double sideB) {
        super(name, color, sideA);
        this.height = height;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (getSideA() + sideB) / 2 * height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName() + ", area " + getArea() + "sq.units, first base: "
                    + firstBase + "units, second base: " + secondBase+ "units, height: "
                    + height + "units, " + "color: " + getColor());
    }
}
