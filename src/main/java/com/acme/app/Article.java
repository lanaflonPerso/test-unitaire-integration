package com.acme.app;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Article implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;

    @Temporal(TemporalType.TIMESTAMP)
    private Date publicationDate;

    @Lob
    @Column(columnDefinition = "VARCHAR", length = 65535)
    private String excerpt;

    @Lob
    @Column(columnDefinition = "VARCHAR", length = 65535)
    private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getExcerpt() {
		return excerpt;
	}

	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
