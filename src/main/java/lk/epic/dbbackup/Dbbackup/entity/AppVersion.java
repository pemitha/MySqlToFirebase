package lk.epic.dbbackup.Dbbackup.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "app_version", schema = "u623662090_urgent_db", catalog = "")
public class AppVersion {
    private long id;
    private int versionCode;
    private String versionName;
    private boolean active;
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
    @Column(name = "version_code")
    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    @Basic
    @Column(name = "version_name")
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Basic
    @Column(name = "active")
    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
        AppVersion that = (AppVersion) o;
        return id == that.id &&
                versionCode == that.versionCode &&
                active == that.active &&
                createdAt == that.createdAt &&
                lastUpdate == that.lastUpdate &&
                Objects.equals(versionName, that.versionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, versionCode, versionName, active, createdAt, lastUpdate);
    }
}
