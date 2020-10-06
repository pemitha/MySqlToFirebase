package lk.epic.dbbackup.Dbbackup.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Fcm {
    private long id;
    private String device;
    private String osVersion;
    private String appVersion;
    private String serial;
    private String regid;
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
    @Column(name = "device")
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Basic
    @Column(name = "os_version")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Basic
    @Column(name = "app_version")
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Basic
    @Column(name = "serial")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Basic
    @Column(name = "regid")
    public String getRegid() {
        return regid;
    }

    public void setRegid(String regid) {
        this.regid = regid;
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
        Fcm fcm = (Fcm) o;
        return id == fcm.id &&
                createdAt == fcm.createdAt &&
                lastUpdate == fcm.lastUpdate &&
                Objects.equals(device, fcm.device) &&
                Objects.equals(osVersion, fcm.osVersion) &&
                Objects.equals(appVersion, fcm.appVersion) &&
                Objects.equals(serial, fcm.serial) &&
                Objects.equals(regid, fcm.regid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, device, osVersion, appVersion, serial, regid, createdAt, lastUpdate);
    }
}
