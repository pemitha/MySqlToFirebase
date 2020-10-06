package lk.epic.dbbackup.Dbbackup.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "news_info", schema = "u623662090_urgent_db", catalog = "")
public class NewsInfo {
    private long id;
    private String title;
    private String briefContent;
    private String fullContent;
    private String image;
    private boolean draft;
    private String status;
    private long createdAt;
    private long lastUpdate;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "brief_content")
    public String getBriefContent() {
        return briefContent;
    }

    public void setBriefContent(String briefContent) {
        this.briefContent = briefContent;
    }

    @Basic
    @Column(name = "full_content")
    public String getFullContent() {
        return fullContent;
    }

    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "draft")
    public boolean getDraft() {
        return draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "created_at")
    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "last_update")
    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsInfo newsInfo = (NewsInfo) o;
        return id == newsInfo.id &&
                draft == newsInfo.draft &&
                createdAt == newsInfo.createdAt &&
                lastUpdate == newsInfo.lastUpdate &&
                Objects.equals(title, newsInfo.title) &&
                Objects.equals(briefContent, newsInfo.briefContent) &&
                Objects.equals(fullContent, newsInfo.fullContent) &&
                Objects.equals(image, newsInfo.image) &&
                Objects.equals(status, newsInfo.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, briefContent, fullContent, image, draft, status, createdAt, lastUpdate);
    }
}
