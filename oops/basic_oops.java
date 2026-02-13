import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class basic_oops {

    public enum GenderChoices {
        male,
        female,
        other;
    }

    static class Data {
        String name;
        int age;
        GenderChoices gender = GenderChoices.male;

        Data(){

        }

        Data(String _name, int _age, GenderChoices _gender) {
            this.name = _name;
            this.age = _age;
            this.gender = _gender;
        }

        Data(String _name, int _age) {
            this.name = _name;
            this.age = _age;
            this.gender = GenderChoices.female;
        }

        void printData() {
            System.out.println(this.name);
            System.out.println(this.age);
            System.out.println(this.gender);
        }

    }

    public static void main(String[] args) {
        System.out.println("hello world");
        Data d = new Data();
        d.name = "Chirag";

        // Data d2 = new Data("Vijat", 23);
        d.printData();
        // d2.printData();

        Collection<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        System.out.println(list);
        System.out.println(list2.getClass());


    }
}
