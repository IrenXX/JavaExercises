import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateRemoving {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("A");
        input.add("B");
        input.add("BB");
        input.add("B");
        input.add("AA");
        input.add("B");
        input.add("A");

        System.out.println(removeDuplicate(input));
    }

    private static List<String> removeDuplicate(List<String> splitWorld) {

        int i = 0;
        for (Iterator<String> iterator = splitWorld.iterator(); iterator.hasNext(); ) {
            String value = iterator.next();
            boolean isUniq = true;

            for (int j = 0; j < i; j++) {
                String uniq = splitWorld.get(j);
                if (value.equals(uniq)) {
                    iterator.remove();
                    isUniq = false;
                    break;
                }
            }
            if (isUniq) {
                i++;
            }
        }

        return splitWorld;
    }

}
