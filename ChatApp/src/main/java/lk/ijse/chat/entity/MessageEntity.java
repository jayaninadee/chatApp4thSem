package lk.ijse.chat.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_cht_message")
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String message;
    private Date date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private UserEntity userEntity;

    public MessageEntity() {
    }

    public MessageEntity(long id, String message, Date date, UserEntity userEntity) {
        this.id = id;
        this.message = message;
        this.date = date;
        this.userEntity = userEntity;
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

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", userEntity=" + userEntity +
                '}';
    }
}
