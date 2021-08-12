package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class Calculator {
    @GetMapping("/")
    String getIndex() {
        return "index.jsp";
    }

    @PostMapping("/calculator")
    String calculatorR(HttpServletRequest request, Model model) {
        float txtFOperand = Float.parseFloat(request.getParameter("txtFOperand"));
        float txtSOperand = Float.parseFloat(request.getParameter("txtSOperand"));
        char operator = request.getParameter("operator").charAt(0);
        float Result = Calculator.calculator(txtFOperand, txtSOperand, operator);
        model.addAttribute("Result", Result);
        return "rs.jsp";
    }

    public static float calculator(float txtFOperand, float txtSOperand, char operator) {
        switch (operator) {
            case '+':
                return txtFOperand + txtSOperand;
            case '-':
                return txtFOperand - txtSOperand;
            case '*':
                return txtFOperand * txtSOperand;
            case '/':
                if (txtSOperand != 0) {
                    return txtFOperand / txtSOperand;
                } else {
                    throw new RuntimeException("khong the chia cho 0");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }

}
