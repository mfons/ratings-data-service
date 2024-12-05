package io.javabrains.ratings_data_service.models;

import java.util.List;

public record UserRatings (List<Rating> ratings) {
}
