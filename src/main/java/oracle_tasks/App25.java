package oracle_tasks;

import java.util.ArrayList;

public class App25 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        String[] myArray;
        try {
            while (true) {
                myList.add("My string");
            }
        } catch (RuntimeException re) {
            System.out.println("Caught RuntimeException");
        } catch (Exception e) {
            System.out.println("Caught an Exception");
        }
        System.out.println("Ready to use");
    }
}
