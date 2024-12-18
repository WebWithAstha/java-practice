package oops;

public class Student {
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    // is method ko generate krne se jb obj print krate h to address ki jagah details print hoti h obj ki
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        // creating obj of class student
        Student s1 = new Student("Astha",20);
        System.out.println(s1);
    }

}
