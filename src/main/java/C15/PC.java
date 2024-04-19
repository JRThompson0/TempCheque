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
}
