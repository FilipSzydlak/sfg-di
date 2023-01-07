package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBeen {

    public SingletonBeen() {
        System.out.println("Creating a Singleton Been!!!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
