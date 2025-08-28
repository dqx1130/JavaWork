import java.util.StringJoiner;
class buildSelectSql{
    private String table;
    private String[] fields;
    public buildSelectSql(String table, String[] fields){
        this.table = table;
        this.fields = fields;
    }
    // 重写toString方法，返回SQL语句
    @Override
    public String toString(){
        StringJoiner joiner= new StringJoiner(", ");
        for (String field : fields ){
            joiner.add(field);
        }
        return "SELECT " + joiner.toString() + " FROM " + table;
    }
}
public class practise01 {
    public static void main(String[] args){
        String[] fields =  { "name", "position", "salary" };
        String table = "employee";
        buildSelectSql select = new buildSelectSql(table,fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select.toString()) ? "测试成功" : "测试失败");
    }

}

