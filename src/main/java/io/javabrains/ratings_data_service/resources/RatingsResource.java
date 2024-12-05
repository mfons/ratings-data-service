package io.javabrains.ratings_data_service.resources;

import io.javabrains.ratings_data_service.models.Rating;
import io.javabrains.ratings_data_service.models.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRatingsData(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRatings getRatingsDataByUserId(@PathVariable("userId") String userId) {
        return (
                new UserRatings(
                        Arrays.asList(
                                new Rating("100", 4),
                                new Rating("200", 3)
                        )
                ));
    }
}
