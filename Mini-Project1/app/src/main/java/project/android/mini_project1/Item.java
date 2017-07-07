package project.android.mini_project1;

public class Item {

    int propImg;
    String name;
    String date;
    int content;
    int likeCCount;
    String replyCount;
    int contentImg;

    public Item(){};

    public Item(int propImg, String name, String date, int content, int likeCCount, String replyCount, int contentImg) {
        this.propImg = propImg;
        this.name = name;
        this.date = date;
        this.content = content;
        this.likeCCount = likeCCount;
        this.replyCount = replyCount;
        this.contentImg = contentImg;
    }

    public int getPropImg() {
        return propImg;
    }

    public void setPropImg(int propImg) {
        this.propImg = propImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getLikeCCount() {
        return likeCCount;
    }

    public void setLikeCCount(int likeCCount) {
        this.likeCCount = likeCCount;
    }

    public String getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(String replyCount) {
        this.replyCount = replyCount;
    }

    public int getContentImg() {
        return contentImg;
    }

    public void setContentImg(int contentImg) {
        this.contentImg = contentImg;
    }
}
