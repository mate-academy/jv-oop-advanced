package core.basesyntax;

public class Circle extends Shapes implements Behaviour{
    private int radius;
    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * radius);
    }
    /*@Override
    void color() {

    }*/

    @Override
    void figure() {
    System.out.println("Circle");
    }

    @Override
    void uniqueProperty() {
        System.out.println("Haven`t corners");
    }
}
