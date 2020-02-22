package br.com.foursolutions.mercado;

public class StringBuild {

    public static void main(String[] args) {
        String v = "diego";
        System.out.println(v.substring(0, 1).toUpperCase().concat(v.substring(1)));
    }
}
