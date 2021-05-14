class Class1 {
    constructor(value) {
        this.value = value;
        this.next = null
    }
}
class SLL {
    constructor() {
        this.head = null;
    }
    addFront(value) {
        // Write a method that accepts a value and create a new node, 
        // assign it to the list head, and return a pointer to the new head node.

        // create a new node
        var class2 = new Class1(value);

        // attach new node to existing list
        class2.next = this.head;

        // reassign list's head
        this.head = class2;

        // return the head
        return this.head;
    }

    removeFront() {
        //Write a method to remove the head node and return the new list head node. 
        //If the list is empty, return null.
        if(this.head) {
            this.head = this.head.next;
        }
        return this.head;
    }

    front() {
        // Write a method to return the value (not the node) at the head of the list. 
        // If the list is empty, return null.
        if(this.head) {
            return this.head.value;
        }
        return null;
    }
}