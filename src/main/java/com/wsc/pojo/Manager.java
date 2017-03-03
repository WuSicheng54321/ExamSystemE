package com.wsc.pojo;

/**
 * Created by wsc on 17-1-13.
 */
public class Manager {
    private int id;
    private int managerId;

    private int createStudent;
    private int createTeacher;
    private int createPaper;
    private int createQuestion;
    private int createResult;
    private int createTheClass;

    private int deleteStudent;
    private int deleteTeacher;
    private int deletePaper;
    private int deleteQuestion;
    private int deleteResult;
    private int deleteTheClass;

    private int updateStudent;
    private int updateTeacher;
    private int updatePaper;
    private int updateQuestion;
    private int updateResult;
    private int updateTheClass;

    private int queryStudent;
    private int queryTeacher;
    private int queryPaper;
    private int queryQuestion;
    private int queryResult;
    private int queryTheClass;

    private int managerState;

    public Manager() {
    }

    public Manager(int id,int managerId,int createStudent, int createTeacher, int createPaper, int createQuestion, int createResult, int createTheClass, int deleteStudent, int deleteTeacher, int deletePaper, int deleteQuestion, int deleteResult, int deleteTheClass, int updateStudent, int updateTeacher, int updatePaper, int updateQuestion, int updateResult, int updateTheClass, int queryStudent, int queryTeacher, int queryPaper, int queryQuestion, int queryResult, int queryTheClass, int managerState) {
        this.id=id;
        this.managerId=managerId;
        this.createStudent = createStudent;
        this.createTeacher = createTeacher;
        this.createPaper = createPaper;
        this.createQuestion = createQuestion;
        this.createResult = createResult;
        this.createTheClass = createTheClass;
        this.deleteStudent = deleteStudent;
        this.deleteTeacher = deleteTeacher;
        this.deletePaper = deletePaper;
        this.deleteQuestion = deleteQuestion;
        this.deleteResult = deleteResult;
        this.deleteTheClass = deleteTheClass;
        this.updateStudent = updateStudent;
        this.updateTeacher = updateTeacher;
        this.updatePaper = updatePaper;
        this.updateQuestion = updateQuestion;
        this.updateResult = updateResult;
        this.updateTheClass = updateTheClass;
        this.queryStudent = queryStudent;
        this.queryTeacher = queryTeacher;
        this.queryPaper = queryPaper;
        this.queryQuestion = queryQuestion;
        this.queryResult = queryResult;
        this.queryTheClass = queryTheClass;
        this.managerState = managerState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getCreateStudent() {
        return createStudent;
    }

    public void setCreateStudent(int createStudent) {
        this.createStudent = createStudent;
    }

    public int getCreateTeacher() {
        return createTeacher;
    }

    public void setCreateTeacher(int createTeacher) {
        this.createTeacher = createTeacher;
    }

    public int getCreatePaper() {
        return createPaper;
    }

    public void setCreatePaper(int createPaper) {
        this.createPaper = createPaper;
    }

    public int getCreateQuestion() {
        return createQuestion;
    }

    public void setCreateQuestion(int createQuestion) {
        this.createQuestion = createQuestion;
    }

    public int getCreateResult() {
        return createResult;
    }

    public void setCreateResult(int createResult) {
        this.createResult = createResult;
    }

    public int getCreateTheClass() {
        return createTheClass;
    }

    public void setCreateTheClass(int createTheClass) {
        this.createTheClass = createTheClass;
    }

    public int getDeleteStudent() {
        return deleteStudent;
    }

    public void setDeleteStudent(int deleteStudent) {
        this.deleteStudent = deleteStudent;
    }

    public int getDeleteTeacher() {
        return deleteTeacher;
    }

    public void setDeleteTeacher(int deleteTeacher) {
        this.deleteTeacher = deleteTeacher;
    }

    public int getDeletePaper() {
        return deletePaper;
    }

    public void setDeletePaper(int deletePaper) {
        this.deletePaper = deletePaper;
    }

    public int getDeleteQuestion() {
        return deleteQuestion;
    }

    public void setDeleteQuestion(int deleteQuestion) {
        this.deleteQuestion = deleteQuestion;
    }

    public int getDeleteResult() {
        return deleteResult;
    }

    public void setDeleteResult(int deleteResult) {
        this.deleteResult = deleteResult;
    }

    public int getDeleteTheClass() {
        return deleteTheClass;
    }

    public void setDeleteTheClass(int deleteTheClass) {
        this.deleteTheClass = deleteTheClass;
    }

    public int getUpdateStudent() {
        return updateStudent;
    }

    public void setUpdateStudent(int updateStudent) {
        this.updateStudent = updateStudent;
    }

    public int getUpdateTeacher() {
        return updateTeacher;
    }

    public void setUpdateTeacher(int updateTeacher) {
        this.updateTeacher = updateTeacher;
    }

    public int getUpdatePaper() {
        return updatePaper;
    }

    public void setUpdatePaper(int updatePaper) {
        this.updatePaper = updatePaper;
    }

    public int getUpdateQuestion() {
        return updateQuestion;
    }

    public void setUpdateQuestion(int updateQuestion) {
        this.updateQuestion = updateQuestion;
    }

    public int getUpdateResult() {
        return updateResult;
    }

    public void setUpdateResult(int updateResult) {
        this.updateResult = updateResult;
    }

    public int getUpdateTheClass() {
        return updateTheClass;
    }

    public void setUpdateTheClass(int updateTheClass) {
        this.updateTheClass = updateTheClass;
    }

    public int getQueryStudent() {
        return queryStudent;
    }

    public void setQueryStudent(int queryStudent) {
        this.queryStudent = queryStudent;
    }

    public int getQueryTeacher() {
        return queryTeacher;
    }

    public void setQueryTeacher(int queryTeacher) {
        this.queryTeacher = queryTeacher;
    }

    public int getQueryPaper() {
        return queryPaper;
    }

    public void setQueryPaper(int queryPaper) {
        this.queryPaper = queryPaper;
    }

    public int getQueryQuestion() {
        return queryQuestion;
    }

    public void setQueryQuestion(int queryQuestion) {
        this.queryQuestion = queryQuestion;
    }

    public int getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(int queryResult) {
        this.queryResult = queryResult;
    }

    public int getQueryTheClass() {
        return queryTheClass;
    }

    public void setQueryTheClass(int queryTheClass) {
        this.queryTheClass = queryTheClass;
    }

    public int getManagerState() {
        return managerState;
    }

    public void setManagerState(int managerState) {
        this.managerState = managerState;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        else if(obj.getClass()==Manager.class){
            Manager manager=(Manager) obj;
            if(manager.getManagerId()==managerId&&manager.getCreatePaper()==createPaper&&manager.getCreateQuestion()==createQuestion&&manager.getCreateResult()==createResult&&
                    manager.getCreateStudent()==createStudent&&manager.getCreateTeacher()==createTeacher&&manager.getCreateTheClass()==createTeacher&&
                    manager.getDeletePaper()==deletePaper&&manager.getDeleteQuestion()==deleteQuestion&&manager.getDeleteResult()==deleteResult&&
                    manager.getDeleteStudent()==deleteStudent&&manager.getDeleteTeacher()==deleteTeacher&&manager.getDeleteTheClass()==deleteTheClass&&
                    manager.getUpdatePaper()==updatePaper&&manager.getUpdateQuestion()==updateQuestion&&manager.getUpdateResult()==updateResult&&
                    manager.getUpdateStudent()==updateStudent&&manager.getUpdateTeacher()==updateTeacher&&manager.getUpdateTheClass()==updateTheClass&&
                    manager.getQueryPaper()==queryPaper&&manager.getQueryQuestion()==queryQuestion&&manager.getQueryPaper()==queryPaper&&
                    manager.getQueryStudent()==queryStudent&&manager.getQueryTeacher()==queryTeacher&&manager.getQueryTheClass()==queryTheClass&&
                    manager.getManagerState()==managerState){
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", createStudent=" + createStudent +
                ", createTeacher=" + createTeacher +
                ", createPaper=" + createPaper +
                ", createQuestion=" + createQuestion +
                ", createResult=" + createResult +
                ", createTheClass=" + createTheClass +
                ", deleteStudent=" + deleteStudent +
                ", deleteTeacher=" + deleteTeacher +
                ", deletePaper=" + deletePaper +
                ", deleteQuestion=" + deleteQuestion +
                ", deleteResult=" + deleteResult +
                ", deleteTheClass=" + deleteTheClass +
                ", updateStudent=" + updateStudent +
                ", updateTeacher=" + updateTeacher +
                ", updatePaper=" + updatePaper +
                ", updateQuestion=" + updateQuestion +
                ", updateResult=" + updateResult +
                ", updateTheClass=" + updateTheClass +
                ", queryStudent=" + queryStudent +
                ", queryTeacher=" + queryTeacher +
                ", queryPaper=" + queryPaper +
                ", queryQuestion=" + queryQuestion +
                ", queryResult=" + queryResult +
                ", queryTheClass=" + queryTheClass +
                ", managerState=" + managerState +
                '}';
    }
}
