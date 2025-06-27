// Written by: Christopher Gholmieh & Bryan Hsu
// Package:
package Components;


// Tree:
public class Tree {
    // Variables (Assignment):
    // Head:
    TreeNode head;

    // Current:
    TreeNode current;

    // Constructor:
    public Tree(TreeNode head) {
        // Variables (Assignment):
        // Head:
        this.head = head;

        // Current:
        this.current = head;
    }

    // Methods:
    public void advance_once() {
        // Validation:
        if (head == null || current == null) {
            return; // No nodes to advance
        }

        // Variables (Assignment):
        // Evaluation:
        int evaluation = current.evaluate();

        // Logic:
        if (current.is_dead_end()) {
            current = head;
        } else {
            if (evaluation == 0) {
                current = current.get_left();
            } else if (evaluation == 1 && current.get_right() != null) {
                current = current.get_right();
            } else {
                throw new IllegalStateException("Invalid evaluation result: " + evaluation);
            }
        }
    }

    //TODO: Write something like append_node for this? It has to be positioned somehow
}
