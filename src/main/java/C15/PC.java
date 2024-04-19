package C15;

public class PC
{
    private Case caseType;
    private Motherboard momBoard;
    private Monitor monitor;
    public Case getCaseType()
    {
        return caseType;
    }

    public void setCaseType(Case caseType) {
        this.caseType = caseType;
    }

    public Motherboard getMomBoard() {
        return momBoard;
    }

    public void setMomBoard(Motherboard momBoard) {
        this.momBoard = momBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    private void drawLogo()
    {
        this.monitor.drawPixel(1,2,"Green");
    }
    public PC(Case caseType, Motherboard momBoard, Monitor monitor )
    {
        this.caseType=caseType;
        this.momBoard=momBoard;
        this.monitor=monitor;
    }
    public void description()
    {
        System.out.println("Welcome to worstbuy. The computer on sale today is:");
        System.out.println();
        System.out.println("Case: \n"+this.caseType.toString());
        System.out.println();
        System.out.println("Motherboard: \n"+this.momBoard.toString());
        System.out.println();
        System.out.println("Monitor \n"+this.monitor.toString());
    }
    public void powerUp(int x, int y, String color)
    {
        caseType.pressPowerButton();
        monitor.drawLogo(x,y,color);
        momBoard.loadProgram("Windows XP");
    }
}
