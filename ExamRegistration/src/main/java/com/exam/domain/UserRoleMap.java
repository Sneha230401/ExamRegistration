package com.exam.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Role_Map")

public class UserRoleMap {
    @Id
    @Column(name = "User_ID")
    private Long userID;

    @Id
    @Column(name = "Role_ID")
    private Long roleID;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }
}
