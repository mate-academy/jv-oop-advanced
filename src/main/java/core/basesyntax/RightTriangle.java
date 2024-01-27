package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle implements Drawable {
    private int firstLeg;
    private int secondLeg;
    private String color;

    public RightTriangle() {
        this.firstLeg = 4;
        this.secondLeg = 5;
        this.color = "green";
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: rightTriangle, firstLeg: " + firstLeg + ", secondLeg: "
                + secondLeg + ", area: " + df.format(getArea()) + ", color: " + color);

    }
}
