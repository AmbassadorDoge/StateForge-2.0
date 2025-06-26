// Written by: Christopher Gholmieh
// Package:
package Components;


// List:
public class LinkedList {
    // Variables (Declaration):
    // Head:
    private Node head;

    // Current:
    private Node current;

    // Constructor:
    public LinkedList(Node head) {
        // Variables (Assignment):
        // Head:
        this.head = head;

        // Current:
        this.current = head;
    }

    // Methods:
    public boolean advance_once() {
        // Validation:
        if (head == null || current == null) {
            return false;
        }

        // Variables (Assignment):
        // Evaluation:
        boolean evaluation = current.evaluate();

        // Logic:
        if (evaluation) {
            if (current.get_pointer() == null) {
                current = head;
            } else {
                current = current.get_pointer();
            }
        }

        return evaluation;
    }

    public void append_node(Node node) {
        // Validation:
        if (head == null) {
            // Variables (Assignment):
            // Head:
            head = node;

            // Current:
            current = node;

            // Logic:
            return;
        }

        // Variables (Assignment):
        // Tracker:
        Node tracker = head;

        // Logic:
        while (tracker.get_pointer() != null) {
            tracker = tracker.get_pointer();
        }

        tracker.set_pointer(node);
    }
}