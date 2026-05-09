package TestStudent;

class Student{
    int id;
    String name;
/*
    @Override
    public boolean equals(Object obj){
        Student s=(Student) obj;    //-->>**downcast** (type casting) ->> telling java obj is actually a Student object,please treat it as Student from now on
        if(s.id==this.id && s.name.equals(this.name)){    //---> s.name.equals(this.name) -> for string check on each char by loop implemented in Object class
            return true;
        }else{
            return false;
        }
    }
 */
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1=new Student(1, "Prince");
        Student s2=new Student(1, "Prince");
        System.out.println("Comparing Obj: "+s1.equals(s2)); // false  // After overriding equals method can get true which commented above  --> it also recommanded to override equals() and hashCode() because for hashSet or data Struct like collection we need both overriden otherwise won't work
        System.out.println(s1); //TestStudent.Student@3d075dc0
        System.out.println(s2);// TestStudent.Student@214c265e
        // For classes we need to override equals method because both s1 and s2 on diff memory location so it

        //--------------------------------------------
        String str1="Sharma";
        String str2="Sharma";
        System.out.println("Comparing String: "+str1.equals(str2)); // true

        Integer i=101;
        Integer j=101;
        System.out.println("Comparing Integer: "+ i.equals(j)); // true

    }
}
