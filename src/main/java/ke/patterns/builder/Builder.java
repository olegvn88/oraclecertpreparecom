package ke.patterns.builder;

import ke.patterns.builder.cars.Type;
import ke.patterns.builder.components.Engine;
import ke.patterns.builder.components.GPSNavigator;
import ke.patterns.builder.components.Transmission;
import ke.patterns.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}