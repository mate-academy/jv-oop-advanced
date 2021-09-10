package core.basesyntax;

public abstract class Figure implements AreaCalculator, Draw {
    public void getParameters(int sideA,int sideB,int height,int firstLeg,
                           int secondLeg,int radius, String color) {
        /*int sideA;
        int sideB;
        int height;
        int firstLeg;
        int secondLeg;
        int radius;*/
    }

    public String behaviour() {
        return null;
    }
}
