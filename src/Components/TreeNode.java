// Written by: Christopher Gholmieh & Bryan Hsu
// Package:
package Components;

// Imports:
import java.util.function.Supplier;


// Node:
public class TreeNode {
    // Variables (Declaration):
    // Value:
    private Supplier<Integer> value;

    // Left:
    private TreeNode left;

    // Right:
    private TreeNode right;

    // Constructor:
    public TreeNode(Supplier<Integer> value, TreeNode left, TreeNode right) {
        // Variables (Assignment):
        // Value:
        this.value = value;

        // Left:
        this.left = left;

        // Right:
        this.right = right;
    }

    // Getters:
    public Supplier<Integer> get_value() {
        return this.value;
    }

    public TreeNode get_left() {
        return this.left;
    }

    public TreeNode get_right() {
        return this.right;
    }

    // Setters:
    public void set_value(Supplier<Integer> value) {
        this.value = value;
    }

    public void set_left(TreeNode left) {
        this.left = left;
    }

    public void set_right(TreeNode right) {
        this.right = right;
    }

    // CHeckers:
    public boolean is_dead_end() {
        return (left == null && right == null);
    }

    // Methods:
    public int evaluate() {
        // Variables (Assignment):
        // Result:
        Integer result = value.get();

        // Logic:
        return result.intValue();
    }
}