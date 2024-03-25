import java.util.List;

public interface QueueBehaviour {

    List<Actor> ListOfActorInQueue = null;

    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();


}
