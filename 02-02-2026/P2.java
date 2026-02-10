import java.util.*;
class P2{
    public static void main(String[] args) {

        String[] employees = {"Ram", "Ravi", "Ram", "John", "Ravi"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(employees));
        HashSet<String> set = new HashSet<>(list);
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : list) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        for (String s : set) {
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}