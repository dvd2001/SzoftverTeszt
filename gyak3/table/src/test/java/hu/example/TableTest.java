package hu.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TableTest {
    private Table table1,table2;

    @BeforeEach
    void setUp() {
        table1 = new Table(60, 120,70);
        table2 = new Table(60, 120, 80, 75);
    }
    @Test
    void setHeightWorks(){
        table2.setHeight(65);
        int result = table2.getCurrentHeight();
        assertEquals(65, result);
    }
    @Test
    void setHeightNotAdjustable(){
        UnsupportedOperationException exeption = assertThrows(UnsupportedOperationException.class, ()->table1.setHeight(65));
        assertEquals("Table is not adjustable!", exeption.getMessage());
    }
    @Test
    void setHeightInvalidSize(){
        IllegalArgumentException exeption = assertThrows(IllegalArgumentException.class, ()->table2.setHeight(300));
        assertEquals("Height is not correct!", exeption.getMessage());
    }
    @Test
    void areaWorks(){
        int result = table1.area();
        assertEquals(7200, result);
    }
    @Test
    void capacityWorks(){
        int result = table1.getCapacity();
        assertEquals(6,result);
    }
    @Test
    void repaintWorks(){
        table1.repaint("Blue");
        String result = table1.getColor();
        assertEquals("Blue", result);
    }
    @Test
    void isStableOnTable1(){
        boolean result = table1.isStable();
        assertFalse(result);
    }
    @Test
    void isStableOnTable2(){
        boolean result = table2.isStable();
        assertTrue(result);
    }
    @Test
    void isFoldableOnTabel1(){
        boolean result = table1.isFoldable();
        assertFalse(result);
    }
    @Test
    void isFoldableOnTable2(){
        boolean result = table2.isFoldable();
        assertTrue(result);
    }
    @Test
    void perimeterWorks(){
        int result = table1.getPerimeter();
        assertEquals(360, result);
    }
}
