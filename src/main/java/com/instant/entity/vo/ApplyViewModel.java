package com.instant.entity.vo;

/**
 * 系统消息展示
 * */
public class ApplyViewModel {
    private long id;
    private long uid;
    private String avatar;
    private String name;
    private String content;
    private String remark;
    private long time;
    private long group;
    private int result;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getGroup() {
        return group;
    }

    public void setGroup(long group) {
        this.group = group;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ApplyViewModel{" +
                "id=" + id +
                ", uid=" + uid +
                ", avatar='" + avatar + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", remark='" + remark + '\'' +
                ", time=" + time +
                ", group=" + group +
                ", result=" + result +
                '}';
    }
}
