import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Insert a key-value pair");
            System.out.println("2. Retrieve a value by key");
            System.out.println("3. Delete a key-value pair");
            System.out.println("4. Print keys in ascending order");
            System.out.println("6. Print keys and values in ascending order");
            System.out.println("5. Exit");
            System.out.print("Option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter key: ");
                    int key = scanner.nextInt();
                    System.out.print("Enter value: ");
                    String value = scanner.next();
                    bst.put(key, value);
                    System.out.println("Key-value pair inserted.");
                    break;
                case 2:
                    System.out.print("Enter key: ");
                    int searchKey = scanner.nextInt();
                    String retrievedValue = bst.get(searchKey);
                    System.out.println("Retrieved value: " + retrievedValue);
                    break;
                case 3:
                    System.out.print("Enter key to delete: ");
                    int deleteKey = scanner.nextInt();
                    bst.delete(deleteKey);
                    System.out.println("Key-value pair deleted.");
                    break;
                case 4:
                    System.out.println("Keys in ascending order:");
                    for (Comparable k : bst.iterator()) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Keys and values in ascending order:");
                    for (BST.Node node : bst.nodeIterator()) {
                        System.out.println("Key: " + node.key + ", Value: " + node.val);
                    }
                    System.out.println();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        }
    }
}
