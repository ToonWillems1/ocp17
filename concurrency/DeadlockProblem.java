package concurrency;

import java.util.concurrent.Executors;

class Food {}
class Water {}

public record DeadlockProblem(String name) {
    public void eatAndDrink(Food food, Water water) {
        synchronized(food) {
            System.out.println(name() + " Got food!");
            move();
            synchronized(water){
                System.out.println(name() + " Got water!");
            }
        }
    }
    public void drinkAndEat(Food food, Water water){
        synchronized(water) {
            System.out.println(name() + " Got water!");
            move();
            synchronized(food) {
                System.out.println(name() + " Got food!");
            }
        }
    }
    public void move() {
        try { Thread.sleep(100);} catch (InterruptedException e) {}
    }
    public static void main(String[] args) {
        var foxy = new DeadlockProblem("Foxy");
        var tails = new DeadlockProblem("Tails");
        var food = new Food();
        var water = new Water();

        var service = Executors.newScheduledThreadPool(10);
        try {
            service.submit(() -> foxy.eatAndDrink(food, water));
            service.submit(() -> tails.drinkAndEat(food, water));
        } finally{
            service.shutdown();
        }
    }
}
