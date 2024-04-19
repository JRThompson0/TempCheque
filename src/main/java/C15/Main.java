package C15;

public class Main
{
    public static void main(String[] args)
    {
        Motherboard momboard = new Motherboard("SuperspeedLaptop",
                "Laptops Inc.", 3,2,"this is my bios text");
        Resolution widescreen = new Resolution(1920,1080);
        Monitor monitor = new Monitor("Claritycleer","Screenguys",widescreen);
        Dimensions caseSize = new Dimensions(100,200,300);
        Case newCase = new Case("BeegCase","Microsoft","A Nuclear Generator",caseSize);
        PC newPC = new PC(newCase,momboard,monitor);
        newPC.description();
        System.out.println();
        newPC.powerUp(1,2,"Greem");
    }
}
