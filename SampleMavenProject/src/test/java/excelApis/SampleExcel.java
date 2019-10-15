package excelApis;

public class SampleExcel 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e1=new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata.xlsx");
		
		String data = e1.getCellData("login", "Password", 1);
		System.out.println(data);
		
		//e1.setCellData("login", 4, 3, "Failed");
		
		System.out.println(e1.getRowCount("login"));
		
		System.out.println(e1.columnCount("login"));

	}

}
