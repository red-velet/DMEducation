package com.dm.education.dto;

import com.dm.education.Model.Scores;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/5/18
 * Time: 8:13
 * Description: No Description
 */
public class ScoresDTO extends Scores {
    private Integer page;
    private Integer rows;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
