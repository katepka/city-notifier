package org.katepka.citynotifier.model;

import java.util.Date;

class Message {

    private Long id;
    private String description;
    private Date created;
    private String attachments;
    private Date solvingPeriod;
    private Date updated;
    private Location location;
    private Status status;
    private Category category;
    private Subcategory subcategory;
    private User executor;
    private User author;

    public Message() {
    }

    public Message(Long id) {
        this.id = id;
    }

    public Message(String description, Date created, String attachments,
                   Location location, Category category, Subcategory subcategory,
                   User author) {
        this.description = description;
        this.created = created;
        this.attachments = attachments;
        this.location = location;
        this.category = category;
        this.subcategory = subcategory;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public Date getSolvingPeriod() {
        return solvingPeriod;
    }

    public void setSolvingPeriod(Date solvingPeriod) {
        this.solvingPeriod = solvingPeriod;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }

    public User getExecutor() {
        return executor;
    }

    public void setExecutor(User executor) {
        this.executor = executor;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", attachments='" + attachments + '\'' +
                ", solvingPeriod=" + solvingPeriod +
                ", updated=" + updated +
                ", location=" + location +
                ", status=" + status +
                ", subcategory=" + subcategory +
                ", executor=" + executor +
                ", author=" + author +
                '}';
    }
}
