/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.ValidateDAO;

/**
 *
 * @author Asus 
 */
public class ValidateRepository implements IValidateRepository {

    @Override
    public void Validate() {
        ValidateDAO.Instance().Validate();
    }

}
