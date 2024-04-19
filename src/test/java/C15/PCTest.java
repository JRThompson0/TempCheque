package C15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCTest {
    @Test
    public void pcTest()
    {
    //arrange
    Motherboard momboard = new Motherboard("sampleString",
            "sampleString", 0, 0, "sampleString");
    Resolution widescreen = new Resolution(1920, 1080);
    Monitor monitor = new Monitor("sampleString", "sampleString", widescreen);
    Dimensions caseSize = new Dimensions(100, 200, 300);
    Case newCase = new Case("sampleString", "sampleString", "sampleString", caseSize);
    //Act
    PC newPC = new PC(newCase, momboard, monitor);
    //Assert
        assertNotNull(newPC);
    }
}