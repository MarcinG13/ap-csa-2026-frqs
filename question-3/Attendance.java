public class Attendance {

  public int moreHistoryThanMathAbsences() {
    int result = 0;

    for ( CourseRecord historyStudent : historyList ) {
      for ( CourseRecord mathStudent : mathList) {
        if ( historyStudent.getStudentID().equals(mathStudent.getStudentID()) ) {
          if ( historyStudent.getAbsences() > mathStudent.getAbsences() ) {
            result++;
          }
        }
      }
    }
  }
  
  return result;
}
