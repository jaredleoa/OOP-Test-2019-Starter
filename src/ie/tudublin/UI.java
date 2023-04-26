package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet	{
	
	public ArrayList<Colour> colours = new ArrayList<Colour>();

	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	public void loadResistors()
	{
		Table table = loadTable("resistors.csv", "header");
		for(TableRow tr:table.rows())
		{
			Resistor r = new Resistor(tr);
			resistors.add(r);
		}        
	}

	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
		for(TableRow tr:table.rows())
		{
			Colour c = new Colour(tr);
			colours.add(c);
		}        
	}


	public Colour findColor(int value)
	{
		for(Colour c:colours)
		{
			if(c.value == value)
			{
				return c;
			}
		}
		return null;
	}

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		loadColours();
		printResistors();
		
	}

	public void setup() 
	{
		loadColours();
		printResistors();

	}
	
	public void draw()
	{			
		background(0);
		int border = 20;
		int w = width / 2;
		int h = (height - (border * 2)) / colours.size();
		int i = 0;
		for(Colour c:colours)
		{
			fill(c.r, c.g, c.b);
			noStroke();
			rect(border, border + (i * h), w, h);
			i ++;
		}
	}
}
