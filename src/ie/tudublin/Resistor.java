package ie.tudublin;

import processing.data.TableRow;

public class Resistor {
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor(int value) {
        this.value = value;

        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100) + (tens * 10));
        print(hundreds + ",");
        print(tens + ",");
        println(ones);


    }

    public Resistor(TableRow tr) {
    }

    private void println(int ones2) {
    }

    private void print(String string) {
    }
}

   
