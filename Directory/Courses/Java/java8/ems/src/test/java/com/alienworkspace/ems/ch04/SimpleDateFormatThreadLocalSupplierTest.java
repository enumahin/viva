package com.alienworkspace.ems.ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SimpleDateFormatThreadLocalSupplierTest {

    private final static ThreadLocal<DateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public static void main(String[] args) {

    }
}
