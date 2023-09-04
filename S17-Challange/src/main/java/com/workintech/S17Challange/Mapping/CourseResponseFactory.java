package com.workintech.S17Challange.Mapping;

import com.workintech.S17Challange.Entity.*;
public class CourseResponseFactory {
    public static CourseResponse createCourseResponse(Course course,CourseGpa low,CourseGpa medium,CourseGpa high) {
        if(course.getCredit() <=2) {
            return new CourseResponse(course, course.getCredit()*course.getGrade().getCoefficient()*((LowCourseGpa)low).getGpa());
        }else if(course.getCredit()==3) {
            return new CourseResponse(course, course.getCredit()*course.getGrade().getCoefficient()*((MediumCourseGpa) medium).getGpa());
        } else if (course.getCredit()==4) {
            return new CourseResponse(course,course.getGrade().getCoefficient() *((HighCourseGpa) high).getGpa());
        }
        return null;
    }
}
