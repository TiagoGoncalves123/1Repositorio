package com.example.handlingformsubmission;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Greeting extends HttpServlet {

    private long Pnumero = 3;
    private long Snumero = 4;
    private int tot = 0;

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public long getPnumero() {
        return Pnumero;
    }

    public void setPnumero(long Pnumero) {
        this.Pnumero = Pnumero;
    }

    public long getSnumero() {
        return Snumero;
    }

    public void setSnumero(long Snumero) {
        this.Snumero = Snumero;
    }

    public void doGet(int num1, int num2, String op) {

        if ("add".equals(op)) {
            tot = num1 + num2;
            System.out.println(tot);
        } else if ("sub".equals(op)) {
            tot = num1 - num2;
        } else if ("mul".equals(op)) {
            tot = num1 * num2;
        } else if ("div".equals(op)) {
            tot = num1 / num2;
        }
    }
}
