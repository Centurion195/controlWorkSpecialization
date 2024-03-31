import animals.Animal;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    @Getter
    private static List<Animal> animals;

    static {
        animals = new ArrayList<>();
    }
}
