import java.util.ArrayList;
import java.util.List;

public class Marker implements QueueBehaviour, MarketBehaviour{
    private List<Actor> listActorsInQueue;


    public Marker() {
        this.listActorsInQueue = new ArrayList<>();
    }


    /**
     * Добавляет покупателя в магазин
     * @param actor
     */
    @Override
    public void acceptToMarket(Actor actor) {

    }

    /**
     * Выход из маркета
     * @param actors
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {

    }


    /**
     * Встает в очередь
     * @param actor
     */
    @Override
    public void takeInQueue(Actor actor) {
        listActors.add(actor);
    }

    /**
     * Делает заказ
     */
    @Override
    public void takeOrders() {

    }

    //получает заказ
    @Override
    public void giveOrders() {

    }

    //выход из очереди
    @Override
    public void releaseFromQueue() {

    }


    @Override
    public void update() {

    }
}
