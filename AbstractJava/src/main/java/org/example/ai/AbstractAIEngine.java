package org.example.ai;



// Q4 ✔ Abstract class implementing interface
public abstract class AbstractAIEngine implements AIModel {

    // shared STATE (only abstract class can do this)
    protected String engineName;

    // Q2 ✔ Abstract class constructor
    public AbstractAIEngine(String engineName) {
        this.engineName = engineName;
        System.out.println("AbstractAIEngine constructor called");
    }

    // Q3 ✔ Static method inside abstract class
    public static void printFrameworkInfo() {
        System.out.println("AI Framework v1.0");
    }

    // Template-like method controlling flow
    public final void process(int input) {
        validate(input);
        boolean result = predict(input); // from interface
        log(result);
    }

    private void validate(int input) {
        System.out.println("Validating input...");
    }

    // abstract method (forces subclass behavior)
    protected abstract void log(boolean result);

    // Q1 ✔ Main method in abstract class
    public static void main(String[] args) {
        System.out.println("Main method inside abstract class");
        printFrameworkInfo();
    }
}

