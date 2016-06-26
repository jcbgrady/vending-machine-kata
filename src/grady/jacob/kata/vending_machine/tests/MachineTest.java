package grady.jacob.kata.vending_machine.tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import grady.jacob.kata.vending_machine.main.Machine;

public class MachineTest {

	private Machine Machine = new Machine();

	private ArrayList<Double> pennyValues = new ArrayList<Double>();
	private ArrayList<Double> nickelValues = new ArrayList<Double>();
	private ArrayList<Double> dimeValues = new ArrayList<Double>();
	private ArrayList<Double> quarterValues = new ArrayList<Double>();
	
	public MachineTest() {
		this.pennyValues = new ArrayList<Double>(Arrays.asList(2.5, 19.05, 1.52));
		this.nickelValues = new ArrayList<Double>(Arrays.asList(5.0, 21.21, 1.95));
		this.dimeValues = new ArrayList<Double>(Arrays.asList(2.268, 17.91, 1.35));
		this.quarterValues = new ArrayList<Double>(Arrays.asList(5.67, 24.26, 1.75));
	}
	
	@Test
	public void machineDisplaysDefaultMessage() {
		String expected = "INSERT COIN";
		String actual = this.Machine.getDisplayMessage();
		assertEquals(expected, actual);
	}

	@Test
	public void machineAcceptsCoinNickel() {
		String expected = "0.05";
		String actual = Machine.insertCoin(this.nickelValues);
		assertEquals(expected, actual);
	}

	@Test
	public void machineAcceptsCoinDime() {
		String expected = "0.10";
		String actual = Machine.insertCoin(this.dimeValues);
		assertEquals(expected, actual);
	}

	@Test
	public void machineAcceptsCoinQuarter() {
		String expected = "0.25";
		String actual = Machine.insertCoin(this.quarterValues);
		assertEquals(expected, actual);
	}
	
	@Test
	public void machineRejectsCoinPenny() {
		String expected = "INSERT COIN";
		String actual = Machine.insertCoin(this.pennyValues);
		assertEquals(expected, actual);
	}
	
	@Test
	public void machineAddsCoinAmountToCurrentAmount() {
		this.Machine.insertCoin(this.nickelValues);
		this.Machine.insertCoin(this.dimeValues);
		
		BigDecimal expected = new BigDecimal("0.15");
		BigDecimal actual = this.Machine.getCurrentAmount();
		assertEquals(expected, actual);
	}
	
	@Test
	public void machineDisplayIsUpdated() {
		this.machineAddsCoinAmountToCurrentAmount();
		
		String expected = "0.15";
		String actual = this.Machine.getDisplayMessage();
		assertEquals(expected, actual);
	}
}
