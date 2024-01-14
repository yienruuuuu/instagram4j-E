package com.github.instagram4j.instagram4j.responses.media;

import com.github.instagram4j.instagram4j.models.media.reel.ResponderInfo;
import com.github.instagram4j.instagram4j.responses.IGPaginatedResponse;
import com.github.instagram4j.instagram4j.responses.IGResponse;
import lombok.Data;

@Data
public class MediaGetStoryQuestionResponsesResponse extends IGResponse implements IGPaginatedResponse {
    private ResponderInfo responder_info;

    @Override
    public String getNext_min_id() {
        return this.responder_info.getMax_id();
    }

    @Override
    public boolean isMore_available() {
        return this.responder_info.isMore_available();
    }
}
