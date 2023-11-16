package hw;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.*;

public class VehicleTest {

    public static void main(String[] args) {
        

        @Test
        void testCar() {
            Car car = new Car(null, null, 0);
            assertThat(car, instanceof(Vehicle.class));
        }

        @ParameterizedTest
        void testWheelCar() {
            Car car = new Car(null, null, 0);
            assertThat(car.getNumWheels()).isEqualTo(4);
        }

        @ParameterizedTest
        void testWheelMotorcycle() {
            Motorcycle moto = new Motorcycle(null, null, 0);
            assertThat(moto.getNumWheels()).isEqualTo(2);
        }

        @Test
        void testSpeedCar() {
            Car car = new Car(null, null, 0);
            car.testDrive();
            assertThat(car.getSpeed()).isEqualTo(60);
        }

        @Test
        void testSpeedMotorcycle() {
            Motorcycle moto = new Motorcycle(null, null, 0);
            moto.testDrive();
            assertThat(car.getSpeed()).isEqualTo(75);
        }

        @Test
        void testStopCar() {
            Car car = new Car(null, null, 0);
            car.testDrive();
            car.park();
            assertThat(car.getSpeed()).isEqualTo(0);
        }

        @Test
        void testStopMotorcycle() {
            Motorcycle moto = new Motorcycle(null, null, 0);
            moto.testDrive();
            moto.park();
            assertThat(car.getSpeed()).isEqualTo(0);
        }
    }
}
