package core.basesyntax;

public class Rectangle extends Figures {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("THIS IS Rectangle");
    }

    @Override
    public String displayInformation() {
        return "Figure: Rectangle, area: " + getArea() + " sq. units, side A length: " + sideA
                + " units, side B length: " + sideB + " units, color: " + getColor();
    }
}
