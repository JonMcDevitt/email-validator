import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Owner on 2017-02-23.
 */
public class EmailValidatorTest {
    private EmailValidator validator;

    @Before
    public void setUp() throws Exception {
        validator = new EmailValidator();
    }

    @Test
    public void validate() throws Exception {
        assertTrue(validator.validate("first-test-email@email.com"));
        assertFalse(validator.validate("some random string of characters"));
    }

}