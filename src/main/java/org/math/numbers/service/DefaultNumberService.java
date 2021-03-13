package org.math.numbers.service;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Default Number Service Implementation.
 * Created by hariharank12 on 13/03/21.
 */
@Service
public class DefaultNumberService implements NumberService {
    /**
     * Write a method in Java8+, such that the method generates a sequence of numbers
     * between 1 and 1000 inclusive.
     * It then keeps only the ones which are multiples of 3 or 5 and then squares them.
     * It returns the first 10 numbers from the series.
     */
    @Override
    public Map<String, Object> getNumbers() {
        Instant startTime = Instant.now();
        List<Integer> result = IntStream.rangeClosed(1, 1000)
                .filter(e -> (e % 3 == 0 || e % 5 == 0))
                .map(e -> e * e)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        Instant endTime = Instant.now();
        Map<String, Object> response = new HashMap<>();
        response.put("data", result);
        response.put("time_taken in milli seconds", Duration.between(startTime, endTime).toMillis());
        response.put("time_taken in nano seconds", Duration.between(startTime, endTime).getNano());
        return response;
    }
}
