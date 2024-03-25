import java.util.ArrayDeque;

public class Marker implements QueueBehaviour, MarketBehaviour{

    private ArrayDeque<Actor> queueInMarker;

    public Marker() {
        this.queueInMarker = new ArrayDeque<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(String.format("Посетитель  %s зашел в магазин", actor.name));
        this.queueInMarker.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        System.out.println(String.format("Посетитель  %s уходит из магазина", actor.name));
    }

    @Override
    public void update() {
        for (Actor visitor:queueInMarker) {
            takeInQueue(visitor);
            takeOrders();
            releaseFromQueue();
        }
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(String.format("Посетитель  %s встает в очередь магазина", actor.name));
        this.queueInMarker.add(actor);
    }

    @Override
    public void takeOrders() {
        Actor first = queueInMarker.getFirst();
        if (!first.isMakeOrder()){
            System.out.println(String.format("Посетитель  %s делает заказ", first.name));
            first.setMakeOrder(true);
        }
        giveOrders();
    }

    @Override
    public void giveOrders() {
        Actor first = queueInMarker.getFirst();
        if (!first.isTakeOrder()){
            System.out.println(String.format("Посетитель  %s получает заказ", first.name));
            first.setTakeOrder(true);
        }
    }

    @Override
    public void releaseFromQueue() {
        Actor actor = queueInMarker.pop();
        System.out.println(String.format("Посетитель  %s выходит из очереди магазина", actor.name));
        releaseFromMarket(actor);
    }

}
