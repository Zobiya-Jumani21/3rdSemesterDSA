class Person{
    int age;
    String name;


    
}
class Student extends Person{
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public  void display(){
        System.out.println(name+"\n"+age);
    }

}
public class HW2 {
    public static void main(String[] args) {

        Student s1=new Student("Zobiya",21);
        Student s2 = new Student("Shumaila",21);
        Student s3 = new Student("khan",22);
        Student s4[]= new Student[1];
        Person p1[] = new Person[3];


//        s1[0]=new Student("zobiya",21);
//        s1[1]=new Student("zobiya",21);
//        s1[2]=new Student("zobiya",21);
//        s1[3]=new Student("zobiya",21);
        p1[0]=s1;
        p1[1]=s2;
        p1[2]=s3;
        s1.display();

// H.w 3
        System.out.println(s1.getClass());
    }
}
