package com.example.averla;
/*

This class match string query
This query

 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SrinMatch {
    private String mx;
    private Pattern p;
    private Matcher m;

    public SrinMatch(String mx) {
        this.mx = mx;
        // this.p = Pattern.compile("[a-z]*[hi+nese|hi|hinse|chine]");
        // this.m = p.matcher(mx);
    }

    public boolean getM() {

        // Pattern p = Pattern.compile("[a-z]*[hi+nese|hi|hinse|chine]");
         Matcher m = p.matcher(mx);

        return this.m.matches();
    }

    public String  checkMAtch(){
        Alist list = new Alist();
      // Menu1 m1 = new Menu1();
        String lup = "(h|h a|hai|ha  it|ha i  ti|t ai|w|we|wes|we st|in|ind i|ind ies|ind ian|in d|a|af|a fr|afri|af ric|afr ic a|afr ican|soma  lia" +
                     "|c|cu|cub|cuba|cuban|cu bai|cu ba in|j|ja|j am|jam a|jam ai|ja m aic|ja m aica|ja m ai can)";
        //  list.add(0, lup);

        //Arrays arr =  Arrays.binarySearch

        this.p = Pattern.compile(lup, Pattern.COMMENTS);
        String tol = mx.toLowerCase().trim();
        this.m = p.matcher(tol);

        //   m.region(0,4);
        // String tol = mx.toLowerCase();
         if (m.matches()/*Pattern.matches(lup, tol) && mx.equals("afr") || mx.equals("afri") || mx.equals("africa") || mx.equals("african")*/) {

            return mx.toLowerCase();
        }

      //  else if(Pattern.matches(lup, mx) && mx.equals("hai") || mx.equals("hait") || mx.equals("ha") || mx.equals("haiti")) {

       //     return "Haiti Restaurent";
      //  }

        else
            return "No such result";
    }
}

