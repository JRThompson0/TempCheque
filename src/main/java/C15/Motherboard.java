package C15;

public class Motherboard
{
    String model;
    String manufacturer;
    int ramSlots;
    int cardSlots;
    String bios;
    public void loadProgram(String programName)
    {
        System.out.println("Now running: "+programName);
    }
}
