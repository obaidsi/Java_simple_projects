import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PizzaTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Pizza#Pizza(Pizza.PizzaType, Pizza.PizzaSize)}
     *   <li>{@link Pizza#setSize(Pizza.PizzaSize)}
     *   <li>{@link Pizza#setSpecInstruct(String)}
     *   <li>{@link Pizza#setThinCrust(boolean)}
     *   <li>{@link Pizza#setType(Pizza.PizzaType)}
     *   <li>{@link Pizza#getSize()}
     *   <li>{@link Pizza#getSpecInstruct()}
     *   <li>{@link Pizza#getThinCrust()}
     *   <li>{@link Pizza#getType()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Pizza actualPizza = new Pizza(Pizza.PizzaType.CHEESE, Pizza.PizzaSize.SMALL);
        actualPizza.setSize(Pizza.PizzaSize.SMALL);
        actualPizza.setSpecInstruct("Spec Instruct");
        actualPizza.setThinCrust(true);
        actualPizza.setType(Pizza.PizzaType.CHEESE);
        assertEquals(Pizza.PizzaSize.SMALL, actualPizza.getSize());
        assertEquals("Spec Instruct", actualPizza.getSpecInstruct());
        assertTrue(actualPizza.getThinCrust());
        assertEquals(Pizza.PizzaType.CHEESE, actualPizza.getType());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Pizza#Pizza(Pizza.PizzaType, Pizza.PizzaSize, boolean, String)}
     *   <li>{@link Pizza#setSize(Pizza.PizzaSize)}
     *   <li>{@link Pizza#setSpecInstruct(String)}
     *   <li>{@link Pizza#setThinCrust(boolean)}
     *   <li>{@link Pizza#setType(Pizza.PizzaType)}
     *   <li>{@link Pizza#getSize()}
     *   <li>{@link Pizza#getSpecInstruct()}
     *   <li>{@link Pizza#getThinCrust()}
     *   <li>{@link Pizza#getType()}
     * </ul>
     */
    @Test
    public void testConstructor2() {
        Pizza actualPizza = new Pizza(Pizza.PizzaType.CHEESE, Pizza.PizzaSize.SMALL, true, "Spec Instruct");
        actualPizza.setSize(Pizza.PizzaSize.SMALL);
        actualPizza.setSpecInstruct("Spec Instruct");
        actualPizza.setThinCrust(true);
        actualPizza.setType(Pizza.PizzaType.CHEESE);
        assertEquals(Pizza.PizzaSize.SMALL, actualPizza.getSize());
        assertEquals("Spec Instruct", actualPizza.getSpecInstruct());
        assertTrue(actualPizza.getThinCrust());
        assertEquals(Pizza.PizzaType.CHEESE, actualPizza.getType());
    }

    /**
     * Method under test: {@link Pizza#Pizza()}
     */
    @Test
    public void testConstructor3() {
        Pizza actualPizza = new Pizza();
        assertEquals(Pizza.PizzaType.VEGGIE, actualPizza.getType());
        assertFalse(actualPizza.getThinCrust());
        assertEquals("", actualPizza.getSpecInstruct());
        assertEquals(Pizza.PizzaSize.LARGE, actualPizza.getSize());
    }

    /**
     * Method under test: {@link Pizza#getArea()}
     */
    @Test
    public void testGetArea() {
        assertEquals(201.056d, (new Pizza()).getArea(), 0.0);
        assertEquals(63.615375d, (new Pizza(Pizza.PizzaType.CHEESE, Pizza.PizzaSize.SMALL)).getArea(), 0.0);
        assertEquals(113.09400000000001d, (new Pizza(Pizza.PizzaType.CHEESE, Pizza.PizzaSize.MEDIUM)).getArea(), 0.0);
        assertEquals(254.4615d, (new Pizza(Pizza.PizzaType.CHEESE, Pizza.PizzaSize.XL)).getArea(), 0.0);
    }

    /**
     * Method under test: {@link Pizza#toString()}
     */
    @Test
    public void testToString() {
        assertEquals("Pizza Type: VEGGIE\nPizza Size: LARGE\nPizza ThinCrust: NO\nPizza special Instruction: \n",
                (new Pizza()).toString());
        assertEquals("Pizza Type: CHEESE\nPizza Size: SMALL\nPizza ThinCrust: Yes\nPizza special Instruction: NO\n",
                (new Pizza(Pizza.PizzaType.CHEESE, Pizza.PizzaSize.SMALL, true, "NO")).toString());
    }
}

