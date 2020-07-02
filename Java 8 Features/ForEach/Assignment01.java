import java.util.ArrayList;
import java.util.Arrays;

public class Assignmnet01{
    public static void main(String[] args) {
        ArrayList<String> arrL = new ArrayList<String>(
                Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));

        arrL.forEach(day -> System.out.println(day));
    }
}
