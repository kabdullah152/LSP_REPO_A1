package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {
	
	private IntegerSet integerSet;
	
	@BeforeEach
	public void setUp() {
		integerSet = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		assertEquals(0, integerSet.length());
		integerSet.add(1);
		assertEquals(1, integerSet.length());
		integerSet.clear();
		assertEquals(0, integerSet.length());
	};
	
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		assertEquals(0, integerSet.length());
		integerSet.add(5);
		assertEquals(1, integerSet.length());
		integerSet.remove(5);
		assertEquals(0, integerSet.length());
	};
	
	@Test
    @DisplayName("Test case for equals")
    public void testEquals() {
       IntegerSet tempSet = new IntegerSet();
       tempSet.add(1);
       integerSet.add(1);
       assertEquals(true, integerSet.equals(tempSet));
       integerSet.remove(1);
       assertEquals(false, integerSet.equals(tempSet));
       integerSet.add(1);
       integerSet.add(2);
       assertEquals(false, integerSet.equals(tempSet));
    };

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
    	assertEquals(false, integerSet.contains(1));
    	integerSet.add(1);
    	assertEquals(true, integerSet.contains(1));
    };
    
    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException{
    	integerSet.add(1);
    	integerSet.add(3);
    	integerSet.add(2);
    	assertEquals(3, integerSet.largest());
    };
    
    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException{
    	integerSet.add(1);
    	integerSet.add(3);
    	integerSet.add(2);
    	assertEquals(1, integerSet.smallest());
    };
    
    @Test
    @DisplayName("Test case for exception")
    public void testIntegerSetException() {
    	Throwable exception = assertThrows(IntegerSetException.class, () -> integerSet.largest());
        assertEquals("Set is empty!", exception.getMessage());
        Throwable exception2 = assertThrows(IntegerSetException.class, () -> integerSet.smallest());
        assertEquals("Set is empty!", exception2.getMessage());
    };
    
    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
    	assertEquals(false, integerSet.contains(3));
    	integerSet.add(3);
    	assertEquals(true, integerSet.contains(3));
    };
    
    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
    	integerSet.add(5);
    	integerSet.remove(2);
    	assertEquals(true, integerSet.contains(5));
    	integerSet.remove(5);
    	assertEquals(false, integerSet.contains(5));
    };
    
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
    	integerSet.add(1);
    	IntegerSet tempSet = new IntegerSet();
    	tempSet.add(2);
    	tempSet.add(5);
    	integerSet.union(tempSet);
    	assertEquals(true, integerSet.contains(1));
    	assertEquals(true, integerSet.contains(2));
    	assertEquals(true, integerSet.contains(5));
    	assertEquals(false, integerSet.contains(3));
    };
    
    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
    	IntegerSet tempSet = new IntegerSet();
    	integerSet.add(1);
    	tempSet.add(1);
    	tempSet.add(2);
    	integerSet.intersect(tempSet);
    	assertEquals(true, integerSet.contains(1));
    	assertEquals(false, integerSet.contains(2));
    };
    
    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
    	IntegerSet tempSet = new IntegerSet();
    	integerSet.add(1);
    	integerSet.add(2);
    	tempSet.add(1);
    	integerSet.diff(tempSet);
    	assertEquals(true, integerSet.contains(2));
    	assertEquals(false, integerSet.contains(1));
    };
    
    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
    	IntegerSet tempSet = new IntegerSet();
    	integerSet.add(1);
    	tempSet.add(2);
    	tempSet.add(1);
    	integerSet.complement(tempSet);
    	assertEquals(true, integerSet.contains(2));
    	assertEquals(false, integerSet.contains(1));
    };
    
    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
    	assertEquals(true, integerSet.isEmpty());
    	integerSet.add(1);
    	assertEquals(false, integerSet.isEmpty());
    };
    
    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
    	integerSet.add(1);
    	assertEquals("[1]", integerSet.toString());
    	integerSet.add(2);
    	assertEquals("[1, 2]", integerSet.toString());
    };
}
