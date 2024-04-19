package C15;

public class Monitor
{
    String model;
    String manufacturer;
    Resolution resolution;
    public void drawPixel(int x, int y, String color)
    {
        System.out.println("Drawing a "+color+" pixel at x="+x+" y="+y);
    }
}
