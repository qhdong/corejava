package v1ch06.interfaces;

public interface Powered extends Moveable {
    double SPEED_LIMIT = 95;
    double milesPerGallon();
    default boolean isOverSpeed() {
        return milesPerGallon() > SPEED_LIMIT;
    }
}
