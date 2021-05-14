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
    display() {
        var output = "";
        var runner = this.head;
        while(runner) {
            output += runner.value + " "
            runner = runner.next;
        }
        return output;

    }
}