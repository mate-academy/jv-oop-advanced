package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
String color;
String[] colors = {"white","black","pink","yellow","blue","purple"};

    public String getRandomColor() {
        int numberOfColor = new Random().nextInt(colors.length);
        color = colors[numberOfColor];
        return color;
    }

}
