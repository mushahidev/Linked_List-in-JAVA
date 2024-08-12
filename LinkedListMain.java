package Tasks81224;

public class LinkedListMain {

            public static void main(String[] args) {
                LinkedList list = new LinkedList();

                list.append(10);
                list.append(20);
                list.append(30);

                System.out.println("Linked List:");
                list.display();

                list.delete(20);

                System.out.println("Linked List after deletion:");
                list.display();

    }
}

