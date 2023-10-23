package creationalpatterns.abstractfactory;

public class NetworkFactory implements AbstractDataFactory{
    @Override
    public Service createService() {
        return new NetworkService();
    }

    @Override
    public Response createResponse() {
        return new DatabaseResponse();
    }
}
