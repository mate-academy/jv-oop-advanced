package core.basesyntax;

public class RightTriangle extends Shapes implements Behaviour {
    private int height;
    private int leg;
    public void setHeightLeg(int height, int leg) {
        this.height = height;
        this.leg = leg;
    }


    @Override
    public int area() {
        return height * leg;
    }

   /* @Override
    void color() {

    }*/

    @Override
    void figure() {
    System.out.println("RightTriangle");
    }

    @Override
    void uniqueProperty() {
    System.out.println("Have 3 corners");
    }
}

