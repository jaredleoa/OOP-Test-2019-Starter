package ie.tudublin;

import processing.data.TableRow;

public class Colour {
    
    public int r;
    public int g;
    public int b;
    int value;



public Colour(int r, int g, int b, int value) {
    this.r = r;
    this.g = g;
    this.b = b;
    this.value = value;
}

public Colour(TableRow tr) {
    this(tr.getInt("r"), tr.getInt("g"), tr.getInt("b"), tr.getInt("value"));
}



@Override
public String toString() {
    return r + "\t" + g + "\t" + b + "\t" + value;
}

}