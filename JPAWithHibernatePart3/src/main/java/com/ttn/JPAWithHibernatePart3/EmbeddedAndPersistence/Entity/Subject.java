package com.ttn.JPAWithHibernatePart3.EmbeddedAndPersistence.Entity;

public class Subject {

  private String subjectName;

  public Subject() {

  }

  public Subject(String subjectName) {
    this.subjectName = subjectName;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }
}
