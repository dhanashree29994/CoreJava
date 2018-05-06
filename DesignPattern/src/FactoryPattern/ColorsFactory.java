package FactoryPattern;

public class ColorsFactory 
{
	public Colors getColor(String color)
	{
		if("red".equalsIgnoreCase(color))
		{
			return new Red();
		}
		else if("yellow".equalsIgnoreCase(color))
		{
			return new Yellow();
		}
		else if("blue".equalsIgnoreCase(color))
		{
			return new Blue();
		}
		return null;
	}
}
