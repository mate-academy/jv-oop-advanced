package core.basesyntax;

public class Circle extends Figures {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Shape: Circle, area = " + area
                + " sq. units, radius = " + radius
                + " units, color = " + color.getCode()
                + "this" + color.reset());
    }

    @Override
    public void draw() {
        System.out.println("     ############  ");
        System.out.println("   ################");
        System.out.println(" ####################");
        System.out.println("######################");
        System.out.println("######################");
        System.out.println("######################");
        System.out.println(" ####################");
        System.out.println("  ##################");
        System.out.println("     ############");
    }
}
