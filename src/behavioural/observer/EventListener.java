package behavioural.observer;

public interface EventListener {
  void notify(String eventType, String file);
}
