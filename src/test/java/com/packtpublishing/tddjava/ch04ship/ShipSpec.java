package com.packtpublishing.tddjava.ch04ship;

import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class ShipSpec {

    public void whenInstantiatedThenLocationIsSet() {
        Location location = new Location(new Point(21, 86), Direction.SOUTH);
        Ship ship = new Ship(location);
        assertEquals(ship.getLocation(), location);
    }
}
