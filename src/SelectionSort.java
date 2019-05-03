import java.util.List;

public class SelectionSort {
    public void sort(List<Integer> list) {
        for (int i=0; i < list.size() - 1; i++) {

            int min = list.get(i);
            int minIndex = i;
            for (int j=i; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            }

            int temp = list.get(i);
            list.set(i, min);
            list.set(minIndex, temp);
        }
    }

}
