package creationalpatterns.abstractfactory;

public interface AbstractDataFactory {
    Service createService();
    Response createResponse();
}
