import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) throws Exception {
        
        char ch = 'A'; // This does not work with Collections
        Character ch2 = 'B'; // Needed to work with Collections

        int num = 3;
        Integer num2 = 5;

        System.out.println(((Object) num).getClass().getSimpleName()); // To check what class the variable num belongs
        System.out.println(num2.getClass().getSimpleName()); // To check what class the object num2 belongs 

        
        System.out.println(((Object) ch).getClass().getSimpleName());
        System.out.println(ch2.getClass().getSimpleName()); 


        /* Accepting inputs from users using Scanner class */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.println("Enter your address: ");
        String address = input.nextLine();

        System.out.println("Enter your gender: ");
        char gender = input.next().charAt(0); // input.next().charAt(0)
        
        System.out.println("Enter another string: ");
        String str4 = input.nextLine();
        input.nextLine(); // Consume the newline character

        System.out.println("Name: " + name);
        System.out.println("Age: " + age); 
        System.out.println("Address: " + address); 
        System.out.println("Gender:" + gender);
    
        /* Natural behaviour of nextInt() is to accept multiple inputs on the same line */
        System.out.println("Enter two numbers: ");
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        System.out.println("The two numbers your entered are: " + num3 + " and " + num4);
    
        input.nextLine(); // Consume the newline character
        
        input.close(); // Close the scanner object
        
        
        
        
        /* Working with LocalDate and LocalTime classes */
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate specificdate = LocalDate.of(2025, 10, 25);
        Period period = Period.between(date, specificdate);
        System.out.println("Period between two dates: " + period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days");

        
        System.out.println("Specific date: " + specificdate);
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day of month: " + date.getDayOfMonth());
        System.out.println("Day of week: " + date.getDayOfWeek());
        System.out.println("Day of year: " + date.getDayOfYear());  
        System.out.println("Is leap year: " + date.isLeapYear());
        System.out.println("Add two days: " + date.plusDays(2));
        System.out.println("Subtract two days: " + date.minusDays(2));
        System.out.println("Add two months: " + date.plusMonths(2));
        System.out.println("Subtract two months: " + date.minusMonths(2));  
        System.out.println("Add two years: " + date.plusYears(2));
        System.out.println("Subtract two years: " + date.minusYears(2));

        
        
        LocalTime time = LocalTime.of(9,0,0);
        LocalTime time2 = LocalTime.of(17, 30, 45);

        Duration diff = Duration.between(time, time2);
        
        System.out.println("Time difference is: " + diff.toHours() + " hours " + diff.toMinutesPart() + " minutes " + diff.toSecondsPart() + " seconds");
        
        

        LocalTime specificTime = LocalTime.of(12, 30, 45, 100);
        System.out.println("Specific time: " + specificTime);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
        System.out.println("Nano: " + time.getNano());  
        System.out.println("Add two hours: " + time.plusHours(2));
        System.out.println("Subtract two hours: " + time.minusHours(2));
        System.out.println("Add two minutes: " + time.plusMinutes(2));
        System.out.println("Subtract two minutes: " + time.minusMinutes(2));
        System.out.println("Add two seconds: " + time.plusSeconds(2));
        System.out.println("Subtract two seconds: " + time.minusSeconds(2));
        System.out.println("Add two nanos: " + time.plusNanos(2));
        System.out.println("Subtract two nanos: " + time.minusNanos(2));
        System.out.println(specificTime instanceof LocalTime);

        
        
    }
}
