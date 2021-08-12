package folder;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        Person person1 = new Person("White");
        Person person2 = new Person("Black");


        list.add(person1);
        list.add(person2);



            // method get //
//        Person person1fromcollection = list.get(0);
//        Person person2fromcollection = list.get(1);
//
//        System.out.println(person1fromcollection);
//        System.out.println(person2fromcollection);

            //method remove//
        boolean remove = list.remove(person1);
        System.out.println(remove);;
        Person person = list.get(0);
        System.out.println(person);


    }
}
