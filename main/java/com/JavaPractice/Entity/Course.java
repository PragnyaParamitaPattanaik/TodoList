package com.JavaPractice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	
	@Entity
	@Table(name = "courses_table")
	public class Course {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	    private String name;
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Course(int id, String name, String description, String status, String username) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.status = status;
			this.username = username;
		}
		

		public Course() {
			super();
		}


		private String description;
	    private String status;

	    @Column(name = "username")
	    private String username;
	}
