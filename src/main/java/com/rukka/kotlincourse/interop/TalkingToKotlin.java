package com.rukka.kotlincourse.interop;

import com.rukka.kotlincourse.classes.CustomerKotlin;
import com.rukka.kotlincourse.classes.CustomerKotlinKt;
import com.rukka.kotlincourse.classes.Status;

import java.io.IOException;

public class TalkingToKotlin {
    public void loadStats(CustomerKotlin customerKotlin) {
        try {
            customerKotlin.loadStatistics("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(1, "null", null);
        customerKotlin.setEmail("mail.gmail.com");

        String someField = customerKotlin.someField;
        customerKotlin.changeStatus();
        customerKotlin.preferential();

//        TopLevelFunctionKt.prefix("some", "value");
        UtilityClass.prefix("some", "value");
        int copyrightYear = UtilityClass.CopyrightYear;

        CustomerKotlinKt.extenrion(customerKotlin);
    }
}
