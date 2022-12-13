/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author hongd
 */
public class NewsModel {
    private int id;
    private int cateId;
    private String title;
    private String description;
    private String image;
    private LocalDate createDate;
    private String createUser;
    private LocalDate updateDate;

    public NewsModel() {
    }

    public NewsModel(int id, int cateId, String title, String description, String image, LocalDate createDate, String createUser, LocalDate updateDate) {
        this.id = id;
        this.cateId = cateId;
        this.title = title;
        this.description = description;
        this.image = image;
        this.createDate = createDate;
        this.createUser = createUser;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    
    
    
}
