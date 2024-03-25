public class Main {

    public static void main(String[] args) {
        Human visitor1 = new Human("Dima");
        Human visitor2 = new Human("Natasha");
        Human visitor3 = new Human("Sasha");
        Marker marker = new Marker();

        marker.acceptToMarket(visitor1);
        marker.acceptToMarket(visitor2);
        marker.acceptToMarket(visitor3);
        marker.update();

    }
}
