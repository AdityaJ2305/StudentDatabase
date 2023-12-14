import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int in=1;in>0;in++){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Calculate Average Marks");
        System.out.println("5. Exit");;
        System.out.print("Enter your choice ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1: System.out.print("Enter your name: ");
            String name= sc.nextLine();
            System.out.print("Enter your roll number: ");
            int rollNo= sc.nextInt();
            System.out.print("Enter your age : ");
            int age= sc.nextInt();
            System.out.print("Enter your marks: ");
            int marks= sc.nextInt();
            Student std= new Student(name,age,rollNo,marks);
            if(Database.map.containsKey(rollNo)){
                System.out.println("Roll No. is already assigned");
            } 
            if(marks<0){
                System.out.println("Marks cannot be negative");
            }
            else{
            Database.addingStudent(rollNo, std);
            System.out.println("Student added successfuly");
            }
            break;
            case 2: if(Database.map.size()==0){
                System.out.println("No Data of Student present");
            }
            else{
            for(Student i:Database.map.values()){
                System.out.println("List of Students");
                i.view();
            }
            }
            break;
            case 3:System.out.print("Enter your roll number: ");
            int roll= sc.nextInt();
            Student data=Database.map.get(roll);
            if(data!=null){
                data.view();
            }else{
                System.out.println("Student not found");
            }
            System.out.println("******");
            break;
            case 4: Database.calculatemarks();
            break;
            case 5:   sc.close();
            System.exit(0);
            break;
            default: System.out.println("Invalid Input");
        }
    }
    }
}
