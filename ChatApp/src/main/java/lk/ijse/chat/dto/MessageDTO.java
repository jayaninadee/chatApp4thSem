package lk.ijse.chat.dto;

import java.util.Date;

public class MessageDTO {
    private long id;
    private String message;
    private Date date;
    private String UserName;

    public MessageDTO() {
    }

    public MessageDTO(long id, String message, Date date, String userName) {
        this.id = id;
        this.message = message;
        this.date = date;
        UserName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", UserName='" + UserName + '\'' +
                '}';
    }
}
