// Written by: Christopher Gholmieh
// Package:
package Components;

// Imports:
import java.util.function.Supplier;


// Node:
public class Node {
    // Variables (Declaration):
    // Pointer:
    private Node pointer;

    // Value:
    private Supplier<Boolean> value;

    // Constructor:
    public Node(Node pointer, Supplier<Boolean> value) {
        // Variables (Assignment):
        // Pointer:
        this.pointer = pointer;

        // Value:
        this.value = value;
    }

    // Getters:
    public Node get_pointer() {
        return this.pointer;
    }

    public Supplier<Boolean> get_value() {
        return this.value;
    }

    // Setters:
    public void set_pointer(Node pointer) {
        this.pointer = pointer;
    }

    public void set_value(Supplier<Boolean> value) {
        this.value = value;
    }

    // Methods:
    public boolean evaluate() {
        // Variables (Assignment):
        // Result:
        Boolean evaluation = value.get();

        // Logic:
        return evaluation.booleanValue();
    }
}