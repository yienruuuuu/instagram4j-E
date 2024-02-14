package com.github.instagram4j.instagram4j.responses.feed;

import java.util.List;
import com.github.instagram4j.instagram4j.models.user.Profile;
import com.github.instagram4j.instagram4j.responses.IGPaginatedResponse;
import com.github.instagram4j.instagram4j.responses.IGResponse;
import lombok.Data;

@Data
public class FeedUsersResponse extends IGResponse implements IGPaginatedResponse {
    private List<Profile> users;
    private String next_max_id;
    private String next_min_id;

    public String getNextPaginationId() {
        return next_max_id != null ? next_max_id : next_min_id;
    }

    public boolean shouldUseMaxId() {
        return next_max_id != null;
    }

    public boolean isMore_available() {
        return getNextPaginationId() != null;
    }
}
