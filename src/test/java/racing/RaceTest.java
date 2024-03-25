package racing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class RaceTest {

    @Test
    void move() {
        // given
        Car vectorCar = new Car("vector");
        Car sageCar = new Car("sage");
        NumberGenerator generator = new StubNumberGenerator(7);
        Race race = new Race(generator, List.of(vectorCar, sageCar));

        // when
        race.move();

        // then
        assertAll(
                () -> assertThat(vectorCar.getPosition()).isEqualTo(1),
                () -> assertThat(sageCar.getPosition()).isEqualTo(1)
        );
    }

    @Test
    void moveFail() {
        // given
        Car vectorCar = new Car("vector");
        Car sageCar = new Car("sage");
        NumberGenerator generator = new StubNumberGenerator(0);
        Race race = new Race(generator, List.of(vectorCar, sageCar));

        // when
        race.move();

        // then
        assertAll(
                () -> assertThat(vectorCar.getPosition()).isEqualTo(0),
                () -> assertThat(sageCar.getPosition()).isEqualTo(0)
        );
    }

    @Test
    void names() {
        // given
        NumberGenerator generator = new StubNumberGenerator(0);
        Race race = new Race(generator, "vector,sage");

        // when
        List<String> names = race.getCars().stream().map(Car::getName).collect(Collectors.toList());

        // then
        assertThat(names).containsExactlyInAnyOrder("vector", "sage");
    }

    @Test
    void winners() {
        // given
        Car vectorCar = new Car("vector");
        Car sageCar = new Car("sage");
        Car amberCar = new Car("amber");
        NumberGenerator generator = new StubNumberGenerator(0);
        Race race = new Race(generator, List.of(vectorCar, sageCar, amberCar));

        // when
        sageCar.move(7);
        List<String> winners = race.winners();

        // then
        assertThat(winners).containsExactlyInAnyOrder("sage");
    }

    @Test
    void winners2() {
        // given
        Car vectorCar = new Car("vector");
        Car sageCar = new Car("sage");
        Car amberCar = new Car("amber");
        NumberGenerator generator = new StubNumberGenerator(0);
        Race race = new Race(generator, List.of(vectorCar, sageCar, amberCar));

        // when
        sageCar.move(7);
        amberCar.move(7);
        List<String> winners = race.winners();

        // then
        assertThat(winners).containsExactlyInAnyOrder("sage", "amber");
    }

    @Test
    void winners3() {
        // given
        Car vectorCar = new Car("vector");
        Car sageCar = new Car("sage");
        Car amberCar = new Car("amber");
        NumberGenerator generator = new StubNumberGenerator(0);
        Race race = new Race(generator, List.of(vectorCar, sageCar, amberCar));

        // when
        race.move();
        List<String> winners = race.winners();

        // then
        assertThat(winners).containsExactlyInAnyOrder("sage", "amber", "vector");
    }
}
