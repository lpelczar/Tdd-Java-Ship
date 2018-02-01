package com.packtpublishing.tddjava.ch04ship;

import java.lang.reflect.Array;

public class Ship {

    private Location location;

    Ship(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public boolean moveForward() {
        return location.forward();
    }

    public boolean moveBackward() {
        return location.backward();
    }

    public void turnLeft() {
        location.turnLeft();
    }

    public void turnRight() {
        location.turnRight();
    }

    public void receiveCommands(String commands) {
        char[] commandsArray = commands.toCharArray();
        for (char command : commandsArray) {
            switch (command) {
                case 'f':
                    location.forward();
                    break;
                case 'b':
                    location.backward();
                    break;
                case 'l':
                    location.turnLeft();
                    break;
                case 'r':
                    location.turnRight();
                    break;
            }
        }
    }
}
