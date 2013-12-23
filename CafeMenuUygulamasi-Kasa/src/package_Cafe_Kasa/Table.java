
package package_Cafe_Kasa;

public class Table 
{
    private String tableNo, tableStatus;
    
    public Table(String tableNo, String tableStatus)
    {
        this.tableNo = tableNo;
        this.tableStatus = tableStatus;
    }
    
    public String gettableNo()
    {
        return tableNo;
    }
    public String gettableStatus()
    {
        return tableStatus;
    }
}
