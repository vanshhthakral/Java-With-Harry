

public class Averagearrg {
static double average(int... numbers) {
    if (numbers.length == 0) {
        return 0;  // Return 0 to avoid division by zero
    }

    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }

    return (double) sum / numbers.length;
}

public static void main(String[] args) {
    System.out.println("Average of 5, 10, 15: " + average(5, 10, 15));
    System.out.println("Average of 7: " + average(7,15,27));
    System.out.println("Average of no values: " + average());
}
}