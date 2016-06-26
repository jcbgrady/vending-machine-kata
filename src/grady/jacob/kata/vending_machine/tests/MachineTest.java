package grady.jacob.kata.vending_machine.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import grady.jacob.kata.vending_machine.main.Machine;

public class MachineTest {

	@Test
	public void machineAcceptsCoinNickel() {
		ArrayList<Double> nickelValues = new ArrayList<Double>(Arrays.asList(5.0, 21.21, 1.95));
		
		Machine Machine = new Machine();
		
		assertTrue(Machine.insertCoin(nickelValues));
		
	}
}
