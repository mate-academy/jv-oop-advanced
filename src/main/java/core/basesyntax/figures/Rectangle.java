package core.basesyntax.figures;

public class Rectangle extends Figures {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.area = sideA * sideB;
    }

    @Override
    public void displayInfo() {
        System.out.println("Shape: Rectangle, area = " + area
                + " sq. units, side A = " + sideA
                + " units, side B = " + sideB
                + " units, color = " + color.getCode()
                + "this" + color.reset());
    }

    @Override
    public void draw() {
        System.out.println("##############");
        System.out.println("#            #");
        System.out.println("#            #");
        System.out.println("##############");
    }
}
