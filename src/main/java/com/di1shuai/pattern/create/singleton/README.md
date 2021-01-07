### 单例模式

> 定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method使一个类的实例化延迟到其子类。

一个类**有且只有**一个实例

1. 单例模式的"单"字的写法
- 饿汉（静态成员）

```java
public class SingletonSafe {

		//重要
    private static SingletonSafe instance = new SingletonSafe();

    private SingletonSafe() {
    }

    public static SingletonSafe getInstance(){
        return instance;
    }

}
```

优点：线程安全

缺点：没使用到，会浪费内存，启动会影响速度

- **~~懒加载(线程不安全)~~**

```java
public class SingletonLazyNotSafe {

    private static SingletonLazyNotSafe instance;

    private SingletonLazyNotSafe() {

    }

    public static SingletonLazyNotSafe getInstance() {
        if (instance == null) {
            //多线程情况下可能产生多个
            instance = new SingletonLazyNotSafe();
        }
        return instance;
    }

}
```

优点：懒加载

缺点：线程不安全

- **~~懒加载-Synchronized~~**

```java
public class SingletonLazySynchronized {

    private static SingletonLazySynchronized instance;

    private SingletonLazySynchronized() {

    }

    public static synchronized SingletonLazySynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonLazySynchronized();
        }
        return instance;
    }

}
```

优点：懒加载、线程安全

缺点：同步了整个方法，效率降低

- **懒加载-DCL （Double Check Lock）**

```java
public class SingletonLazyDCL {

    private static volatile SingletonLazyDCL instance;

    private SingletonLazyDCL() {

    }

    public static SingletonLazyDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyDCL.class) {
                if (instance == null) {
                    instance = new SingletonLazyDCL();
                }
            }
        }
        return instance;
    }

}
```

优点：线程安全、懒加载、高效

缺点：反射可破

- **枚举(推荐)**

```java
public class SingletonEnum {

    private SingletonEnum(){

    }

    enum Singleton{
        INSTANCE;

        private final SingletonEnum instance;

        Singleton(){
            instance = new SingletonEnum();
        }

        private SingletonEnum getInstance(){
            return instance;
        }

    }

    public static SingletonEnum getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

}
```

优点：避免了反射问题
