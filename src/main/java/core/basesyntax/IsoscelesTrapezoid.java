package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    int firstLeg;
    int secondLeg;
    int thirdLeg;
    int fourthLeg;


    public IsoscelesTrapezoid(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[1];
        thirdLeg = legs[2];
        fourthLeg = legs[3];
        double height = Math.sqrt(Math.pow(firstLeg, 2) - Math.pow((secondLeg + fourthLeg), 2) / 4);
        area = ((fourthLeg + secondLeg) * height) / 2;
        color = new ColorSupplier().getRandomColor();
        name = "isoscelesTrapezoid";
        System.out.println("Figure: " + name + ", area: " + area + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg + " units," + " side: " + thirdLeg + " units," + " side: " + fourthLeg + " units, " + "color: " +  color);
    }

}
