package org.example;

public class Greetings {
    private Welcome welcome;

    public Welcome getWelcome() {
        return welcome;
    }

    public void setWelcome(Welcome welcome) {
        this.welcome = welcome;
    }

    public void getMessage() {
        System.out.println(welcome);
    }
}
