package core.basesyntax;

public class ColorSupplier {
    private String[] colors = new String[]{"white","black","yellow","red","green","blue","gray"};

    public String getRandomColor() {
        int count = (int)(Math.random() * 6);
        return colors[count];
    }
}
