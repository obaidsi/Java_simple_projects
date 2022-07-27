public class Customer {
    private String name;
    private int age;
    private double balance;

    /**
     * Full Constructor for Customer
     * @param name name of the customer
     * @param age   age of the customer
     * @param balance   balance of the customer
     */
    public Customer(String name, int age, double balance){
        this.name    = name;
        this.age     = age;
        this.balance = balance;
    }

    /**
     * Retrieves the customer name
     * @return  this customer's name
     */
    public String getName(){return name;}

    /**
     * Retrieves the customer age
     * @return  return this customer's age
     */
    public int getAge(){ return age;}

    /**
     * Retrieves the customer balance
     * @return  return this customer's balance
     */
    public double getBalance(){ return balance;}

    /**
     * Update this customer's name
     * @param name  the new name for customer
     */
    public void setName(String name){ this.name = name; }

    /**
     * Update this customers age
     * @param age   the new age for the customer
     */

    public void setAge(int age){ this.age = age; }

    /**
     * Update the customer's balance
     * @param balance new balance for the customer
     */

    public void setBalance(double balance){ this.balance = balance; }

    /**
     * Represent the state of the customer in string form
     * @return   a string representation of the customer's state
     */
    public String toString(){
        String custInfo = "";
        custInfo += "Customer name      : " + name + "\n";
        custInfo += "Customer age       : " + age  + "\n";
        custInfo += "Customer balance   : $" + String.format("%, .2f\n", balance);
        return custInfo;
    }

}
