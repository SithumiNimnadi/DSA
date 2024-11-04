import java.util.Arrays;

public class SectionSortMax {
    Integer[] a;

    
    public SectionSortMax(Integer[] a) {
        this.a = a;
    }

  
    public void selectionSort() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[max_idx]) {
                    max_idx = j;
                }
                System.out.println(
                    "i = " 
					+ i 
					+", j = "
					+ j
					+"; cur_max = " 
					+ a[max_idx] 
					+ "; " 
					+ Arrays.deepToString(a)
                );
            }
            swap(i, max_idx);
        }
    }

    public void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    
    public static void main(String[] args) {
        Integer[] numbers = {76, 6, 107, 92, 21, 23, 5, 9, 18, 8143};
        System.out.println("Before Sorting: " + Arrays.toString(numbers));
        
        SectionSortMax sorter = new SectionSortMax(numbers);
        sorter.selectionSort();
        
        System.out.println("After Sorting: " + Arrays.toString(numbers));
    }
}
