import java.util.regex.*;

/**
 * Created by Owner on 2017-02-23.
 */
public class EmailValidator {
    private Pattern regex;

    public EmailValidator() {
        getValidPattern();
    }

    private void getValidPattern() {
        regex = Pattern.compile(".*(@).*\\.com");
    }

    public boolean validate(String email) {
        return regex.matcher(email).matches();
    }
}
