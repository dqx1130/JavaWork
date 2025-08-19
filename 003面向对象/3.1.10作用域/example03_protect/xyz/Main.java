package xyz;

import abc.Hello;

public class Main extends Hello {
    void foo(){
        // 可以访问protected方法:
        hi();
    }
}
