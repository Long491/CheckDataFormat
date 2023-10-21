/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.ValidateRepository;

/**
 *
 * @author Asus
 */
public class ValidateProgram {

    ValidateRepository program;

    public ValidateProgram() {
        program = new ValidateRepository();
    }

    public void run() {
        System.out.println("====== Validate Progaram ======");
        program.Validate();
    }
}
