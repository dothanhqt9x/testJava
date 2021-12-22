package com.t3h.news.model;


import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
public abstract class BaseModel {
    private int id;

    private Timestamp createDate;

    private Timestamp updateDate;

    private int creatorId;

    private int editorId;
}