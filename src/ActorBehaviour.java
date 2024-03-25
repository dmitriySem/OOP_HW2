public interface ActorBehaviour {

    boolean isMakeOrder = false;
    boolean isTakeOrder = false;

    void setMakeOrder(boolean isMakeOrder);
    boolean  isMakeOrder();

    void setTakeOrder(boolean isTakeOrder);
    boolean isTakeOrder();
}
