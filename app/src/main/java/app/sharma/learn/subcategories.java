package app.sharma.learn;

public class subcategories {
    private String title;
    private String context;
    private String videoId;

    public subcategories(String title, String context, String videoId) {
        this.title = title;
        this.context = context;
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
