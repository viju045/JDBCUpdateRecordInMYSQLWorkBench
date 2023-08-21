/**
 * Created By VijayKumar Mohite
 * Date : 8/21/2023
 * Time : 10:21 AM
 * Project : SpringJDBCWithUpdatingRecordInDB
 **/

package org.example.domain;
//This is my first Update Record Application with MySqlWorkBench.
public class UpdateRecord {
    private int insertId;
    private String title;
    private String description;
    private int duration;
    private String status;

    public int getInsertId() {
        return insertId;
    }

    public void setInsertId(int insertId) {
        this.insertId = insertId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateRecord(int insertId, String title, String description, int duration, String status) {
        this.insertId = insertId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.status = status;
    }

    public UpdateRecord() {
    }

    @Override
    public String toString() {
        return "UpdateRecord{" +
                "insertId=" + insertId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                '}';
    }
}
