package system.model.questions;

import system.controller.tools.DataToolkit;
import system.dao.Idable;
import system.model.questions.QuestionType;

import javax.sql.rowset.serial.SerialBlob;
import java.io.Serializable;
import java.util.LinkedList;

public class Question implements Serializable, Idable {

    private String id;
    private QuestionType questionType;
    private String questionText, questionImage;
    private LinkedList<String> answerTexts;
    private LinkedList<String> answerImages;
    private LinkedList<Boolean> correctAnswers;
    private String category, subcategory, subsubcategory;
    private String teacher;

    Question() {
        this.id = DataToolkit.getUniqueId();
    }

    Question(String id) {
        this.id = id;
    }

    public Question(Question q) {
        this.id = q.id;
        this.questionType = q.questionType;
        this.questionText = q.questionText;
        this.questionImage = q.questionImage;
        this.answerTexts = q.answerTexts;
        this.answerImages = q.answerImages;
        this.correctAnswers = q.correctAnswers;
    }

    public Question(String id, QuestionType questionType, String questionText, String questionImage, LinkedList<String> answerTexts, LinkedList<String> answerImages, LinkedList<Boolean> correctAnswers) {
        this.id = id;
        this.questionType = questionType;
        this.questionText = questionText;
        this.questionImage = questionImage;
        this.answerTexts = answerTexts;
        this.answerImages = answerImages;
        this.correctAnswers = correctAnswers;
    }

    public Question(QuestionType questionType, String questionText, String questionImage, LinkedList<String> answerTexts, LinkedList<String> answerImages, LinkedList<Boolean> correctAnswers) {
        this.id = DataToolkit.getUniqueId();
        this.questionType = questionType;
        this.questionText = questionText;
        this.questionImage = questionImage;
        this.answerTexts = answerTexts;
        this.answerImages = answerImages;
        this.correctAnswers = correctAnswers;
    }

    public Question(String id, QuestionType questionType, String questionText, String questionImage, LinkedList<String> answerTexts, LinkedList<String> answerImages, LinkedList<Boolean> correctAnswers, String category, String subcategory, String subsubcategory) {
        this.id = id;
        this.questionType = questionType;
        this.questionText = questionText;
        this.questionImage = questionImage;
        this.answerTexts = answerTexts;
        this.answerImages = answerImages;
        this.correctAnswers = correctAnswers;
        this.category = category;
        this.subcategory = subcategory;
        this.subsubcategory = subsubcategory;
    }

    public Question(QuestionType questionType, String questionText, String questionImage, LinkedList<String> answerTexts, LinkedList<String> answerImages, LinkedList<Boolean> correctAnswers, String category, String subcategory, String subsubcategory) {
        this.id = DataToolkit.getUniqueId();
        this.questionType = questionType;
        this.questionText = questionText;
        this.questionImage = questionImage;
        this.answerTexts = answerTexts;
        this.answerImages = answerImages;
        this.correctAnswers = correctAnswers;
        this.category = category;
        this.subcategory = subcategory;
        this.subsubcategory = subsubcategory;
    }

    public Question(String id, QuestionType questionType, String questionText, String questionImage, LinkedList<String> answerTexts, LinkedList<String> answerImages, LinkedList<Boolean> correctAnswers, String category, String subcategory, String subsubcategory, String teacher) {
        this.id = id;
        this.questionType = questionType;
        this.questionText = questionText;
        this.questionImage = questionImage;
        this.answerTexts = answerTexts;
        this.answerImages = answerImages;
        this.correctAnswers = correctAnswers;
        this.category = category;
        this.subcategory = subcategory;
        this.subsubcategory = subsubcategory;
        this.teacher = teacher;
    }

    public Question(QuestionType questionType, String questionText, String questionImage, LinkedList<String> answerTexts, LinkedList<String> answerImages, LinkedList<Boolean> correctAnswers, String category, String subcategory, String subsubcategory, String teacher) {
        this.id = DataToolkit.getUniqueId();
        this.questionType = questionType;
        this.questionText = questionText;
        this.questionImage = questionImage;
        this.answerTexts = answerTexts;
        this.answerImages = answerImages;
        this.correctAnswers = correctAnswers;
        this.category = category;
        this.subcategory = subcategory;
        this.subsubcategory = subsubcategory;
        this.teacher = teacher;
    }

    public String changeId() {
        this.id = DataToolkit.getUniqueId();
        return this.id;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionImage() {
        return questionImage;
    }

    public void setQuestionImage(String questionImage) {
        this.questionImage = questionImage;
    }

    public LinkedList<String> getAnswerTexts() {
        return answerTexts;
    }

    public void setAnswerTexts(LinkedList<String> answerTexts) {
        this.answerTexts = answerTexts;
    }

    public LinkedList<String> getAnswerImages() {
        return answerImages;
    }

    public void setAnswerImages(LinkedList<String> answerImages) {
        this.answerImages = answerImages;
    }

    public LinkedList<Boolean> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(LinkedList<Boolean> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getSubsubcategory() {
        return subsubcategory;
    }

    public void setSubsubcategory(String subsubcategory) {
        this.subsubcategory = subsubcategory;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
