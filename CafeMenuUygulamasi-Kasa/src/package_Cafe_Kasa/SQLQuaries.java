
package package_Cafe_Kasa;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

  
   //public List< Person > getAllPeople()  {
  //List< > results= null;
public class SQLQuaries {

    private static final String URL="jdbc:sqlserver://BurakBEYKURT-PC\\BEYKURTSQLSERVER"+";databasename=KAFEDEİLKBU";
    private static final String USERNAME= "sa";
    private static final String PASSWORD="1602Fener";
    private Connection connection=null;
    private String  garson_FNAME, garson_MINIT, garson_LNAME, garson_SSN, garson_BDATE, garson_ADDRESS, garson_SEX, garson_SUPERSSN, garson_STARTYEAR ;
    private String urunSonKayit;
    private float garson_SALARY;
    public PreparedStatement anaYemekleriGetir, araSicaklariGetir, salatalariGetir, 
                             kahvaltilariGetir, tatlilariGetir, icecekleriGetir, garsonlariGetir,
                             garsonEkle,garsonDuzenle,garsonSil,
                             urunleriGetir, urunEkle, urunDuzenle, urunSil,
                             masaDurumuGetir;
    ResultSet resultSet = null;
    
    public SQLQuaries(){
    try
    {
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            anaYemekleriGetir = connection.prepareStatement("SELECT FOODNAME AS [YEMEK ADI],FOODPRICE AS FİYATI FROM MENU WHERE FOODCATEGORY='ANAYEMEK' ");
            araSicaklariGetir = connection.prepareStatement("SELECT FOODNAME AS [YEMEK ADI],FOODPRICE AS FİYATI FROM MENU WHERE FOODCATEGORY='ARASICAK' ");
            salatalariGetir = connection.prepareStatement("SELECT FOODNAME AS [YEMEK ADI],FOODPRICE AS FİYATI FROM MENU WHERE FOODCATEGORY='SALATA' ");
            kahvaltilariGetir = connection.prepareStatement("SELECT FOODNAME AS [YEMEK ADI],FOODPRICE AS FİYATI FROM MENU WHERE FOODCATEGORY='KAHVALTI' ");
            tatlilariGetir = connection.prepareStatement("SELECT FOODNAME AS [YEMEK ADI],FOODPRICE AS FİYATI FROM MENU WHERE FOODCATEGORY='TATLI' ");
            icecekleriGetir = connection.prepareStatement("SELECT FOODNAME AS [YEMEK ADI],FOODPRICE AS FİYATI FROM MENU WHERE FOODCATEGORY='İÇECEK' ");
            garsonlariGetir = connection.prepareStatement("SELECT FNAME AS ADI, MINIT AS [İKİNCİ AD], LNAME AS SOYADI, SSN, BDATE AS [DOĞUM TARİHİ], ADDRESS AS ADRES, SEX AS CİNSİYET, SALARY AS MAAŞ, STARTYEAR AS [B.YILI], SUPERSSN AS [ÜST.SSN] FROM EMPLOYEE ");
            garsonEkle = connection.prepareStatement("INSERT INTO EMPLOYEE (FNAME,MINIT,LNAME,SSN,BDATE,ADDRESS,SEX,SALARY,SUPERSSN,STARTYEAR) VALUES(?,?,?,?,?,?,?,?,?,?)");
            garsonDuzenle = connection.prepareStatement("UPDATE EMPLOYEE SET FNAME=?,MINIT=?,LNAME=?,SSN=?,BDATE=?,ADDRESS=?,SEX=?,SALARY=?,SUPERSSN=?,STARTYEAR=? WHERE SSN=?");
            garsonSil = connection.prepareStatement("DELETE EMPLOYEE WHERE SSN=?");
            urunleriGetir = connection.prepareStatement("SELECT FOODID AS ID, FOODCATEGORY AS TÜR, FOODNAME AS [YEMEK ADI],FOODPRICE AS FİYATI FROM MENU");
            urunEkle = connection.prepareStatement("INSERT INTO MENU (FOODCATEGORY,FOODNAME,FOODID,FOODPRICE) VALUES(?,?,?,?)");
            urunDuzenle = connection.prepareStatement("UPDATE MENU SET FOODCATEGORY=?,FOODNAME=?,FOODPRICE=? WHERE FOODID=?");
            urunSil = connection.prepareStatement("DELETE MENU WHERE FOODID=?");
            masaDurumuGetir = connection.prepareStatement("SELECT TABLENUMBER,STATUS FROM TABLEINFO "); //WHERE TABLENUMBER = ?
            //"VALUES("+garson_FNAME+","+garson_MINIT+","+garson_LNAME+","+garson_SSN+","+garson_BDATE+","+garson_ADDRESS+","+garson_SEX+","+garson_SALARY+","+garson_SUPERSSN+","+garson_STARTYEAR+")");
            //selectPeopleByLastName=connection.prepareStatement("SELECT * FROM Adresses WHERE LastName = ?" );
          //insertNewPerson=connection.prepareStatement("INSERT INTO Adresses " + "( FirstName,LastName,Email,PhoneNumber ) " +
                   // "VALUES (?,?,?,?)");
     }
     catch(SQLException sqlException){
        sqlException.printStackTrace();
        System.exit(1);
     }
    }
 //---------------------------------------------------------------------------------------------------------------
   public int garsonEkle(String FNAME,String MINIT,String LNAME,String SSN,String BDATE, String ADDRESS,String SEX,float SALARY,String SUPERSSN,String STARTYEAR)
    {
       int result=0;
       try{
            garsonEkle.setString(1, FNAME);
            garsonEkle.setString(2, MINIT);
            garsonEkle.setString(3, LNAME);
            garsonEkle.setString(4, SSN);
            garsonEkle.setString(5, BDATE);
            garsonEkle.setString(6, ADDRESS);
            garsonEkle.setString(7, SEX);
            garsonEkle.setFloat(8, SALARY);
            garsonEkle.setString(9, SUPERSSN);
            garsonEkle.setString(10, STARTYEAR);
            
            result=garsonEkle.executeUpdate();
        }
        catch(SQLException sqlException){
         sqlException.printStackTrace();
         connectionClose();
    }
    return result;
    }
//---------------------------------------------------------------------------------------------------------------
    public int garsonDuzenle(String FNAME,String MINIT,String LNAME,String SSN,String BDATE, String ADDRESS,String SEX,float SALARY,String SUPERSSN,String STARTYEAR,String SELECTEDSSN)
    {
       int result=0;
       try{
            garsonDuzenle.setString(1, FNAME);
            garsonDuzenle.setString(2, MINIT);
            garsonDuzenle.setString(3, LNAME);
            garsonDuzenle.setString(4, SSN);
            garsonDuzenle.setString(5, BDATE);
            garsonDuzenle.setString(6, ADDRESS);
            garsonDuzenle.setString(7, SEX);
            garsonDuzenle.setFloat(8, SALARY);
            garsonDuzenle.setString(9, SUPERSSN);
            garsonDuzenle.setString(10, STARTYEAR);
            garsonDuzenle.setString(11, SELECTEDSSN);
            result=garsonDuzenle.executeUpdate();
        }
        catch(SQLException sqlException){
        sqlException.printStackTrace();
        connectionClose();
        }
    return result;
    }
//---------------------------------------------------------------------------------------------------------------    
    public int garsonSil(String SSN)
    {
        int result=0;
       try{
            garsonSil.setString(1, SSN);
            result=garsonSil.executeUpdate();
        }
        catch(SQLException sqlException){
        sqlException.printStackTrace();
        connectionClose();
        }
    return result;
    }
    //---------------------------------------------------------------------------------------------------------------    
    public int urunEkle(String FOODCATEGORY,String NAME,int FOODID,float FOODPRICE)
    {
       int result=0;
       try{
            urunEkle.setString(1, FOODCATEGORY);
            urunEkle.setString(2, NAME);
            urunEkle.setInt(3, FOODID);
            urunEkle.setFloat(4, FOODPRICE);
            
            result=urunEkle.executeUpdate();
        }
        catch(SQLException sqlException){
         sqlException.printStackTrace();
         connectionClose();
    }
    return result;
    }
//---------------------------------------------------------------------------------------------------------------
    public int urunDuzenle(String FOODCATEGORY,String NAME,int FOODID,float FOODPRICE)
    {
       int result=0;
       try{
            urunDuzenle.setString(1, FOODCATEGORY);
            urunDuzenle.setString(2, NAME);
            urunDuzenle.setFloat(3, FOODPRICE);
            urunDuzenle.setInt(4, FOODID);
            
            result=urunDuzenle.executeUpdate();
        }
        catch(SQLException sqlException){
         sqlException.printStackTrace();
         connectionClose();
    }
    return result;
    }
    
//---------------------------------------------------------------------------------------------------------------  
    public ArrayList<Table> returnTableInfo()//String tableNo
    {
        String status = null;
        String number = null;
        
        ArrayList<Table> table = new ArrayList<Table>();
        /*try {
            masaDurumuGetir.setString(1, tableNo);
        } catch (SQLException ex) {
            Logger.getLogger(SQLQuaries.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        try {
            resultSet = masaDurumuGetir.executeQuery();
            while(resultSet.next())
            {
                status = resultSet.getString("STATUS");
                number = resultSet.getString("TABLENUMBER");
                table.add(new Table(number,status));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SQLQuaries.class.getName()).log(Level.SEVERE, null, ex);
        }
        return table;
    }
 //---------------------------------------------------------------------------------------------------------------    
    public DefaultTableModel tabloAta(PreparedStatement preparedStatement)
    {
        DefaultTableModel model = new DefaultTableModel()
            { public boolean isCellEditable(int row, int column){  return false;  } };
        try 
        {
            resultSet = preparedStatement.executeQuery();
            ResultSetMetaData rowdata= resultSet.getMetaData();
            int kolonSayisi = rowdata.getColumnCount();
            String[] kolon = new String [kolonSayisi];
            for(int j=0; j<kolonSayisi; j++)
                kolon[j] = rowdata.getColumnName(j+1);
            
            model.setColumnIdentifiers(kolon);
            while(resultSet.next())
            {
                Object[] o = new Object[kolonSayisi];
                for(int j=0; j<kolonSayisi; j++)
                {
                    o[j]=resultSet.getObject(j+1);
                    if(j==0)
                        urunSonKayit = resultSet.getObject(j+1).toString(); 
                }
                model.addRow(o);
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(JPanel_Urunler.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try{
              resultSet.close();
            }
             catch(SQLException sqlException){
                sqlException.printStackTrace();
            }
        }
        return model;
    }
 //---------------------------------------------------------------------------------------------------------------
    public String returnUrunSonKayit()
    {
        return urunSonKayit;
    }
 //---------------------------------------------------------------------------------------------------------------
    public void connectionClose(){
    try{
        connection.close();
    }
    catch(SQLException sqlException)
    {
          sqlException.printStackTrace();
    }
}
} 
 
     
 
