package cn.javacodes.blogwaver.core.model;

import cn.javacodes.blogwaver.core.model.enumeration.UserStatus;
import cn.javacodes.blogwaver.core.model.enumeration.UserType;

import java.util.Date;

/**
 * blogwaver
 * cn.javacodes.blogwaver.core.model
 *
 * @author huzhanfei
 * @version 1.0
 * @since 2018/01/20
 */
public class User {
    private Long id;

    private String username;

    private String password;

    private String email;

    private String nickname;

    private Date createTime;

    private Date updateTime;

    private String activationKey;

    private UserStatus status;

    private UserType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey == null ? null : activationKey.trim();
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }
}