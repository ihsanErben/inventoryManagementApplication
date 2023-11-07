
import java.util.Scanner;
// clean
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Invertory Management Application");
        Product x = new Product();
        while (true) {
            
            option1();
            System.out.print("Please make a choice: ");
            int selection = input.nextInt();

            System.out.println("----------------------------------------------------------------------------");

            switch (selection) {

                case 1:
                    x.addProduct();
                    break;
                case 2:
                    x.print_products();
                    break;
                case 3:
                    x.print_spesific_product();
                    break;
                case 4:
                    x.updateProducts();
                    break;

            }



        }
    }

    public static void option1() {

        System.out.println("1 - Add a product");
        System.out.println("2 - Print all products");
        System.out.println("3 - Print spesific product");
        System.out.println("4 - Update a product");

    }
}
