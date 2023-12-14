public class Student{

    String Name;
    int Age;
    int Roll_No;
    int Marks;

    Student(String name, int age,int rollno,int marks){
        this.Name = name;
        this.Age = age;
        this.Roll_No = rollno;
        this.Marks = marks;
    }

    public void view(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Roll No. "+Roll_No);
        System.out.println("Marks: "+Marks);
    }
}
