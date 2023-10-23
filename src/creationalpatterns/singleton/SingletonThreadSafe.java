package creationalpatterns.singleton;

public class SingletonThreadSafe {

    private  static  SingletonThreadSafe singletonThreadSafe;

    private SingletonThreadSafe(){

    }
    public static SingletonThreadSafe getInstance(){
        synchronized (SingletonThreadSafe.class)
        {
            if(singletonThreadSafe==null)
                singletonThreadSafe=new SingletonThreadSafe();
        }
        return singletonThreadSafe;
    }
}
