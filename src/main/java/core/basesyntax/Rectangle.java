package core.basesyntax;

public class Rectangle extends Figure{
    int firstLeg;
    int secondLeg;
    int thirdLeg;
    int fourthLeg;

    public Rectangle(int[] legs) {
        firstLeg = legs[0];
        secondLeg = legs[1];
        thirdLeg = legs[2];
        fourthLeg = legs[3];
        area = firstLeg*secondLeg;
        color = new ColorSupplier().getRandomColor();
        name = "rectangle";
        System.out.println("Figure: " + name + ", area: " + area + " sq.units, side: " + firstLeg + " units," + " side: " + secondLeg + " units," + " side: " + thirdLeg + " units," + " side: " + fourthLeg + " units, " + "color: " +  color);
    }
}
