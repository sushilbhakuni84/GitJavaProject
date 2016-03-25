import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class FileReadJXL {

	public static void main(String[] args) throws BiffException, IOException {

		
		
    File file = new File("D:\\EmpInfo.xls");
    Workbook wb = Workbook.getWorkbook(file);
    Sheet sh = wb.getSheet("EmpData");
    Cell[] cell = sh.getColumn(0);
    
    for(Cell value : cell)
    {
    	System.out.println("values="+value.getContents());
    }
       Cell[] cell1 = sh.getColumn(1);
    
    for(Cell value : cell1)
    {
    	System.out.println("values="+value.getContents());
    }
	}

}
