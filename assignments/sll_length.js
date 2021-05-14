class Node {
    constructor(value) {
        this.value = value;
        this.next = null
    }
}
class SLL {
    constructor() {
        this.head = null;
    }
    length() {
        var runner = this.head;
        var lenONodes = 0;
        while(runner) {
            Node++;
            runner = runner.next;
        }
        return lenONodes;
    }
}