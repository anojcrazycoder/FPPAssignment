package Feb_25;

public class Prog2 {
    public void getProductId(String records) {
        String[] rows = records.split(":");
        for (String row : rows) {
            String[] columns = row.split(",");
            if (columns.length > 0) {
                System.out.println(columns[0]);
            }
        }
    }
}
