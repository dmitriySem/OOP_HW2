import java.util.ArrayList;
import java.util.List;

public interface MarketBehaviour {



    /**
     * Добавляет покупателя в магазин
     * @param actor
     */
    void acceptToMarket(Actor actor);

    /**
     * Выход из маркета
     * @param actors
     */
    void releaseFromMarket(List<Actor> actors);

    void update();
}
