package ro.ase.acs.proxy;

public interface AuthenticationService {
    boolean login(String username, String password);
}
