package vu.lt.services;

import org.apache.deltaspike.core.api.future.Futureable;

import javax.ejb.AsyncResult;
import javax.enterprise.context.ApplicationScoped;
import java.util.Random;
import java.util.concurrent.Future;
import javax.enterprise.inject.Specializes;

@ApplicationScoped
@Specializes
public class SpecializedJerseyNumberGenerator extends JerseyNumberGenerator {
    @Futureable
    public Future<Integer> generateJerseyNumber() {
        try {
            Thread.sleep(1000); // Simulate intensive work
        } catch (InterruptedException e) {
        }
        final Integer generatedJerseyNumber = new Random().nextInt(10 + 1) + 10;
        //from 10 to 20
        System.out.println("Called class SpecializedJerseyNumberGenerator" );
        return new AsyncResult<>(generatedJerseyNumber);
    }
}
