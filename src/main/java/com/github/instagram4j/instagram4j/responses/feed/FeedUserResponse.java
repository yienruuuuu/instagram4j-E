package com.github.instagram4j.instagram4j.responses.feed;

import com.github.instagram4j.instagram4j.models.media.timeline.TimelineMedia;
import com.github.instagram4j.instagram4j.responses.IGPaginatedResponse;
import com.github.instagram4j.instagram4j.responses.IGResponse;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Data
public class FeedUserResponse extends IGResponse implements IGPaginatedResponse {
    private List<TimelineMedia> items;
    private String next_min_id;
    private String next_max_id;
    private int num_results;

    public boolean isMore_available() {
        return StringUtils.isNotEmpty(next_min_id) || StringUtils.isNotEmpty(next_max_id);
    }
}
