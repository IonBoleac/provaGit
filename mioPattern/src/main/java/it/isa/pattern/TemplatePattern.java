package it.isa.pattern;


abstract class Engine{
    abstract void init();
    abstract void start();
    abstract void stop();

    public final void turnOn(){
        init();
        start();
        stop();
    }
}

class Rocket extends Engine{

    @Override
    void init() {
        // TODO Auto-generated method stub
        System.out.println("Init rocket");
        
    }

    @Override
    void start() {
        // TODO Auto-generated method stub
        System.out.println("Start rocket");
    }

    @Override
    void stop() {
        // TODO Auto-generated method stub
        System.out.println("Stop rocket");
    }

}

class Car extends Engine{

    @Override
    void init() {
        // TODO Auto-generated method stub
        System.out.println("Init Car");
    }

    @Override
    void start() {
        // TODO Auto-generated method stub
        System.out.println("Start Car");
    }

    @Override
    void stop() {
        // TODO Auto-generated method stub
        System.out.println("Stop Car");
    }

}


public class TemplatePattern{
    public static void esegui(){
        System.out.println("Template pattern");
        Engine e = new Rocket();
        e.turnOn();

        e = new Car();
        e.turnOn();
    }
}
