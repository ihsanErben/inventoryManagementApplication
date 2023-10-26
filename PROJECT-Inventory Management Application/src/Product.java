
import java.util.Scanner;

public class Product implements AllProducts {

    int n = 0;
    String[][] information_products_String = new String[100][3];
    int[][] information_products_int = new int[100][3];
    Scanner input = new Scanner(System.in);

    public void addProduct() {
        n++;
        System.out.print("name: ");
        String name = input.next();
        System.out.print("code: ");
        String code = input.next();
        System.out.print("price: ");
        int price = input.nextInt();
        System.out.print("stock: ");
        int stock = input.nextInt();
        System.out.println("----------------------------------------------------------------------------");
        information_products_String[n - 1][0] = "" + (n);
        information_products_String[n - 1][1] = name;
        information_products_String[n - 1][2] = code;

        information_products_int[n - 1][0] = (n);
        information_products_int[n - 1][1] = price;
        information_products_int[n - 1][2] = stock;

    }

    public void print_products() {
        for (int i = 0; i < n; i++) {
            System.out.println("Product" + (i + 1) + ": ");
            System.out.println("name: " + information_products_String[i][1]);
            System.out.println("code: " + information_products_String[i][2]);
            System.out.println("price: " + information_products_int[i][1]);
            System.out.println("stock: " + information_products_int[i][2]);
            System.out.println("----------------------------------------------------------------------------");
        }
    }

    public void print_spesific_product() {
        System.out.println("What do you want? -->  1-name   2-code   3-price   4-stock ");
        System.out.print("select: ");
        int selection = input.nextInt();
        System.out.println("");
        switch (selection) {
            case 1:
                System.out.print("enter the name: ");
                String name = input.next();
                boolean valid1 = false;
                for (int i = 0; i < n; i++) {
                    if (information_products_String[i][1].equals(name)) {
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("name: " + information_products_String[i][1]);
                        System.out.println("code: " + information_products_String[i][2]);
                        System.out.println("price: " + information_products_int[i][1]);
                        System.out.println("stock: " + information_products_int[i][2]);
                        valid1 = true;
                    }
                }
                if(valid1 == false){
                    System.out.println("There is no product named " + name);
                }
                System.out.println("----------------------------------------------------------------------------");
                break;
            case 2:
                System.out.print("enter the code: ");
                String code = input.next();
                boolean valid2 = false;
                for (int i = 0; i < n; i++) {
                    if (information_products_String[i][2].equals(code)) {
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("name: " + information_products_String[i][1]);
                        System.out.println("code: " + information_products_String[i][2]);
                        System.out.println("price: " + information_products_int[i][1]);
                        System.out.println("stock: " + information_products_int[i][2]);
                        valid2 = true;
                    }
                }
                if(valid2 == false){
                    System.out.println("There is no product coded " + code);
                }
                System.out.println("----------------------------------------------------------------------------");
                break;
            case 3:
                System.out.print("enter the price: ");
                int price = input.nextInt();
                boolean valid3 = false;
                for (int i = 0; i < n; i++) {
                    if (information_products_int[i][1] == price) {
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("name: " + information_products_String[i][1]);
                        System.out.println("code: " + information_products_String[i][2]);
                        System.out.println("price: " + information_products_int[i][1]);
                        System.out.println("stock: " + information_products_int[i][2]);
                        valid3 = true;
                    }                    
                }
                if(valid3 = false){
                    System.out.println("There is no product priced " + price);
                }
                System.out.println("----------------------------------------------------------------------------");
                break;
            case 4:
                System.out.print("enter the stock: ");
                int stock = input.nextInt();
                boolean valid4 = false;
                for (int i = 0; i < n; i++) {
                    if (information_products_int[i][2] == stock) {
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("name: " + information_products_String[i][1]);
                        System.out.println("code: " + information_products_String[i][2]);
                        System.out.println("price: " + information_products_int[i][1]);
                        System.out.println("stock: " + information_products_int[i][2]);
                        valid4 = true;
                    }
                }
                if(valid4 = false){
                    System.out.println("There is no product stocked " + stock);
                }
                System.out.println("----------------------------------------------------------------------------");
                break;
        }

    }

    public void updateProducts() {

        System.out.println("1 - update product name");
        System.out.println("2 - update product code");
        System.out.println("3 - update product price");
        System.out.println("4 - update product stock");

        System.out.print("Select an option: ");
        int option = input.nextInt();
        System.out.println("----------------------------------------------------------------------------");
        switch (option) {

            case 1:
                System.out.print("Select a product what you want to change its name: ");
                String name1 = input.next();
                for (int i = 0; i < n; i++) {
                    if (information_products_String[i][1].equals(name1)) {

                        System.out.print("the product's new name is: ");
                        String name2 = input.next();
                        information_products_String[i][1] = name2;

                    } else {
                        System.out.println("There is not product like " + name1);
                        break;
                    }
                }
                break;

            case 2:
                System.out.print("Select a product what you want to change its code: ");
                String code1 = input.next();
                for (int i = 0; i < n; i++) {
                    if (information_products_String[i][2].equals(code1)) {

                        System.out.print("the product's new code is: ");
                        String code2 = input.next();
                        information_products_String[i][2] = code2;

                    } else {
                        System.out.println("There is not product like " + code1);
                        break;
                    }
                }
                break;

            case 3:
                System.out.print("Select a product what you want to change its price: ");
                int price1 = input.nextInt();
                for (int i = 0; i < n; i++) {
                    if (information_products_int[i][1] == price1) {

                        System.out.print("the product's new price is: ");
                        int price2 = input.nextInt();
                        information_products_int[i][1] = price2;

                    } else {
                        System.out.println("There is not product like " + price1);
                        break;
                    }
                }
                break;

            case 4:
                System.out.print("Select a product what you want to change its stock: ");
                int stock1 = input.nextInt();
                for (int i = 0; i < n; i++) {
                    if (information_products_int[i][2] == stock1) {

                        System.out.print("the product's new stock is: ");
                        int price2 = input.nextInt();
                        information_products_int[i][2] = price2;

                    } else {
                        System.out.println("There is not product like " + stock1);
                        break;
                    }
                }
                break;
        }
    }

    public void removeProduct() {
    }
}
