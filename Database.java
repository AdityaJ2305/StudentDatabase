import java.util.HashMap;

public class Database {

    public static HashMap<Integer,Student> map = new HashMap<>();
    
    public static void  addingStudent(int r,Student S1){;
        map.put(r, S1);
    }

    public static void calculatemarks(){
        int sum = 0;
        if(map.size()==0){
            System.out.println("Data empty");
        }
        else{
        for(Student S:map.values()){
            sum = sum + S.Marks;
        }
        System.out.println((double)sum/map.size());
    }
    }

    public static void searching(int roll){
        map.get(roll).view();
    }
}

