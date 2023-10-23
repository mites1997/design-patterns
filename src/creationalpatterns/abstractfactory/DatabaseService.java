package creationalpatterns.abstractfactory;

public class DatabaseService implements Service{
    @Override
    public String runService() {
        return "Databasse service running";
    }
}
