// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Printable print = s ->
                System.out.println(s );


        Produceble produc = () -> "Hello word";


        String empty = "empty";
        print.print(empty);

        String producedS = produc.produce();
        System.out.println(" Produced " + producedS);


    }
}
