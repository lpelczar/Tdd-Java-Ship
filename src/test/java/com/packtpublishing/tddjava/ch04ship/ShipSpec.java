package com.packtpublishing.tddjava.ch04ship;

import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class ShipSpec {

    private Ship ship;
    private Location location;

    @BeforeMethod
    public void beforeTest() {
        location = new Location(new Point(21, 86), Direction.SOUTH);
        ship = new Ship(location);
    }

    public void whenInstantiatedThenLocationIsSet() {
        assertEquals(ship.getLocation(), location);
    }

    public void whenMoveForwardThenForward() {
        Location expected = location.copy();
        expected.forward();
        ship.moveForward();
        assertEquals(ship.getLocation(), expected);
    }

    public void whenMoveBackwardThenBackward() {
        Location expected = location.copy();
        expected.backward();
        ship.moveBackward();
        assertEquals(ship.getLocation(), expected);
    }

    public void whenTurnLeftThenTurnLeft() {
        Location expected = location.copy();
        expected.turnLeft();
        ship.turnLeft();
        assertEquals(ship.getLocation(), expected);
    }
}
