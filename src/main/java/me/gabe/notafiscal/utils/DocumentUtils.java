package me.gabe.notafiscal.utils;

public class DocumentUtils {

        public static Boolean isCnpj(String document) {
            return document.length() == 14;
        }

        public static Boolean isCpf(String document) {
            return document.length() == 11;
        }
}