package dogapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A minimal implementation of the BreedFetcher interface for testing purposes.
 * To avoid excessive calls to the real API, we can primarily test with a local
 * implementation that demonstrates the basic functionality of the interface.
 */
public class BreedFetcherForLocalTesting implements BreedFetcher {
    private int callCount = 0;

    @Override
    public List<String> getSubBreeds(String breed) {
        try {
            callCount++;
            if ("hound".equalsIgnoreCase(breed)) {
                return List.of("afghan", "basset");
            }
            throw new BreedNotFoundException(breed);
        } catch (BreedNotFoundException e) {
            return List.of();
        }
    }

    public int getCallCount() {
        return callCount;
    }
}
