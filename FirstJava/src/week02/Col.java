package week02;

import java.util.ArrayList;

public class Col {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = 3;
        for(int i = 0; i < n; i++){
            list.add(i);
        }

        list.add(2, 4);

        System.out.println(list);
    }
}
