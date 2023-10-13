import java.util.ArrayList;

/**
 * Exception
 */
public class Exception {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for (int i = 0; i < myList.size(); i++) {

            try {
                Integer castedValue = (Integer) myList.get(i);
                // Perform operations with the castedValue
            } catch (ClassCastException e) {
                System.out.println("Error occurred at index " + i);
                System.out.println("Value of the object that triggered the error: " + myList.get(i));
                System.out.println("Error message: " + e.getMessage());
            }
        }
        

    }
}