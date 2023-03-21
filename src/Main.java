import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] listToSort={7,8,5,4,9,3};
        for(int n:listToSort){
            System.out.print(n+", ");
        }
        searchSort(listToSort);
        for(int n:listToSort){
            System.out.print(n+", ");
        }

        list.add(5);
        list.add(4);
        list.add(25);
        list.add(2);
        list.add(14);
        list.add(87);
        list.add(56);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int target = 25;
        int ind = binary(list, target);
        System.out.println(ind);
        int[] listToSorts={7,8,5,4,9,3};
        for(int n:listToSorts){
            System.out.print(n+", ");
        }
        insertionSort(listToSorts);
        for(int n:listToSorts){
            System.out.print(n+", ");

        }
    }

    public static Integer binary(ArrayList<Integer> list, int tar) {

        int high = list.size() - 1;
        int low = 0;

        while (low<=high) {
           int mid=(low+high)/2;
            if(list.get(mid)==tar){
                return mid;
            }
            else if (list.get(mid) < tar) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void searchSort(int[]arr) {
        int len =arr.length;
        for(int i=0;i<len-1;i++){
            int min=i;
            for(int k=i+1;k<len;k++){
                if(arr[k]<arr[min]){
                    min=k;
                }
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

        public static void insertionSort(int[]arr){
            int len =len = arr.length;
            for(int i =1;i<len;i++){
                int key =arr[i];
                int j =i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+i]=key;
            }
        }
}


