package core.basesyntax;

public class Rectangle extends Shapes implements Behaviour {
    private  int side1;
    private  int side2;
    public void setSide12 (int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public int area() {
        return side1 * side2;
    }
       /* @Override
        void color () {

        }*/

        @Override
        void figure () {
        System.out.println("Rectangle");
        }

        @Override
        void uniqueProperty () {
        System.out.println("Have 4 corners");
        }
    }
