
import java.util.Scanner;
class Page {
    String url;
    Page next;
     Page(String url) {
        this.url = url;
        this.next = null;
    }
}


class BrowserHistory {
Page head = null;
public void visitPage(String url) {
Page newPage = new Page(url);
 if (head == null) {
            head = newPage;
        } else {
Page temp = head;
while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newPage;
        }

        System.out.println(url + " visited successfully!");
    }

    // Display browsing history
    public void displayHistory() {

        if (head == null) {
            System.out.println("No browsing history.");
            return;
        }

        System.out.println("\nBrowsing History:");

        Page temp = head;

        while (temp != null) {
            System.out.println(temp.url);
            temp = temp.next;
        }
    }

    // Search for a page
    public void searchPage(String url) {

        Page temp = head;

        while (temp != null) {

            if (temp.url.equalsIgnoreCase(url)) {
                System.out.println(url + " found in history.");
                return;
            }

            temp = temp.next;
        }

        System.out.println(url + " not found.");
    }

    // Delete a page from history
    public void deletePage(String url) {

        if (head == null) {
            System.out.println("History is empty.");
            return;
        }

        // Delete first node
        if (head.url.equalsIgnoreCase(url)) {
            head = head.next;
            System.out.println(url + " deleted successfully!");
            return;
        }

        Page temp = head;

        while (temp.next != null &&
               !temp.next.url.equalsIgnoreCase(url)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(url + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println(url + " deleted successfully!");
        }
    }

    // Count total visited pages
    public void countPages() {

        int count = 0;

        Page temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total visited pages: " + count);
    }
}

// Main class
public class BrowserHistorySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BrowserHistory history = new BrowserHistory();

        int choice;

        do {

            System.out.println("\n===== Browser History Menu =====");
            System.out.println("1. Visit New Page");
            System.out.println("2. Display Browsing History");
            System.out.println("3. Search Page");
            System.out.println("4. Delete Page");
            System.out.println("5. Count Total Pages");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter page URL: ");
                    String url = sc.nextLine();
                    history.visitPage(url);
                    break;

                case 2:
                    history.displayHistory();
                    break;

                case 3:
                    System.out.print("Enter page to search: ");
                    String search = sc.nextLine();
                    history.searchPage(search);
                    break;

                case 4:
                    System.out.print("Enter page to delete: ");
                    String del = sc.nextLine();
                    history.deletePage(del);
                    break;

                case 5:
                    history.countPages();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}