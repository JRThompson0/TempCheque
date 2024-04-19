Compose a PC
Part 1 - Create the following classes:
Create a PC class that HAS a Case , Motherboard and a Monitor
Create a parameterized constructor for PC containing all of its instance variables
Create a drawLogo() method that is private , that returns nothing but inside the method, invoke the drawPixel(x,y,z) method on the monitor instance variable within the PC class
Create a public method called description() that returns nothing but prints out the description of the case, monitor and motherboard by starting with the message “Welcome to worst buy below is the description of the pc on sale today ….”
Make sure all objects can be printed using the String representation of an object
Create a powerUp() method that is public and returns nothing but inside the method invoke/call the pressPowerButton() method on theCase. While still inside the powerUp method, call the drawLogo() method then right after that invoke the​ loadProgram() method on the motherBoard ​object.
Part 2 - Monitor class:
Create a Monitor class that HAS a Resolution and consist of a model and manufacturer as well.(All instance variables)
Create a void drawPixel(int x, int y, String color) with the following parameters and simply print out the message "Drawing pixel at " + x + "," + y + " " + " in color "+ color. (use this code inside the drawPixel method to make the message is dynamic)
Part 3 - Resolution class:
Create a Resolution class with these two private properties width and height.
Make sure you add all that is necessary such:  getters, setters, toString etc..
Part 4 - MotherBoard class:
Inside the MotherBoard class, create the following private properties:
String model, String manufacturer, int ramSlots, int cardSlots, String bios.
Create a loadProgram() method that returns nothing and accepts a parameter named programName. Inside the method, use the programName parameter to concatenate and print out a message such as: programName is now running.
Part 5 - Case class:
Create the following private properties ( Add getters and setters if you need to do so)
String model; String manufacturer; String powerSupply; Dimensions dimensions;
Create a pressPowerButton() method that returns nothing but simply prints out the message :  "PowerButton Pressed”
Part 6 - Dimension class:
Create the following fields as well as getters, and a parameterized constructors:
int width; int height; int depth;
Part 6 - Main class:
Create an instance/Object of Type PC
Call the description( ) method on the pc object
Invoke the powerUp( ) method method on the pc object.
Push private Repo to github and add DM to me.

Part 7 - Unit Testing
Create a unit test for the  parameterized constructor for PC 

