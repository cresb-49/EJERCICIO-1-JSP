/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.eje_jsp_1.servlet;

import com.carlos.eje_jps_1.operacionesCalculadora;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author benjamin
 */
@WebServlet("/calcular")
public class calculos extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        double n1 = Double.parseDouble(req.getParameter("n1"));
        double n2 = Double.parseDouble(req.getParameter("n2"));
        operacionesCalculadora cal = new operacionesCalculadora();
        out.write("<h1>RESULTADO DE OPERACIONES</h1><br><br>");
        if(req.getParameter("mul")!=null){
            String mul = String.valueOf(cal.multiplicarNumeros(n1, n2));
            out.println("<h3>MULTIPLICACION:</h3>"+mul);
        }
        if(req.getParameter("sum")!=null){
            String sum = String.valueOf(cal.sumarNumeros(n1, n2));
            out.println("<h3>SUMA:</h3>"+sum);
        }
        if(req.getParameter("may")!=null){
            String may = String.valueOf(cal.obtenerMayor(n1, n2));
            out.println("<h3>MAYOR ENTRE n1 Y n2:</h3>"+may);
        }
        if(req.getParameter("pot")!=null){
            String pot = String.valueOf(cal.potenciaNumeros(n1, n2));
            out.println("<h3>POTENCIA n1^n2:</h3>"+pot);
        }
        if(req.getParameter("conv")!=null){
            ArrayList<String> conv  = cal.trasladoBinario(n1, n2);
            out.println("<h3>BINARIO DE n1:</h3>"+conv.get(0));
            out.println("<h3>BINARIO DE n2:</h3>"+conv.get(1));
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
}
