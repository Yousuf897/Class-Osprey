package tek.week_6.Lab_Session;

public class Runner {

    public static void main(String[] args) {

        WorkingWithArray arrayClass = new WorkingWithArray();

        String[] names = { "Alex", "Tony", "Alixe", "Eric"};
        String[] lastNames = {"SomelastName", "something", "Something...." };

        int[] numbers = { 1, 10, 20, 50, 101, 202};

        arrayClass.printValuesOfArray( names );
        arrayClass.printValuesOfArray( lastNames );
        arrayClass.printValuesOfIntArray( numbers );



    }

}
