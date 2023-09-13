//Write a program in java which describes a class Student using default and parametrized 
//constructors.It should have instance variables to record the id,name and age of a
//student create two student objects and display their details
package studies;

class students{
    int id;
    String name;
    int age;

    students(){ //Deafult Constructor
        id=1;
        name="manisha";
        age=21;
    }

    students(int i,String n,int a){ //parametrized constructors
        id=i;
        name=n;
        age=a;
    }

    void show(){ 
        System.out.println("Student id is:"+id);
        System.out.println("Student name is:"+name);
        System.out.println("Student age is:"+age);
    }

    public static void main(String[] args){
        students s = new students(); //default constructor
        students z = new students(2,"manisha",20); //Parametrized constructor
        System.out.println("Student s Details:");
        s.show();//calling method from object
        System.out.println();
        System.out.println("Student z Details:");
        z.show();//calling method from object
    }
}
