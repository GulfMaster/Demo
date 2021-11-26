package com.wenbo.demo.poi;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

/**
 * @author: liwenbo
 * @date: 2021-09-22 17:11:51
 * @desc: POI demo
 */
public class ExcelTemplateDemo {
    public static void main(String[] args) {
        writeExcelFile("writedFile.xlsx");
    }
    public static void writeExcelFile(String filename) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\运营数据指标v1.2.xlsx");
        XSSFWorkbook workbook = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (Exception e) {
        }
        //查找到指定的sheet
        XSSFSheet sheet = workbook.getSheet("平台-业务指标统计");
        sheet.setForceFormulaRecalculation(true);

        XSSFRow row = sheet.getRow(4);
        System.out.println(row);

        //从第三列开始进行，并以7天为一个周期循环找列数
        XSSFCell cell = row.getCell(0);
//        cell.setCellType(XSSFCell.CELL_TYPE_NUMERIC);
        cell.setCellValue("张三");
        XSSFCell cell2 = row.getCell(1);
        cell2.setCellValue("二三四");


        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            workbook.write(bos);
            File outfile = new File(filename);
            FileOutputStream fileOutputStream = new FileOutputStream(outfile);
            fileOutputStream.write(bos.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("excel文件生成完成");
    }
}
