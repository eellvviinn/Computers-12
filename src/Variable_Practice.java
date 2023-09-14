import java.util.Scanner;

public class Variable_Practice {

    public static void main( String[] args )
    {

        //Variables and Names
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;


        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );


        //Problem 1
        System.out.println(" ");
        System.out.println("Problem 1");
        int room = 113;
        double e = 2.71828;
        String course = "Computer Science";
        System.out.println("This is room # " + room);
        System.out.println("e is close to " + e);
        System.out.println("I am learning a bit about " + course);


        //Your Schedule
        System.out.println(" ");
        System.out.println("Your Schedule");
        String s1b1Class = "English 12";
        String s1b1Teacher = "Ms. Silvers";
        String s1b2Class = "Peer Tutoring 12";
        String s1b2Teacher = "Ms. Kim";
        String s1b3Class = "Computer Programming 12";
        String s1b3Teacher = "Mr. Zaremba";
        String s1b4Class = "French 12";
        String s1b4Teacher = "Ms. McCartin";
        String s2b1Class = "Chemistry 12";
        String s2b1Teacher = "Mr. Slapsys";
        String s2b2Class = "Calculus 12";
        String s2b2Teacher = "Mr. Grabowski";
        String s2b3Class = "Economics 12";
        String s2b3Teacher = "Ms. Sohdi";
        String s2b4Class = "Physics 12";
        String s2b4Teacher = "Mr. Tang";
        System.out.println("+-----------------------------------------------------+");
        System.out.println("| 1 |                        " + s1b1Class + "|   " + s1b1Teacher + "|");
        System.out.println("| 2 |                  " + s1b2Class + "|       " + s1b2Teacher + "|");
        System.out.println("| 3 |           " + s1b3Class + "|   " + s1b3Teacher + "|");
        System.out.println("| 4 |                         " + s1b4Class + "|  " + s1b4Teacher + "|");
        System.out.println("| 5 |                      " + s2b1Class + "|   " + s2b1Teacher + "|");
        System.out.println("| 6 |                       " + s2b2Class + "| " + s2b2Teacher + "|");
        System.out.println("| 7 |                      " + s2b3Class + "|     " + s2b3Teacher + "|");
        System.out.println("| 8 |                        " + s2b4Class + "|      " + s2b4Teacher + "|");
        System.out.println("+-----------------------------------------------------+");


        //Hot Dog Stand
        System.out.println(" ");
        System.out.println("Hot Dog Stand");
        Scanner scanner = new Scanner(System.in);
        double hotDogPrice = 5.50;
        double drinkPrice = 2.00;
        int hotDogQuantity = 0;
        int drinkQuantity = 0;

        System.out.println("How many hot diggity dogs would you like to purchase?");
        hotDogQuantity = scanner.nextInt();
        System.out.println("How many refreshing beverages would you like to purchase?");
        drinkQuantity = scanner.nextInt();
        System.out.println("Your total cost after tax is $" + ((hotDogPrice * hotDogQuantity) + (drinkPrice * drinkQuantity)) * 1.12 + ". Thank you for shopping at save on foods!");



    }
}

