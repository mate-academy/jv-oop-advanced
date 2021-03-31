package core.basesyntax;

public class Square extends  Shapes implements  Behaviour{
    private  int side;
    public void  setSide (int side) {
        this.side = side;
    }
    @Override
    public int area() {
    return side * side;
    }

   /* @Override
    void color() {

    }*/

    @Override
    void figure() {
     System.out.println("Square");
    }

    @Override
    void uniqueProperty() {
    System.out.println("Have 4 corners 90 degrees");
    }
}


