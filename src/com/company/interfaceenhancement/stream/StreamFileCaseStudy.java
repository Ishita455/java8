package com.company.interfaceenhancement.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileCaseStudy{

    public static void main(String[] a)  throws IOException {

        Stream<String> rowData = Files.lines(Paths.get(System.getProperty("user.dir")+"/"+"salesdata.csv"));
        //System.out.println(rowData);
        //Get only those data which has sales info

        // int totalRows =(int) rowData.map(x->x.split(",")).filter(arr -> arr.length>2).count();
        //System.out.println(totalRows);

        //get pizza names which have some sales data
        /*List<String[]> arrayOfSalesRowData = rowData.map(x-> x.split(",")).filter(arr-> arr.length>2).collect(Collectors.toList());
        for(String[] arrData:arrayOfSalesRowData){
            System.out.println("Pizza Name: "+arrData[0]+"Sales Data: "+arrData[1]+"Sales Data: "+arrData[2]);
        }*/

        //Categorization sales data for every pizza
        //{"Margarita":"2000":"veggie":"3000"}

        /*Map<String, Integer> salesMap =  rowData.map(row-> row.split(",")).filter(r->r.length>2).collect(Collectors.toMap(x ->x[0], y->Integer.parseInt(y[1])));
        System.out.println(salesMap);
        System.out.println("Sales of Margarita:"+salesMap.get("Margarita"));*/

        //Find the total sales for all pizza in 2020
        Optional<Integer> optionalSales = rowData.map(x->x.split(",")).filter(arr -> arr.length>2)
                .map(y-> Integer.parseInt(y[1])).reduce((p,q)->p+q);

        System.out.println("Total sales data for year 2020: "+optionalSales.get());

    }
}
