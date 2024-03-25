import java.util.ArrayList;
import java.util.List;

public interface QueueBehaviour {

    List<Actor> ListOfActorInQueue = new ArrayList<>();

    /**
     * Встает в очередь
     * @param actor
     */
    void takeInQueue(Actor actor);

    /**
     * Делает заказ
     */
    void takeOrders();

    /**
     * Получает заказ
     */
    void giveOrders();

    /**
     * Выход из очереди
     */
    void releaseFromQueue();


}
