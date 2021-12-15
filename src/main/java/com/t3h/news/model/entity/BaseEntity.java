package com.t3h.news.model.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BaseEntity {

    private int id;
    private Timestamp createDate;
    private Timestamp updateDate;
    private int creatorId;
    private int editorId;

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public int getEditorId() {
        return editorId;
    }

    public void setEditorId(int editorId) {
        this.editorId = editorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }
}
