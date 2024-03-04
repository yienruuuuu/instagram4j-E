package com.github.instagram4j.instagram4j.models.media.timeline;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.instagram4j.instagram4j.models.location.Location;
import com.github.instagram4j.instagram4j.models.media.Media;
import com.github.instagram4j.instagram4j.models.media.UserTags;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonTypeInfo(defaultImpl = Media.class, use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY, property = "media_type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TimelineImageMedia.class),
        @JsonSubTypes.Type(value = TimelineVideoMedia.class),
        @JsonSubTypes.Type(value = TimelineCarouselMedia.class)
})
public class TimelineMedia extends Media {
    //preview_comments目前已是空陣列
    private List<Comment> preview_comments;
    private boolean has_liked;
    private long taken_at;
    private long pk;
    private String id;
    private int play_count;
    private int fb_play_count;
    private int like_count;
    private int fb_like_count;
    private int reshare_count;
    private int comment_count;
    private int number_of_qualities;
    private Location location;
    private UserTags usertags;
}
