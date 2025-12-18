import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Size  Of Array: ");
        int size = sc.nextInt();

        CircularArray ca = new CircularArray(size);
        ca.add(23);
        ca.add(24);
        ca.add(25);
        ca.remove();
        ca.display();
        ca.remove();
        ca.display();

        System.out.print("Enter A Search: ");
        int key = sc.nextInt();
        ca.search(key);
    }
}