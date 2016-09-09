import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Welcome to the reservation service for Scala Hall!");
    System.out.println("If you'd like to reserve our space for an event, you're in the right place!");
    System.out.println("First, please let us know what date you'll be scheduling on...");
    String dateInput = console.readLine();
    System.out.println(dateInput +  ", sounds great!");

    System.out.println("How many people will be attending your event? Maximum capacity is 150 people");
    String stringPeopleComing = console.readLine();
    Integer peopleComing = Integer.parseInt(stringPeopleComing);

    System.out.println("We have a variety of options to choose from for your event.");
    System.out.println("For the following questions, type a number 1 - 5 to make your choice.");
    System.out.println("Which meal option would you like?");
    System.out.println("1 : No catering");
    System.out.println("2 : Basic sampler trays");
    System.out.println("3 : Basic buffet");
    System.out.println("4 : Deluxe buffet");
    System.out.println("5 : Full menu");
    String foodInput = console.readLine();

    System.out.println("Which beverage option would you like?");
    System.out.println("1 : BYOB");
    System.out.println("2 : Punch bowl");
    System.out.println("3 : Assorted drink fountain");
    System.out.println("4 : Drink fountain and assorted punch bowls");
    System.out.println("5 : Open bar");
    String beverageInput = console.readLine();

    System.out.println("Which of our entertainment options would you like?");
    System.out.println("1 : I'll handle it!");
    System.out.println("2 : Equipment only (projector, microphones");
    System.out.println("3 : House DJ");
    System.out.println("4 : Acoustic Guitarist");
    System.out.println("5 : Full Band");
    String entertainmentInput = console.readLine();

    Event event = new Event(peopleComing, foodInput, beverageInput, entertainmentInput);

    event.calculateTotalCost();

    System.out.println("Alright, here's your reservation:");
    System.out.println("_________________________________");
    System.out.println("Date: " + dateInput);
    System.out.println("Number of people attending: " + peopleComing);
    System.out.println("Food: " + event.getOutputFood());
    System.out.println("Beverages: " + event.getOutputBeverage());
    System.out.println("Entertainment: " + event.getOutputEntertainment());
    System.out.println("_________________________________");
    System.out.println("Total Cost: $" + event.getTotalCost());
  }
}
