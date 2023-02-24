package seminar2.task2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue;

    public Market() {
        queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " entered market");
        this.takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " standing in queue");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakingOrder) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " made order");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakingOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " took order");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakingOrder) {
                System.out.println(actor.getName() + " left queue");
                releasedActors.add(actor);
            }
        }
        this.releaseFromMarket(releasedActors);
    }

    @Override
    public void releaseFromMarket(List<Actor> releasedActors) {
        for (Actor actor : releasedActors) {
            System.out.println(actor.getName() + " left market");
            this.queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
