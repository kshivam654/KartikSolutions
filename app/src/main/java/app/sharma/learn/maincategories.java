package app.sharma.learn;

import java.lang.reflect.Array;
import java.util.List;

public class maincategories {
    private String Title;
    private String videoId;
    private String context;
private List<maincategories> subtopic;

    public List<maincategories> getSubtopic() {
        return subtopic;
    }

    public void setSubtopic(List<maincategories> subtopic) {
        this.subtopic = subtopic;
    }

    public maincategories(String title, String videoId, String context, List<maincategories> subtopic) {
        Title = title;
        this.videoId = videoId;
        this.context = context;
        this.subtopic = subtopic;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
