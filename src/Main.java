import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList <Integer>();
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
        int ind = binary(list,target);
        System.out.println(ind);}
        public static Integer binary(ArrayList<Integer> list, int tar) {


            if (list.size() % 2 == 1) {
                return list.get(list.size() / 2);
            } else {
                return list.get(list.size() / 2 - 1) + list.get(list.size() / 2);

            }


        }
        }


