package Chapter8Challenge;

public class Setting {
  static DataAccessObject exchange(){
    return new OracleDao();
  }
}
