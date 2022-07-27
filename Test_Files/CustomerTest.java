import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Customer#Customer(String, int, double)}
     *   <li>{@link Customer#setName(String)}
     *   <li>{@link Customer#setAge(int)}
     *   <li>{@link Customer#setBalance(double)}
     *   <li>{@link Customer#getAge()}
     *   <li>{@link Customer#getBalance()}
     *   <li>{@link Customer#getName()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        Customer actualCustomer = new Customer("Name", 1, 10.0d);
        actualCustomer.setName("John");
        actualCustomer.setAge(2);
        actualCustomer.setBalance(10.2);
        assertEquals(2, actualCustomer.getAge());
        assertEquals(10.2d, actualCustomer.getBalance(), 0.0);
        assertEquals("John", actualCustomer.getName());
    }
}

