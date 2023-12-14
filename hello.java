import java.util.HashMap;

public class hello {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(4,"hello");
        map.put(4,"bye");
        System.out.println(map.get(4));
    }
}
