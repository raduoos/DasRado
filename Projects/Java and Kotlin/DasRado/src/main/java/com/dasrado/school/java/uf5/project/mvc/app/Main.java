package com.dasrado.school.java.uf5.project.mvc.app;

import com.dasrado.school.java.uf5.project.mvc.controller.Controller;
import com.dasrado.school.java.uf5.project.mvc.model.Model;
import com.dasrado.school.java.uf5.project.mvc.view.View;

import javax.swing.*;
import java.util.Locale;

public class Main {

    //The execution of the program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //We define the culture of our application.
                Locale.setDefault(new Locale("en","US"));
                try {
                    new Controller(new Model(), new View());
                } catch (MyException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
