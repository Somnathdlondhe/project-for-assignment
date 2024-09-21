package testUtils;

import org.apache.poi.ss.usermodel.*;
import java.io.InputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelUtils {

    public static Object[][] readExcelData(String filePath, String sheetName) throws Exception {
        try (InputStream inputStream = ExcelUtils.class.getClassLoader().getResourceAsStream(filePath)) {
            if (inputStream == null) {
                throw new IOException("Unable to find file: " + filePath);
            }

            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheet(sheetName); // Use specified sheet name
            if (sheet == null) {
                throw new IOException("Sheet not found: " + sheetName);
            }

            Iterator<Row> rowIterator = sheet.iterator();

            // Get number of rows and columns
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            Object[][] data = new Object[rowCount - 1][colCount]; // Exclude header

            int i = 0;
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                if (row.getRowNum() == 0) continue; // Skip header row
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i][j] = (cell != null) ? cell.toString() : null; // Handle nulls gracefully
                }
                i++;
            }
            return data;
        } catch (IOException e) {
            e.printStackTrace(); // Optional; log and throw
            throw e;  // Propagate exception for handling in caller
        }
    }
}