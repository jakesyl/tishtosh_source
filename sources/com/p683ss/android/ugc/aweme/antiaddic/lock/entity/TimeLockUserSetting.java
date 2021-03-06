package com.p683ss.android.ugc.aweme.antiaddic.lock.entity;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting */
public class TimeLockUserSetting implements Serializable {
    private boolean isContentFilterOn;
    private boolean isContentFilterOnV2;
    private transient boolean isNotifyParentModeOnly;
    private boolean isTimeLockOn;
    private long lastSetTime;
    private int lockTimeInMin = 120;
    private String password;
    private String userId;

    public long getLastSetTime() {
        return this.lastSetTime;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isContentFilterOn() {
        return this.isContentFilterOn;
    }

    public boolean isNotifyParentModeOnly() {
        return this.isNotifyParentModeOnly;
    }

    public boolean isTimeLockOn() {
        return this.isTimeLockOn;
    }

    public int getLockTimeInMin() {
        if (this.lockTimeInMin <= 30) {
            return 40;
        }
        return this.lockTimeInMin;
    }

    public int hashCode() {
        if (this.userId != null) {
            return this.userId.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TimeLockUserSetting{userId='");
        sb.append(this.userId);
        sb.append('\'');
        sb.append(", lastSetTime=");
        sb.append(this.lastSetTime);
        sb.append(", password='");
        sb.append(this.password);
        sb.append('\'');
        sb.append(", isTimeLockOn=");
        sb.append(this.isTimeLockOn);
        sb.append(", isContentFilterOn=");
        sb.append(this.isContentFilterOn);
        sb.append('}');
        return sb.toString();
    }

    public void setContentFilterOn(boolean z) {
        this.isContentFilterOn = z;
    }

    public void setLastSetTime(long j) {
        this.lastSetTime = j;
    }

    public void setLockTimeInMin(int i) {
        this.lockTimeInMin = i;
    }

    public void setNotifyParentModeOnly(boolean z) {
        this.isNotifyParentModeOnly = z;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setTimeLockOn(boolean z) {
        this.isTimeLockOn = z;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeLockUserSetting timeLockUserSetting = (TimeLockUserSetting) obj;
        if (this.userId != null) {
            return this.userId.equals(timeLockUserSetting.userId);
        }
        if (timeLockUserSetting.userId == null) {
            return true;
        }
        return false;
    }
}
