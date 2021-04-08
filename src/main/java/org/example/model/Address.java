package org.example.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address", schema = "testCascade")
public class Address implements Serializable {

    @Id
    private Long id;

    @Column(name = "city")
    private String city;


    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
