package oops.constructorChaining;

// constructor Chaning in different Class

// ek class jo dursi class ko inherit krti h obj creation k time hamesha 2 constructor call hote h //- ek khudka called constructor or ek parent ka default const //-- agr paremt me default nhi h to err aayega

// agr kisi bhi parent class ko inherit nhi ki tb bhi 2 hoge - ek khudka or ek Object class ( cosmic class) ka

// agr parent ka parameterised constuctor call krna h EXCLUSIVELY  to super keyword use krte h



class Parent {
//    Parent(){
//        System.out.println("Parent Constructor");
//    }
    Parent(int a){
        System.out.println("Parent ka parameterised");
    }
}

public class Student extends Parent {

    Student(){
        super(1);
        System.out.println("Student constructor.");
    }

    public static void main(String[] args) {
        Student obj = new Student();

    }
}
