package mao.gui.dong.spring.aop.jdk.service;

/**
 * ้ๆไปฃ็
 * @author maoguidong
 */
public  class ProxyAnimal implements Animals {

    private Animals animal;

    public ProxyAnimal(Animals animal) {
        this.animal = animal;
    }

    @Override
    public void call() {
        animal.call();
    }

    @Override
    public void eat() {

    }
}
