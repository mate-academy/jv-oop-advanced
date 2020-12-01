package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figures {
    private double firstBase;
    private double secondBase;
    private double heigth;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double heigth, Color color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.heigth = heigth;
        this.area = (firstBase + secondBase) / 2.0 * heigth;
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Shape: Isosceles trapezoid, area = " + area
                + " sq. units, base1 = " + firstBase
                + " units, base2 = " + secondBase
                + " units, heigth = " + heigth
                + " units, color = " + color.getCode()
                + "this" + color.reset());
    }

    @Override
    public void draw() {
        System.out.println("   ########");
        System.out.println("  #        #");
        System.out.println(" #          #");
        System.out.println("##############");
    }
}
