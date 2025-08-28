public class practice01 {
    static String buildInsertSql(String table, String[] fields){
        StringBuilder fieldPart = new StringBuilder();
        StringBuilder valuePart = new StringBuilder();
        fieldPart.append("(");
        valuePart.append("(");
        for(int i = 0;i <fields.length; i++){
            fieldPart.append(fields[i]);
            valuePart.append("?");
            if ( i != fields.length - 1){
                fieldPart.append(", ");
                valuePart.append(", ");
            }
        }
        fieldPart.append(")");
        valuePart.append(")");
        return "INSERT INTO "+ table + " " + fieldPart + " VALUES " + valuePart;
    }

    public static void main(String[] args){
        String[] fields = {"name","position","salary"};
        String table = "employee";
        String insert = buildInsertSql(table,fields);
        System.out.println(insert);
        String s =  "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert)?"测试成功" : "测试失败");
    }
}
