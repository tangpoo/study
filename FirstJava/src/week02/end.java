package week02;

import java.util.*;

public class end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String collection = sc.nextLine();
        String title= sc.nextLine();


        switch(collection) {
            case "List":
                ArrayList<String> list = new ArrayList<>();
                while(true){
                    String str = sc.nextLine();
                    if(str.equals("끝")) break;

                    list.add(str);
                }

                title = "[ List로 저장된 " + title + " ]";
                System.out.println(title);

                for(int i = 0; i < list.size(); i++){
                    System.out.println(i+1 + ". " +list.get(i));
                }
                break;

            case "Set":
                Set<String> set = new HashSet<>();
                while(true){
                    String str = sc.nextLine();
                    if(str.equals("끝")) break;

                    set.add(str);
                }

                title = "[ Set로 저장된 " + title + " ]";
                System.out.println(title);

                Iterator iterator = set.iterator();

                for(int i = 0; i < set.size(); i++){
                    System.out.println(i+1 + ". " + iterator.next());
                }
                break;

            case "Map":
                Map<Integer, String> map = new HashMap<>();
                int key = 0;
                while(true){
                    String str = sc.nextLine();
                    if(str.equals("끝")) break;

                    map.put(key++, str);
                }

                title = "[ Map로 저장된 " + title + " ]";
                System.out.println(title);

                for(int i = 0; i < map.size(); i++){
                    System.out.println(i+1 + ". " +map.get(i));
                }
                break;

            default:
                System.out.println("저장할 수 없는 자료구조 입니다.");

        }
    }
}
