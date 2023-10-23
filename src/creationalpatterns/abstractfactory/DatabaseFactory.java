package creationalpatterns.abstractfactory;

public class DatabaseFactory implements AbstractDataFactory{
    @Override
    public Service createService() {
        return new DatabaseService();
    }

    @Override
    public Response createResponse() {
        return new DatabaseResponse();
    }
}
