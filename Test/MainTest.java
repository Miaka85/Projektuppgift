import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addCustomer() {

            CustomerRegistration customerRegistration = new CustomerRegistration();
            int start = customerRegistration.customers.size();
            customerRegistration.customers.add(new Customer("Joel","Ljungskile"));
            assertEquals(start + 1, customerRegistration.customers.size());

    }


    @Test
    void firstLetterToUpperCase_ChangeFirstLetterToUpperCaseTest() {

        String testInput = "mia";                                  //Tests that the first letter changes to upperCase
        String testResult = Main.firstLetterToUpperCase(testInput);
        assertEquals("Mia", testResult);

    }

    }
