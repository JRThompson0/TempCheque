package C15;

public class Motherboard
{
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    @Override
    public String toString() {
        return  "Model: "+model+"\n" +
                "Manufacturer: " + manufacturer
                + "\n" + "Ram Slots: " + ramSlots
                + "\n"+ "Card Slots: " + cardSlots
                +"\n"+ "bios: " + bios;
    }
    public void loadProgram(String programName)
    {
        System.out.println("Now running: "+programName);
    }

}
