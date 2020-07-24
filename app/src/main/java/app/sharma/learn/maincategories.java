package app.sharma.learn;

public class maincategories {
    private String Title;
    private String videoId;
    private String context;

    public maincategories(String title, String videoId, String context) {
        Title = title;
        this.videoId = videoId;
        this.context = context;
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
