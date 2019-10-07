package excelApis;

public class Excel_001 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e1=new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata.xlsx");
		String val1 = e1.getCellData("login", 1, 3);
		System.out.println(val1);
		
		System.out.println(e1.getCellData("login", "UserName", 1));
		
		//e1.setCellData("login", 4, 1, "Passed");
		
		System.out.println(e1.getRowCount("login"));
		System.out.println(e1.columnCount("login"));

	}

}
