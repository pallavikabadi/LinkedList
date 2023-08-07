package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList");
        /*
         UC1:Create Linked list of 56,30,70.
         */
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        linkedList.display();

        /*
         UC2: Simple Linked list by pushing 70,30,56.
         */
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();

        /*
         UC3: Simple Linked list by Appending 30 and 70 to 56.
         */
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();

        /*
         UC4: Linked list Inserting the element 30.
         */
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.append(56);
        linkedList3.append(70);
        linkedList3.display();

        boolean isInserted = linkedList3.insertAfter(56,30);
        if (isInserted)
            System.out.println("Element 30 is Inserted");
        else
            System.out.println("Element 30 is NOt inserted");
        linkedList3.display();

        /*
         UC5: Linked list PopMethod to delete the first element.
         */
        linkedList3.display();
        Integer poppedData = linkedList3.pop();
        if (poppedData == null)
            System.out.println("LinkedList is Empty");
        else
            System.out.println("The Element popped is "+poppedData);
        linkedList3.display();

        /*
         UC6: Linked list PopLastMethod to delete the Last element.
         */
        LinkedList<Integer> linkedList4 = new LinkedList<>();
        linkedList4.append(56);
        linkedList4.append(30);
        linkedList4.append(70);
        linkedList4.display();
        Integer poppedLastData = linkedList4.popLast();
        if (poppedLastData == null)
            System.out.println("LinkedList is Empty");
        else
            System.out.println("The popLast element is "+poppedLastData);
        linkedList4.display();

        /*
         UC7: to search the Node value 30.
         */
        LinkedList<Integer> linkedList5 = new LinkedList<>();
        linkedList5.append(56);
        linkedList5.append(30);
        linkedList5.append(70);
        linkedList5.display();
        Node<Integer> searchData = linkedList5.search(30);
        if (searchData == null)
            System.out.println("Element is NOT Found");
        else
            System.out.println("Element is Found");

        /*
         UC8: Insert 40 After 30
         */
        linkedList5.display();

        boolean isInsert = linkedList5.insertAfter(30,40);
        if (isInsert)
            System.out.println("Element 40 is Inserted");
        else
            System.out.println("Element 40 is NOT inserted");
        linkedList5.display();

        /*
         UC9: Delete the value 40 and size of the Linked list.
         */
        linkedList5.display();

        Node<Integer> deletedData = linkedList5.delete(40);
        if (deletedData == null)
            System.out.println("Element is Deleted");
        else
            System.out.println("Element is NOT FOUND");
        linkedList5.display();
        linkedList5.size();


    }

}
