package C15;

public class Monitor
{
    String model;
    String manufacturer;
    Resolution resolution;

    public Monitor(String model, String manufacturer, Resolution resolution)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
    }

    public void drawPixel(int x, int y, String color)
    {
        System.out.println("Drawing a "+color+" pixel at x="+x+" y="+y);
    }
    public void drawLogo(int x, int y, String color)
    {
        drawPixel(x,y,color);
    }
    public String toString()
    {
        return "Model: "+model+"\n"+
                "Manufacturer: "+manufacturer+"\n"+
                "Resolution: "+resolution.toString();
    }
}
