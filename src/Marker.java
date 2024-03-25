import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Marker implements QueueBehaviour, MarketBehaviour{

    private List<Actor> marketVisitor;
    private ArrayDeque<Actor> queueInMarker;

    public Marker() {
        this.marketVisitor = new ArrayList<>();
        this.queueInMarker = new ArrayDeque<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(String.format("Посетитель  %s зашел в магазин", actor.name));
        this.marketVisitor.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.forEach(actor -> System.out.println(String.format("Посетитель  %s уходит из магазина", actor.name)));
        marketVisitor.removeAll(actors);
    }

    @Override
    public void update() {
        for (Actor visitor:marketVisitor) {
            System.out.println("Чиcло посетителей в магазине: " + marketVisitor.size());
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
        Actor actor = queueInMarker.removeFirst();
        System.out.println(String.format("Посетитель  %s выходит из очереди магазина", actor.name));
        releaseFromMarket(List.of(actor));
    }

}
