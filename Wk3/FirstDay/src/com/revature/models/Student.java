package com.revature.models;

public class Student implements Comparable<Student>{
    private String name;
    private int historyGrade;
    private int mathGrade;
    private int socialStudiesGrade;

    public int getMathGrade() {
        return mathGrade;
    }
    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }
    public int getSocialStudiesGrade() {
        return socialStudiesGrade;
    }
    public void setSocialStudiesGrade(int socialStudiesGrade) {
        this.socialStudiesGrade = socialStudiesGrade;
    }
    public int getHistoryGrade() {
        return historyGrade;
    }
    public void setHistoryGrade(int grade) {
        this.historyGrade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Method used to compare two objects from the same class
    //It is up to your implementation how to compare two objects but it needs to return some integer
    //However this is just comparing one field to determine the result but what if you want more than just one field
    @Override
    public int compareTo(Student student) {
        return this.historyGrade - student.getHistoryGrade();
    }
    @Override
    public String toString() {
        return "Student [historyGrade=" + historyGrade + ", mathGrade=" + mathGrade + ", name=" + name
                + ", socialStudiesGrade=" + socialStudiesGrade + "]";
    }
    
    
}