package com.github.instagram4j.instagram4j.actions.feed;

import com.github.instagram4j.instagram4j.IGClient;
import com.github.instagram4j.instagram4j.requests.IGPaginatedRequest;
import com.github.instagram4j.instagram4j.requests.IGRequest;
import com.github.instagram4j.instagram4j.responses.IGPaginatedResponse;
import com.github.instagram4j.instagram4j.responses.IGResponse;

public class FeedIterator<T extends IGRequest<R> & IGPaginatedRequest, R extends IGResponse & IGPaginatedResponse>
        extends CursorIterator<IGRequest<R>, R> {

    public FeedIterator(IGClient client, T t) {
        super(client, t, (request, id) -> t.setMax_id(id), IGPaginatedResponse::getNext_min_id, IGPaginatedResponse::isMore_available);
    }

}
