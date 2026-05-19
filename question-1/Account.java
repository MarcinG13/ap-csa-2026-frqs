public class Account {

  private String username;

  // PART A
  public Account(String requestedName) {
    if (isAvailable(requestedName)) {
      username = requestedName;
    } else {
      int num = 1;
      String temp = requestedName + num;
      while (!isAvailable(temp)) {
        num++;
        temp = requestedName + num;
      }
      username = temp;
    }
  
  }

  public String getShortenedName() {
    String result = username;
    while (result.indexOf("-")!=-1) {
      int loc = result.indexOf("-");

      result = result.substring(0,loc-1) + result.substring(loc+1);
    }
    return result
  }

}
