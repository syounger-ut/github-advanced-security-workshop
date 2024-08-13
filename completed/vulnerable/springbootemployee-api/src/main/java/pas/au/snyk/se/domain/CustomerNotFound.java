package pas.au.snyk.se.domain;

public class CustomerNotFound extends RuntimeException
{
    public CustomerNotFound(Long id) {
        super("Could not find Customer with id # " + id);
    }

}
