package ie.tudublin;

import processing.core.PApplet;



public class Arrays extends PApplet
{
	String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
	float [] rainfall = {200, 260, 300, 150, 100, 50, 10, 40, 67, 160, 400, 420};

	public float map1(float a, float b, float c, float d, float e)
	{
		float r1 = c - b;
		float r2 = e - d;

		float howfar = a - b;

		return d + (howfar / r1) * r2;
	}

	public void settings()
	{
		size(500, 500);
		String[ ] m1 = months;
		months[0] = "XXX";
		print(m1[0]);
		for (int i = 0; i < months.length; i++)
		{
			println("Month: " + months[i] + "\t", + rainfall[i]);
			
		}// end for

		for (String s : m1) {
			println(s);
		}// end for

		int minIndex = 0;
		int maxIndex = 0;
		for (int i = 0; i < rainfall.length; i ++)
		{
			if (rainfall[i] < rainfall[minIndex])
			{
				minIndex = i;
			}// end if

			if (rainfall[i] < rainfall[maxIndex])
			{
				maxIndex = i;
			}// end if

			println("The month with the minimum rainfall was " + months[minIndex] + "with " + rainfall[minIndex] + "rain");
			println("The month with the maximum rainfall was " + months[maxIndex] + "with " + rainfall[maxIndex] + "rain");
		}// end for

		float tot = 0;
		for (float f:rainfall)
		{
			tot += f;
		}

		float avg = tot / (float) rainfall.length;

		//a b-c d-e;
		println(map1(5, 0, 10, 0, 100));
		//50

		//a b-c d-e;
		println(map1(25, 20, 10, 0, 100));
		//250

		//a b-c d-e;
		println(map1(26, 25, 35, 0,  100));
		//10

		float min = Float.MAX_VALUE;

		for (int i = 0; i < rainfall.length; i ++)
		{
			if (min < rainfall[minIndex])
			{
				min = rainfall[minIndex];
				minIndex = i;
			}// end if


		}// end for

	}

	public void setup() {
		colorMode(HSB);
		background(0);

		
		
	}

	
	public void draw()
	{
		background(0);	
		float w = width / (float)months.length;
		for (int i =0; i < months.length; i++)
		{
			float x = map1(i, 0, months.length, 0, width);
			rect(x, height, w, -rainfall[i]);

		}// end for
	}

}