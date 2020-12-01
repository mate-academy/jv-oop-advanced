package core.basesyntax;

public class RightTriangle extends Figures {
    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
        this.area = (firstLeg * secondLeg) / 2.0;
        this.hypotenuse = Math.sqrt((firstLeg * firstLeg) + (secondLeg * secondLeg));
    }

    @Override
    public void displayInfo() {
        System.out.println("Shape: Right triangle, area = " + area
                + " sq. units, leg1 = " + firstLeg
                + " units, leg2 = " + secondLeg
                + " units, hypotenuse = " + hypotenuse
                + " units, color = " + color.getCode()
                + "this" + color.reset());
    }

    @Override
    public void draw() {
        System.out.println("#");
        System.out.println("##");
        System.out.println("# #");
        System.out.println("#  #");
        System.out.println("#   #");
        System.out.println("#    #");
        System.out.println("#######");
    }
}
